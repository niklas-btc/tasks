package com.niklas;
import com.niklas.tasks_17_09_2024.basic;
import com.niklas.tasks_17_09_2024.binaryCalc;

public class Main {
    public static void main(String[] args) {
        //basic input = new basic();
        //input.CalculateTypes("pow", 2f, 4f);
        //input.StringToNumber("10");
        //starttasks1();
        binaryCalc calc = new binaryCalc();
        System.out.println(calc.GetBinary(0));
    }

    private static void starttasks1(){
        System.out.print("Bitte gebe etwas ein: ");
        basic input = new basic();
        String UserInput = input.GetStringInput();
        System.out.println("Deine Eingabe lautet: " + UserInput);
    }
}