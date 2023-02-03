package com.example.testgithubactions.controller;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class TestControllerTest {

    @Test
    void test() {
        TestController testController = new TestController();

        ResponseEntity<String> result = testController.test();
        ResponseEntity<String> expected = ResponseEntity.ok("Ok");

        assertEquals(expected, result);
    }
}
