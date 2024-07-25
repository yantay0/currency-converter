package kz.madina.pet.converter.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private String accountNumber;
    private Integer currency;
    private BigDecimal balance;
}
