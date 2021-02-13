package com.practice.praktika.service;

import com.practice.praktika.client.WeatherClient;
import com.practice.praktika.entity.WeatherEntity;
import com.practice.praktika.model.Weather;
import com.practice.praktika.repository.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@EnableScheduling
@Service
public class TestService {

    private WeatherRepo weatherRepo;
    private WeatherClient weatherClient;

    public List test() {
        return (List<WeatherEntity>) weatherRepo.findAll();
    }

    public Optional getById(Long id) {

        return (Optional) weatherRepo.findById(id);
    }

    @Scheduled(fixedDelay = 3600000)
    public void updateTable() {
        String api_key = "2c29ee50b30e5202fa15b6d1616e0aa4";
        List<Weather> weathers = null;

        if (weatherRepo.count() < weatherClient.rowsCount(api_key)) {
            weathers = weatherClient.getStopListRules(api_key, weatherRepo.count());

            for (int i = 0; i < weathers.size(); i++) {

                WeatherEntity weatherEntity = new WeatherEntity();
                weatherEntity.setForecastDate(weathers.get(i).getCells().getForecastDate());
                weatherEntity.setMinimumTemperature(weathers.get(i).getCells().getMinimumTemperature());
                weatherEntity.setMaximumTemperature(weathers.get(i).getCells().getMaximumTemperature());
                weatherEntity.setNotes(weathers.get(i).getCells().getNotes());
                weatherRepo.save(weatherEntity);
            }
        }
    }


    @Autowired
    public TestService(WeatherClient weatherClient, WeatherRepo weatherRepo) {
        this.weatherClient = weatherClient;
        this.weatherRepo = weatherRepo;
    }

}
