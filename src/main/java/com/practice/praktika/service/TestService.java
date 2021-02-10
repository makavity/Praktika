package com.practice.praktika.service;

import com.practice.praktika.client.WeatherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private WeatherClient weatherClient;

    public List test() {
        return weatherClient.getStopListRules("2c29ee50b30e5202fa15b6d1616e0aa4");
    }

    @Autowired
    public TestService(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

}
