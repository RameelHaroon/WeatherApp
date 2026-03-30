package com.example.WeatherApp.weatherService.service;

import com.example.WeatherApp.weatherService.client.WeatherServiceApiClient;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WeatherService {

    private final WeatherServiceApiClient client;

    public String getWeather(String location){
        return  client.getWeather(location);
    }

}
