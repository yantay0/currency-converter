package kz.madina.pet.converter.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
    private Long accountFrom;
    private Long accountTo;
    private Integer currency;
    private BigDecimal sum;
    private LocalDateTime dateTime;
    private Integer expenseCategory;
}
