package kz.madina.pet.converter.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "exchange_rate")
public class ExchangeRateEntity extends BaseEntity{
    private String currencyPair;
    private LocalDate date;
    private double closeEx;
    private double previous_close;

}
