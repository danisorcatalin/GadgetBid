package com.gadget.dao.entity.enums;

public enum Role {

    ADMIN("ADMIN"),
    ACCOUNT_MANAGER("ACCOUNT_MANAGER"),
    USER("USER");

    private String value;

    Role(String value) {
        this.value = value;
    }

    public static Role fromValue(String value) {
        for (Role b : Role.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

}
