package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_1_9_널가능타입확장 {

    /**
     *  - 널이 될수 있는 타입에 대한 확장함수를 호춣할때는 안전한 호출을 안해도 된다
     */

    fun verifyUserInput(input: String?) {
        if (input.isNullOrBlank()) { // 안전한 호출을 하지 않아도 된다.
            println("Please fill in the required fields")
        }
    }

    @Test
    fun test() {
        verifyUserInput(" ")
        verifyUserInput(null)
    }


}