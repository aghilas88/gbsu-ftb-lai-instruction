package com.kata.gbsuftblai.enum

enum class GbsuFtbLaiEnum(val label: String, val number: Int) {
    GBSU("Gbsu",  3),
    FTB("Ftb", 5),
    LAI("Lai", 7);

    companion object {
        fun fromInt(value: Int) = values().find { it.number == value }
    }

    override fun toString(): String {
        return label
    }
}