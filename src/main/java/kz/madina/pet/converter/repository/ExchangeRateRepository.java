package kz.madina.pet.converter.repository;

import kz.madina.pet.converter.model.entity.ExchangeRateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRateEntity, Long> {
}
