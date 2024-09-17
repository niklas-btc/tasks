package com.niklas.tasks_17_09_2024;

public class binaryCalc {



    public String GetBinary(int number){
        if(number == 0) return "0";
        String result = "";

        while(number > 0){
            int numberModulo = number % 2;
            result = numberModulo + result;
            number = number / 2;
        }
        return result;
    }
}
