package com.hanburn.kotlin

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MainActivity : Activity() {

    val TAG = "hanburn";
    val TAG2: String? = "hanburn2"


    fun strLen(s: String): Int {
        return s.length
    }

    fun strLenSafe(s: String?): Int {
        //return s.length;
        return if (s != null) s.length else 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(TAG, "strLenSafe:" + strLenSafe(null))
        Log.e(TAG, "strLenSafe:" + strLenSafe("abc"))
        Log.e(TAG, "strLenSafe:" + strLenSafe(TAG))


        Log.e(TAG, "strLen:" + strLen("abc"))
        //Log.e(TAG, "strLen:" + strLen(null))
        //Log.e(TAG, "strLen:" + strLen(TAG2))
    }
}
