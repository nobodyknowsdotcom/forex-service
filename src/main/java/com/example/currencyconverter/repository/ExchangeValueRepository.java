package com.example.currencyconverter.repository;

import com.example.currencyconverter.entity.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
    ExchangeValue findById(long id);
}
