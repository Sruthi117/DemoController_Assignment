package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @GetMapping("/remove")
    public ResponseEntity<String> removeFirstAndLast(@RequestParam String input) {
        if (input == null || input.length() < 2) {
            return ResponseEntity.badRequest().body("Input must contain at least 2 characters");
        }
        if (input.length() == 2) {
            return ResponseEntity.ok("");
        }
        return ResponseEntity.ok(input.substring(1, input.length() - 1));
    }
}
