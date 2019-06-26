package com.company.abitcard.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Individual_achievements implements EnumClass<String> {


    individual_achievements1("1"),
    individual_achievements2("2"),
    individual_achievements3("3"),
    individual_achievements4("4"),
    individual_achievements5("5"),
    individual_achievements6("6"),
    individual_achievements7("7"),
    individual_achievements8("8"),
    individual_achievements9("9"),
    individual_achievements10("10"),
    individual_achievements11("11"),
    individual_achievements12("12"),
    individual_achievements13("13"),
    individual_achievements14("14"),
    individual_achievements15("15"),
    individual_achievements16("16"),
    individual_achievements17("17");

    private String id;

    Individual_achievements(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Individual_achievements fromId(String id) {
        for (Individual_achievements at : Individual_achievements.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}