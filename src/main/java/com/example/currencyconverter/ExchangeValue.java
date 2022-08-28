package com.example.currencyconverter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

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
    @Column(name="conversion_multiple", precision = 10, scale = 5)
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
