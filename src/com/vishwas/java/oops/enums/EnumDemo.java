package com.vishwas.java.oops.enums;

// Defining the Enum
enum Difficulty {
    LOW,
    MEDIUM,
    HIGH
}

enum CoffeeSize {
    // These calls act like constructor calls
    SMALL(150),
    MEDIUM(250),
    LARGE(400);

    // Private field
    private final int ml;

    // Constructor (Must be private or package-private)
    CoffeeSize(int ml) {
        this.ml = ml;
    }

    // Public method
    public int getMilliliters() {
        return ml;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        // Using the Enum
        Difficulty myLevel = Difficulty.MEDIUM;

        // Enums work great with Switch statements
        switch (myLevel) {
            case LOW:
                System.out.println("Relaxing mode.");
                break;
            case MEDIUM:
                System.out.println("Balanced challenge.");
                break;
            case HIGH:
                System.out.println("Good luck, you'll need it!");
                break;
        }

        System.out.println("------------------------");
        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println(size + " is " + size.getMilliliters() + "ml");
        }
    }
}