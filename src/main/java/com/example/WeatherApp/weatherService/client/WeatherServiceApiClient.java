package com.example.WeatherApp.weatherService.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class WeatherServiceApiClient {

    private String apiKey;
    private String baseUrl;
    private RestClient restClient;

    public WeatherServiceApiClient(
            @Value("${visualcrossing.api.key}") String apiKey,
            @Value("${visualcrossing.api.base-url}") String baseUrl) {

        this.apiKey = apiKey;
        this.baseUrl = baseUrl;

        this.restClient = RestClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("Accept", "application/json")
                .build();
    }

    public String getWeather(String location) {

        return restClient.get()
                .uri("/{location}?unitGroup=metric&include=current&contentType=json&key={apiKey}",
                        location, apiKey)
                .retrieve()
                .body(String.class);
    }
}
