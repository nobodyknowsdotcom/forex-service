package com.example.currencyconverter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@Entity
@Table(name="exchange_value")
public class ExchangeValue {
    @Id
    private long id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")
    private String to;
    private BigDecimal conversionMultiple;
    @Setter
    private int port;

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiplier){
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiplier;
    }
}
