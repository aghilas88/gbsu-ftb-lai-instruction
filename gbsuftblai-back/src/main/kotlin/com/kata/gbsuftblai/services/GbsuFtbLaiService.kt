package com.kata.gbsuftblai.services

import com.kata.gbsuftblai.enum.GbsuFtbLaiEnum
import org.springframework.stereotype.Component
import java.util.*

@Component
class GbsuFtbLaiService {

    companion object {
        val DIVISION_GROUP: EnumSet<GbsuFtbLaiEnum> = EnumSet.of(GbsuFtbLaiEnum.GBSU, GbsuFtbLaiEnum.FTB)
        val CONTAINS_GROUP: EnumSet<GbsuFtbLaiEnum> = EnumSet.of(GbsuFtbLaiEnum.GBSU, GbsuFtbLaiEnum.FTB, GbsuFtbLaiEnum.LAI)
    }

    fun convertNumber(inputNumber: Int): String {
        var result = DIVISION_GROUP.asSequence()
                .filter { gbsuFtbLaiEnum -> inputNumber % gbsuFtbLaiEnum.number == 0 }
                .joinToString(separator = "")

        result += inputNumber.toString()
                .map(Character::getNumericValue)
                .filter { CONTAINS_GROUP.contains(GbsuFtbLaiEnum.fromInt(it)) }
                .map { GbsuFtbLaiEnum.fromInt(it) }
                .joinToString(separator = "")

        return result.ifEmpty { inputNumber.toString() }
    }

}