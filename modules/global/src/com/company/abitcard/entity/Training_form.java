package com.company.abitcard.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Training_form implements EnumClass<String> {

    Очная("Очная"),
    Заочная("Заочная");
    private String id;

    Training_form(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Training_form fromId(String id) {
        for (Training_form at : Training_form.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}