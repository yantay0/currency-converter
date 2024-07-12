package kz.madina.pet.converter.model;

import lombok.Getter;

@Getter
public enum ExpenseCategory {
    GOODS(1),
    SERVICES(2);
    private int id;

    ExpenseCategory(int id) {
        this.id = id;
    }

    public static ExpenseCategory getType(Integer id) {
        if (id == null) {
            return null;
        }

        for (ExpenseCategory category : ExpenseCategory.values()) {
            if (id.equals(category.getId())) {
                return category;
            }
        }
        throw new IllegalArgumentException("No matching type for id" + id);
    }

}
