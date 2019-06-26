package com.company.abitcard.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum First_education implements EnumClass<String> {

    Да("Да"),
    Нет("Нет");

    private String id;

    First_education(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static First_education fromId(String id) {
        for (First_education at : First_education.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}