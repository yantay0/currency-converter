package kz.madina.pet.converter.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import kz.madina.pet.converter.model.Currency;
import java.math.BigDecimal;
@Entity
@Table(name = "account")
public class AccountEntity extends BaseEntity{

    @Column(nullable = false, unique = true, length = 10)
    private Long accountNumber;
    private Integer currency;
    @Column(nullable = false, scale = 2)
    private BigDecimal balance;
    public Currency getCurrency() {
        return Currency.getType(this.currency);
    }
    public void setCurrency(Currency currency) {
        if (currency == null) {
            this.currency = null;
        } else {
            this.currency = currency.getId();
        }
    }
}
