package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_1_4_엘비스연산자 {

    /**
     * ?:
     *  - 호출하는 값이 null인경우 기본값을 제공하는 목적
     *  - 이항연산자로, 좌항값이 null이 아니면 좌항값을, null이면 우항값을 리턴한다
     */
    fun strLenSafe(s: String?): Int = s?.length ?: 0


    @Test
    fun test1() {
        println(strLenSafe("abc"))
        println(strLenSafe(null))
    }

    /**
     * - return, throw 등에도 사용 가능함
     * - 함수의 pre-condition 체크시 유용함
     */

    class Address(val streetAddress: String, val zipCode: Int,
                  val city: String, val country: String)

    class Company(val name: String, val address: Address?)

    class Person(val name: String, val company: Company?)

    fun printShippingLabel(person: Person) {
        val address = person.company?.address ?: throw IllegalArgumentException("No address")
        with(address) {
            println(streetAddress)
            println("$zipCode $city, $country")
        }
    }

    @Test
    fun test2() {
        val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
        val jetbrains = Company("JetBrains", address)
        val person = Person("Dmitry", jetbrains)
        printShippingLabel(person)
        printShippingLabel(Person("Alexey", null))
    }


}