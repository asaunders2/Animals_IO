package com.saunders2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AnimalIO {
    private String input;

    public AnimalIO(String input) {
        this.input = input;
    }

    public static Cat addCat() throws IOException {
        String name = "";
        int miceKilled = 0;

        BufferedReader inStream = new BufferedReader (new InputStreamReader(System.in));

        System.out.print("Enter your Cat's name: ");
        try{
            name = inStream.readLine();
        } catch(IOException e){
            System.out.println(e + " is not a string");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of mice killed ");
        try{
            miceKilled = scanner.nextInt();
        }catch (NumberFormatException e){
            System.out.println(e + " is not an integer");
        }

        return new Cat(miceKilled, name);
    }

    public static Dog addDog() throws IOException {
        String name = "";
        boolean friendly = true;

        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your Dog's's name: ");
        try {
            name = inStream.readLine();
        } catch (IOException e) {
            System.out.println(e + " is not a string");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("is the dog friendly? ");
        try {
            friendly = scanner.nextBoolean();
        } catch (IllegalArgumentException e) {
            System.out.println(e + " is not a boolean");
        }

        return new Dog(friendly, name);
    }

    public static Student addStudent() throws IOException {
        String name = "";
        int age = 0;

        BufferedReader inStream = new BufferedReader (new InputStreamReader(System.in));

        System.out.print("Enter Student name: ");
        try{
            name = inStream.readLine();
        } catch(StringIndexOutOfBoundsException e){
            System.out.println(e + " is not a string");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's age");
        try{
            age = scanner.nextInt();
        }catch (NumberFormatException e){
            System.out.println(e + " is not an integer");
        }

        return new Student(age, name);
    }
}
