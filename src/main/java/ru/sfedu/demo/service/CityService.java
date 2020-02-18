package ru.sfedu.demo.service;

import ru.sfedu.demo.model.City;

import java.util.List;

public interface CityService {

    City getCity(String name, String country);
    List<City> findAll();

}