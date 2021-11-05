package com.example.demo.citiesapi.countries;


import com.example.demo.citiesapi.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")

public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    public List<Country> countries(){
        return repository.findAll();
}

}
