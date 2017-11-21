package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_2_3_숫자변환 {

    /**
     *  Kotlin
     *   - 숫자를 다른타입으로 자동 변환하지 않는다
     */

    @Test
    fun test1() {
        val i = 1
        //val l1: Long = i  // compile error
        val l2: Long = i.toLong()
    }

    /**
     *  같은 타입에 대해서 비교한다
     */

    @Test
    fun test2() {
        val x = 1
        val list = listOf(1L, 2L, 3L)
        //println(x in list) // compile error
        println(x.toLong() in list)
    }


    /**
     *
     */

    fun foo(l: Long) = println(l)

    @Test
    fun test3() {
        val b: Byte = 1
        val l = b + 1L
        foo(b.toLong())
        foo(l)
        foo(42)
    }

}