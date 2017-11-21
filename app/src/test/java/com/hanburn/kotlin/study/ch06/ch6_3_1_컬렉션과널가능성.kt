package com.hanburn.kotlin.study.ch06

import org.junit.Test
import java.io.BufferedReader
import java.io.StringReader

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_3_1_컬렉션과널가능성 {

    fun readNumbers(reader: BufferedReader): List<Int?> {
        val result = ArrayList<Int?>() // 널이 될수 있는 Int? 으로 만든 리스트
        for (line in reader.lineSequence()) {
            try {
                val number = line.toInt()
                result.add(number) // 널이 아닌 값을 리스트에 추가
            } catch (e: NumberFormatException) {
                result.add(null) // 널을 리스트에 추가
            }
        }
        return result
    }

    fun addValidNumbers(numbers: List<Int?>) {
        var sumOfValidNumbers = 0
        var invalidNumbers = 0
        for (number in numbers) {
            if (number != null) {
                sumOfValidNumbers += number
            } else {
                invalidNumbers++
            }
        }
        println("Sum of valid numbers: $sumOfValidNumbers")
        println("Invalid numbers: $invalidNumbers")
    }

    @Test
    fun test1() {
        val reader = BufferedReader(StringReader("1\nabc\n42\nh"))
        val numbers = readNumbers(reader)
        addValidNumbers(numbers)
    }
}