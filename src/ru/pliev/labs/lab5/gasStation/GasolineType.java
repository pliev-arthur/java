package ru.pliev.labs.lab5.gasStation;

public enum GasolineType {
    TYPE_92(92),
    TYPE_95(95),
    TYPE_98(98);

    private final int value;

    GasolineType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static GasolineType fromInt(int value) {
        for (GasolineType type : values()) {
            if (type.value == value) {
                return type;
            }
        }
        throw new IllegalArgumentException("Неизвестная марка бензина: " + value);
    }
}