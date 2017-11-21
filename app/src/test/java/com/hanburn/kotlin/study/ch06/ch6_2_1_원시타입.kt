package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_2_1_원시타입 {

    /**
     *  Java
     *   - primitive type : int, boolean
     *   - reference type : Integer, Boolean
     */


    /**
     *  Kotlin
     *   - 타입구분없이 항상 같은것으로 사용
     *   - 실행 시점에 가장 효율적인 타입으로 변경됨
     */

    @Test
    fun test2() {
        val i: Int = 2
        val list: List<Int> = listOf(1, 2, 3)
    }

}