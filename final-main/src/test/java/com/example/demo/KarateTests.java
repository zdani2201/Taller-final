package com.example.demo;

import com.intuit.karate.junit5.Karate;

public class KarateTests {

    @Karate.Test
    Karate testTopic() {
        return Karate.run("classpath:com.tdea.final/karate");
    }
}
