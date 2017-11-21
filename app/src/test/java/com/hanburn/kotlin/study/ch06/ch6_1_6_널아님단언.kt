package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_1_6_널아님단언 {

    /**
     * !!
     *  - null이 될 수 없는 타입으로 변환해준다.
     *  - null에 대해서 !!를 적용하면 NPE가 발생한다.
     */

    fun ignoreNull(s: String?) {
        val notNull: String = s!!
        println("leng:" + notNull.length);
    }


    @Test
    fun test1() {
        ignoreNull("venti")
        ignoreNull(null)
    }


}