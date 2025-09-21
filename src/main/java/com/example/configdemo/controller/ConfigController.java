package com.example.configdemo.controller;

import com.example.configdemo.config.AppProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    private final AppProperties appProperties;

    // Inject single property directly
    @Value("${app.name}")
    private String appNameFromValue;

    public ConfigController(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @GetMapping("/config/value")
    public String getUsingValue() {
        return "App Name (using @Value): " + appNameFromValue;
    }

    @GetMapping("/config/properties")
    public String getUsingConfigurationProperties() {
        return "App Name: " + appProperties.getName() +
               ", Version: " + appProperties.getVersion() +
               ", Greeting: " + appProperties.getGreeting();
    }
}
