package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_1_7_let함수 {


    /**
     * let 함수
     *  - 수신받은 객체를 전달받은 람다에게 넘긴다.
     *  - null이 가능한 값을 null이 불가능한 함수파라미터에 넘길때 유용하게 사용가능
     *
     */
    fun sendEmailTo(email: String) {
        println("Sending email to $email")
    }


    @Test
    fun test1() {
        val email: String? = "hanburn@snowcorp.com";

        // null 체크후 호출해야함
        if (email != null)
            sendEmailTo(email);

        // let을 이용해서
        email?.let { email -> sendEmailTo(email) }

        // 짧게
        email?.let { sendEmailTo(it) }
    }

    ///////////////////////////////////////////////////////////////////////////

    class Person(val email: String)

    fun getTheBestPersonInTheWorld(): Person? = Person("hanburn@naver.com")
    fun getNull(): Person? = null

    @Test
    fun test2() {
        //
        val person: Person? = getTheBestPersonInTheWorld()
        if (person != null)
            sendEmailTo(person.email)

        // 반환값이 null이 아닌경우는 실행
        getTheBestPersonInTheWorld()?.let { sendEmailTo(it.email) }

        // null 이면 실행 안함
        getNull()?.let { sendEmailTo(it.email) }
    }


}