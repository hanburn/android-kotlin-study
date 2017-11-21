package com.hanburn.kotlin.study.ch06

import org.junit.Test

/**
 * Created by hanburn on 2017. 11. 15..
 */

class ch6_3_2_읽기전용과변경가능성 {

    /**
     * 코틀린
     *  - 읽기전용 인터페이스와 쓰기가능한 인터페이스를 분리함
     *  - kotlin.collections.Collection
     *  - kotlin.collections.MutableCollection
     */

    fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
        for (item in source) {
            target.add(item)
        }
    }

    @Test
    fun test1() {
        val source: Collection<Int> = arrayListOf(3, 5, 7)
        val target: MutableCollection<Int> = arrayListOf(1)
        copyElements(source, target)
        println(target)
    }

    /**
     * 주의 : 읽기 전용 인터페이스라고 해서 꼭 변경 불가능한 컬력션은 아니다
     *  - 즉, 읽기전용 컬렉션은 thread-safe하지 않다
     */

    @Test
    fun test2() {
        val list1: MutableCollection<Int> = arrayListOf(1, 3, 5, 7, 9)
        val list2: Collection<Int> = list1

        println(list2)
        list1.remove(1)
        println(list2)
    }


}