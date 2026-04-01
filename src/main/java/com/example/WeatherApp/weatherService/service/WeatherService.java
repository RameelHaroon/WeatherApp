package com.example.WeatherApp.weatherService.service;

import com.example.WeatherApp.weatherService.client.WeatherServiceApiClient;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WeatherService {

    private final WeatherServiceApiClient client;

    @Cacheable(value = "weather", key = "#location")
    public String getWeather(String location){
        return  client.getWeather(location);
    }

}
