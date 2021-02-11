package com.practice.praktika.controller;

import com.practice.praktika.model.Weather;
import com.practice.praktika.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private TestService testService;

    @GetMapping
    public List<Weather> getWeatherJSON() {
        return testService.test();
    }
}
