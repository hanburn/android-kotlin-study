package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_1_11_플랫폼타입 {

    /**
     *  자바의 @Nullable String => 코틀린의 String?
     *  자바의 @NotNull String => 코틀린의 String
     */


    /**
     *  - 코틀린이 널 관련 정보를 알 수 없는 타입
     *  - 자바타입을 코틀린에서 사용할때
     */

    fun yellAt(person: Person) {
        println(person.name.toUpperCase() + "!!!")
    }

    fun yellAtSafe(person: Person) {
        println((person.name ?: "Anyone").toUpperCase() + "!!!")
    }

    @Test
    fun test1() {
        yellAtSafe(Person(null))
        yellAt(Person(null))
    }
}