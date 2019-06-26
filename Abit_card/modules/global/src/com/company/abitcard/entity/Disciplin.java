package com.company.abitcard.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Disciplin implements EnumClass<String> {

    Математика("Математика"),
    Русский_язык("Русский язык"),
    Информатика("Информатика"),
    Физика("Физика"),
    Химия("Химия"),
    Иностранный_язык("Иностранный язык "),
    Биология("Биология"),
    География("География"),
    Обществознание("Обществознание"),
    Литература("Литература"),
    История("История");
    private String id;

    Disciplin(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Disciplin fromId(String id) {
        for (Disciplin at : Disciplin.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}