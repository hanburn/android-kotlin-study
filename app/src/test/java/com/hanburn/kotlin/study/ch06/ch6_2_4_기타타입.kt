package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_2_4_기타타입 {

    /**
     *  Any
     *   - 최상위 타입 ( Java의 Object )
     *   - Int 타입의 조상
     *   - 널이 될수 없는 타입
     *   - 널이 필요하면 Any? 를 사용
     */

    @Test
    fun test1() {
        val answer: Any = 42
        println(answer)
    }

    /**
     *  Unit
     *   - 자바의 void와 같은 기능
     *   - 다른점 : 타입 파라미터의 인자로 사용 가능 ( Void )
     */

    interface Processor<T> {
        fun process(): T
    }

    class NoResultProcessor : Processor<Unit> {
        override fun process() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

    /**
     * Nothing
     *  - 이 함수는 결코 정상적으로 끝나지 않는다
     *
     */

    fun fail(message: String): Nothing {
        throw IllegalStateException(message)
    }

    @Test
    fun test2() {
        fail("error occurred")
    }
}