package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_1_5_안전한캐스트 {

    /**
     * as?
     *  - as 연산자는 자바와 마찬가지로 캐스트를 할 수 없으면 ClassCastException이 발생한다
     *  - as? 연산자는 캐스트를 할 수 없으면 null을 반환한다
     */

    class Person(val firstName: String, val lastName: String) {
        override fun equals(other: Any?): Boolean {
            val otherPerson = other as? Person ?: return false

            return otherPerson.firstName == firstName && otherPerson.lastName == lastName
        }

        override fun hashCode(): Int =
                firstName.hashCode() * 37 + lastName.hashCode()
    }


    @Test
    fun test1() {
        val p1 = Person("Han", "SangChul")
        val p2 = Person("Park", "ByungSun")
        println(p1 == p2)
        println(p1.equals(p2))
        println(p1.equals(null))
    }
}