package com.niklas;
import com.niklas.tasks_17_09_2024.basic;

public class Main {
    public static void main(String[] args) {
        basic input = new basic();
        input.CalculateTypes("pow", 2f, 4f);
        //input.StringToNumber("10");
        //starttasks1();

    }

    private static void starttasks1(){
        System.out.print("Bitte gebe etwas ein: ");
        basic input = new basic();
        String UserInput = input.GetStringInput();
        System.out.println("Deine Eingabe lautet: " + UserInput);
    }
}