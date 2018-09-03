package com.saunders2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");
    public static void main(String[] args) {

        ArrayList<Talkable> zoo = new ArrayList<>();

        //Lines to Replace
        //zoo.add(new Dog(true, "Pete"));


        //zoo.add(new Cat(9, "Anne Belly"));
        zoo.add(new Cat());

        zoo.add(new Student(19, "Joe John Johnson"));
        //End Lines to Replace

        for (Talkable thing: zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();
        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p)  {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
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

        System.out.print("Enter your Cat's name: ");
        try{
            name = inStream.readLine();
        } catch(IOException e){
            System.out.println(e + " is not a string");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of mice killed ");
        try{
            age = scanner.nextInt();
        }catch (NumberFormatException e){
            System.out.println(e + " is not an integer");
        }

        return new Student(age, name);
    }
}
