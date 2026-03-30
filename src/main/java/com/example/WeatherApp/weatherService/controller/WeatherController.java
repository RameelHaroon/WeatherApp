package com.example.WeatherApp.weatherService.controller;

import com.example.WeatherApp.weatherService.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(WeatherController.BASE_URL)
@RequiredArgsConstructor
public class WeatherController {
    public static final String BASE_URL = "api/weatherService";
    public static final String V1_WEATHER = "/v1/weather/{location}";

    private final WeatherService weatherService;

    @GetMapping(V1_WEATHER)
    public  String getWeather(@PathVariable String location){
        return weatherService.getWeather(location);
    }

}
