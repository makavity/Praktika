package com.practice.praktika.service;

import com.practice.praktika.client.WeatherClient;
import com.practice.praktika.entity.WeatherEntity;
import com.practice.praktika.model.Weather;
import com.practice.praktika.repository.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private WeatherRepo weatherRepo;
    private WeatherClient weatherClient;

    public List test() {

        List<Weather> weathers = weatherClient.getStopListRules("2c29ee50b30e5202fa15b6d1616e0aa4");

        for(int i =0;i<weathers.size();i++){

            WeatherEntity weatherEntity = new WeatherEntity();
            weatherEntity.setForecastDate(weathers.get(i).getCells().getForecastDate());
            weatherEntity.setMinimumTemperature(weathers.get(i).getCells().getMinimumTemperature());
            weatherEntity.setMaximumTemperature(weathers.get(i).getCells().getMaximumTemperature());
            weatherEntity.setNotes(weathers.get(i).getCells().getNotes());
            weatherRepo.save(weatherEntity);
        }

        return weathers;
    }

    @Autowired
    public TestService(WeatherClient weatherClient, WeatherRepo weatherRepo) {
        this.weatherClient = weatherClient;
        this.weatherRepo = weatherRepo;
    }

}
