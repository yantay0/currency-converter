package kz.madina.pet.converter.service;

import kz.madina.pet.converter.model.entity.ExchangeRateEntity;
import kz.madina.pet.converter.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeRateService {
    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    public void saveExchangeRates(String pair, double close, double previous_close) {
        ExchangeRateEntity rate = new ExchangeRateEntity();
        rate.set
    }
}
