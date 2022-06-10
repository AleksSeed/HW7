package ru.geekbrains.testrunner;

public enum Priority {
    Pr1(1), Pr2(2), Pr3(3), Pr4(4), Pr5(5), Pr6(6), Pr7(7), Pr8(8), Pr9(9), Pr10(10);

    private final int value;

    Priority(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Priority highest() {
        return Pr10;
    }

    public static Priority lowest() {
        return Pr1;
    }

    public static Priority medium() {
        return Pr5;
    }
}
