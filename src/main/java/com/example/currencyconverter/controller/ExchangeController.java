package com.example.currencyconverter.controller;

import com.example.currencyconverter.entity.ExchangeValue;
import com.example.currencyconverter.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {
    @Value("${server.port}")
    private int port;
    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){

        ExchangeValue value = repository.findByFromAndTo(from, to);
        value.setPort(port);

        return value;
    }
}
