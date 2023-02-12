package com.example.testgithubactions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public ResponseEntit<String> test() {

        final var testVar = "Test Var";

        return ResponseEntity.ok("Ok");
    }
}
