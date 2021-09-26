package ru.aokruan.skba.utils

import ru.aokruan.skba.R

object Utils {

    fun getTypeColor(type: String): Int {
        return when (type) {
            "black" -> R.color.black
            "white" -> R.color.white
            else -> R.color.white
        }
    }
}