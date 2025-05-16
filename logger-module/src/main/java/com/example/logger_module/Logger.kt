package com.example.logger_module

import android.util.Log

class Logger {

    fun log(message: String) {
        Log.i("I_AM_LIB", "\uD83C\uDF55: $message")
    }

}