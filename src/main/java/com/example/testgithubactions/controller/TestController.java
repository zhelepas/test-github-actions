package com.example.testgithubactions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<String> test() {

        final var testVar = "Test Var1";

        return ResponseEntity.ok("Ok");
    }
}
