package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_1_1_null {

    fun strLen(s: String) = s.length

    @Test
    fun test1() {
        //strLen(null) // 컴파일 오류
    }

    fun strLenSafe(s: String?): Int =
            if (s != null) s.length else 0


    @Test
    fun test2() {
        strLenSafe(null)
    }

}