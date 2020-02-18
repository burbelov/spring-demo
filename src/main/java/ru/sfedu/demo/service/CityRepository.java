package ru.sfedu.demo.service;

import ru.sfedu.demo.model.City;
import org.springframework.data.repository.Repository;

import java.util.List;

interface CityRepository extends Repository<City, Long> {

    City findByNameAndCountryAllIgnoringCase(String name, String country);
    List<City> findAll();

}
