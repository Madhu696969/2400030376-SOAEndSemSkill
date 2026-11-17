package com.example.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class DataController {
    @GetMapping("/data")
    public Map<String, String> getData() {
        return Map.of(
            "message", "service is running",
            "status", "Success"
        );
    }
}