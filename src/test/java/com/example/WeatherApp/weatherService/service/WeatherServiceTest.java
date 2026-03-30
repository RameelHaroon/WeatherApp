package com.example.WeatherApp.weatherService.service;

import com.example.WeatherApp.weatherService.client.WeatherServiceApiClient;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static reactor.core.publisher.Mono.when;

class WeatherServiceTest {

    @Mock
    private WeatherServiceApiClient client;

    private final static String CORRECT_LOCATION = "Lahore";
    private final static String INCORRECT_LOCATION = "Lafore";

    @Test
    public void test_successfulResponseFromApi() {

        // Given
        // When
        // Then
    }

    @Test
    public void test_unsuccessfulResponseFromApi(){

        // Given
        // When
        // Then
    }

}