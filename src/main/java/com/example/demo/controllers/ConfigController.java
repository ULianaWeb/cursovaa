package com.example.demo.controllers;

import com.example.demo.models.MeterConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    private MeterConfig config = new MeterConfig(0, 8000, 1000, "<div>RPM</div><span>x1000</span>", 30, 330, "RPM");

    @GetMapping("/config")
    public MeterConfig getConfig() {
        return config;
    }

    @PostMapping("/config")
    public MeterConfig updateConfig(@RequestBody MeterConfig newConfig) {
        config = newConfig;
        return config;
    }
}

