package kz.madina.pet.converter.model.entity;

import jakarta.persistence.*;
import kz.madina.pet.converter.model.Currency;
import kz.madina.pet.converter.model.ExpenseCategory;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
public class TransactionEntity extends BaseEntity{
    @ManyToOne
    @JoinColumn(nullable = false)
    private AccountEntity accountFrom;
    @ManyToOne
    @JoinColumn(nullable = false)
    private AccountEntity accountTo;
    private Integer currency;
    @Column(nullable = false, scale = 2)
    private BigDecimal sum;
    private LocalDateTime dateTime;
    private Integer expenseCategory;
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
    public ExpenseCategory getExpenseCategory() {
        return ExpenseCategory.getType(this.expenseCategory);
    }
    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        if (expenseCategory == null) {
            this.expenseCategory = null;
        } else {
            this.expenseCategory = expenseCategory.getId();
        }
    }
}
