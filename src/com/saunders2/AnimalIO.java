package com.saunders2;

public class AnimalIO {
    private String input;

    public AnimalIO(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public static Integer convertToInteger(String input) {
        int num = 0;
        try {
            num = Integer.parseInt(input);
            System.out.println(num + " is an integer");

        }catch (NumberFormatException e) {
            System.out.println(e + "is not an integer");
        }
        return num;
    }

    public static Boolean convertToBoolean(String input) {
        boolean bool = false;
        try {
            bool = Boolean.parseBoolean(input);
            System.out.println(bool + " is a boolean");

        }catch (NumberFormatException e) {
            System.out.println(e + "is not a boolean");
        }
        return bool;
    }
}
