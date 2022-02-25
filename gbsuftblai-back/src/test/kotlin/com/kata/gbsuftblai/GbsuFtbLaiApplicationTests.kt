package com.kata.gbsuftblai

import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GbsuFtbLaiApplicationTests {

    private val service: GbsuFtbLaiService = GbsuFtbLaiService()

    @Test
    fun contextLoads() {
    }

    @Test
    fun should_retourn_GbsuFtbFtb_when_15() {
        Assertions.assertEquals("GbsuFtbFtb", service.convertNumber(15))
    }

    @Test
    fun should_retourn_GbsuGbsuGbsu_when_33() {
        Assertions.assertEquals("GbsuGbsuGbsu", service.convertNumber(33));
    }

    @Test
    fun should_retourn_1_when_1() {
        Assertions.assertEquals("1", service.convertNumber(1));
    }

}
