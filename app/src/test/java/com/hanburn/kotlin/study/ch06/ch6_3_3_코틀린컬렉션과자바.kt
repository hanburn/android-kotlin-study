package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_3_3_코틀린컬렉션과자바 {

    /**
     *  - 코틀린에서 블변타입을 전달해도 자바쪽에서 컬렉션을 변경할 여지가 있면..
     *  - 아예 넘길때 변경가능한 컬렉션 타입을 넘기는 것이 더 좋다.
     *
     */

    fun printInUppercase(list: List<String>) {
        println(CollectionUtils.uppercaseAll(list))
    }

    @Test
    fun test1() {
        val list = listOf("a", "b", "c")
        printInUppercase(list)
        println(list)
    }

}