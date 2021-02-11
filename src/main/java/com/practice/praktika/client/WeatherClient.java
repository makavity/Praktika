package com.practice.praktika.client;

import com.practice.praktika.model.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "WeatherClient", url = "https://apidata.mos.ru")
public interface WeatherClient {

    @GetMapping("/v1/datasets/60667/rows")
    public List<Weather> getStopListRules(@RequestParam("api_key") String api_key);
}
