package com.hanburn.kotlin.study.ch06

import junit.framework.Assert
import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_1_8_lateinit {

    /**
     *  - 보통은 생성자에서 모든 property를 초기화 해야 한다.
     *  - 초기값을 제공할수 없으면 널이 가능한 타입으로 해야한다. ( 나중 사용시 널체크를 해야하는 불편함 )
     *
     */

    class MyService {
        fun action(): String = "foo"
    }

    // lazyInit이 필요한 상황
    class MyTest {
        private var myService: MyService? = null

        fun setUp() {
            myService = MyService()
        }

        fun use() {
            myService?.action() // !! 나 ?. 을 사용해야 한다
            myService!!.action() // !! 나 ?. 을 사용해야 한다
        }
    }

    // lateinit 사용하면..
    class MyTest2 {
        private lateinit var myService: MyService
        //private lateinit val myService2: MyService

        fun setUp() {
            // 만약 초기화를 안하면 ??
            myService = MyService()
        }

        fun use() {
            myService.action() // null체크 없이 쓸수 있다
        }
    }

    @Test
    fun test() {
        Assert.assertEquals("foo", MyTest().use())
        Assert.assertEquals("foo", MyTest2().use())
    }
}