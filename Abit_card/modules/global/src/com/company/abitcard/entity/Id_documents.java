package com.company.abitcard.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Id_documents implements EnumClass<String> {

    Passport("Passport"),
    International_passport("International_passport");

    private String id;

    Id_documents(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Id_documents fromId(String id) {
        for (Id_documents at : Id_documents.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}