package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_3_5_배열 {

    /**
     *  - 배열사용 : 접근시 [index] 이용
     */

    fun printArray(args: Array<String>) {
        for (i in 0 until args.size step 1) {
            println("Argument $i is: ${args[i]}")
        }
        println("")

        for (i in args.indices) { // 확장함수 : 배열의 인덱스 값의 범위에 대해서 이터레이션하는
            println("Argument $i is: ${args[i]}")
        }
        println("")

        args.forEachIndexed { index, element ->
            println("Argument $index is: $element")
        }
    }

    @Test
    fun test1() {
        val list = arrayOf("1", "3", "5")
        printArray(list)
    }

    /**
     *  배열생성
     *   - Array 생성자 : 배열크기와 람다를 받아서 생성한다
     *   - arrayOf()
     *   - arrysOfNulls() : 모든원소가 null 로
     */

    @Test
    fun test2() {
        val letters = Array<String>(26) { i -> ('a' + i).toString() }
        println(letters.joinToString(""))
    }

    /**
     *  원시타입 배열
     */
    @Test
    fun test3() {
        val numbers = intArrayOf(1, 3, 5, 7)
        val chars = charArrayOf('a', 'b', 'c')
        val strings = listOf("a", "b", "c")

        val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
        println(squares.joinToString(", "))
    }

}