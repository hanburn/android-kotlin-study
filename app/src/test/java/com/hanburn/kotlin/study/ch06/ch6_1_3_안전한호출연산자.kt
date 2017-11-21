package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_1_3_안전한호출연산자 {

    /**
     * ?.
     *  - 호출하는 값이 null이면 호출이 무시되고 null을 반환한다
     */
    fun printWithUpper(s: String?) {
        val upper: String? = s?.toUpperCase();
        println(upper)
    }

    @Test
    fun test1() {
        printWithUpper("abc")
        printWithUpper(null)
    }

}