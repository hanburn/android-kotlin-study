package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_2_2_널이될수있는원시타입 {

    /**
     *  Java
     *   - primitive type : int, boolean
     *   - reference type : Integer, Boolean
     */


    data class Person(val name: String, val age: Int? = null) {
        fun isOlderThan(other: Person): Boolean? {
            if (age == null || other.age == null)
                return null
            return age > other.age
        }
    }


    @Test
    fun test1() {
        val sam = Person("Sam", 35)
        val amy = Person("Amy", 42)
        val jame = Person("Jame")

        println(sam.isOlderThan(amy))
        println(sam.isOlderThan(jame))
    }
}