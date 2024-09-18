package com.niklas.tasks_17_09_2024;

public class binaryCalc {


    /*
    Methode rechnet eine Ganzzahl im dezimalformat in das Binärformat um
    und gibt das Ergebnis als String zurück.
    */
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

    // Erhalte den Buchstaben an einer bestimmten Stelle im String VARiABLE.charAt(INDEX);
}
