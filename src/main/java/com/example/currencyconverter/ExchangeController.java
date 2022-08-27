package com.example.currencyconverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {
    @Value("${server.port}")
    private int port;
    private final ExchangeValueRepository repository;

    @Autowired
    public ExchangeController(ExchangeValueRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){

        ExchangeValue value = repository.findByFromAndTo(from, to);
        value.setPort(port);

        return value;
    }

    @GetMapping("/count")
    public long retrieveDatabaseCount(){
        return repository.count();
    }
}
