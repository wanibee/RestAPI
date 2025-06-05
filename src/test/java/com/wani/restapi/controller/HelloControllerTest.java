package com.wani.restapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloControllerTest {

    @Test
    void helloTest(){
        // given

        // when
        int a = 1;
        int b = 2;


        // then
        assertEquals(1, a+b);
    }

}
