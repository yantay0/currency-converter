package kz.madina.pet.converter.model;

import lombok.Getter;

@Getter
public enum Currency {
    KZT(1),
    RUB(2),
    USD(3),
    EUR(4);

    private int id;

    Currency(int id) {
        this.id = id;
    }

    public static Currency getType(Integer id) {
        if (id == null) {
            return null;
        }

        for (Currency currency : Currency.values()) {
            if (id.equals(currency.getId())) {
                return currency;
            }
        }
        throw new IllegalArgumentException("No matching type for id" + id);
    }

}
