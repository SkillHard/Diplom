package com.company.abitcard.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Gender implements EnumClass<String> {

    Мужской("Мужской"),
    Женский("Женский");

    private String id;

    Gender(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Gender fromId(String id) {
        for (Gender at : Gender.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}