package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_1_10_타입파라미터 {

    /**
     *  - 코틀린에서 함수나 클래스의 모든 타입파리미터는 널이 될 수 있다
     */

    fun <T> printHashCode(t: T) {
        println(t?.hashCode())  // t가 널이될수 있으므로 안전한 호출을 사용해야한다
    }

    @Test
    fun test1() {
        printHashCode(null)
    }

    /**
     *  - 타입파라미터를 널이 될 수 없게 하기
     *  - Any에서 상속받은 타입으로 한정하면 된다
     */

    fun <T : Any> printHashCode2(t: T) {
        print(t.hashCode())
    }

    @Test
    fun test2() {
        //printHashCode2(null)
    }


}