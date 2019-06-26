package com.company.abitcard.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Education_form implements EnumClass<String> {

    Платная("Платная"),
    Бюджет("Бюджет");

    private String id;

    Education_form(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Education_form fromId(String id) {
        for (Education_form at : Education_form.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}