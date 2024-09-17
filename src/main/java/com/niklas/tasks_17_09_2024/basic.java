package com.niklas.tasks_17_09_2024;

public class basic {

    long myval = 12345L;  // definiere Variable klar als long-int
    float myfloat = 12.5f; // definiere Variable klar als float
    double mydouble = 12.5;


    public String GetStringInput(){
        return System.console().readLine();
    }

    // Beispiel der grundlegenden Rechenoperationen in Java & einer Switch-case Verzweigung
    public void CalculateTypes(String operation, float f1, float f2) {
        switch (operation) {
            case "add":
                System.out.println(f1 + f2);
                break;
            case "sub":
                System.out.println(f1 - f2);
                break;
            case "mul":
                System.out.println(f1 * f2);
                break;
            case "div":
                System.out.println(f1 / f2);
                break;
            case "modulo":
                // berechnet den Rest, wenn eine ganze Zahl durch eine andere geteilt wird.
                System.out.println(f1 % f2);
                break;
            case "pow":
                // berechnet die Potenz von Zahlen. f1 = basis, f2 = Exponent
                System.out.println(Math.pow(f1, f2));
                break;
            case "sqrt":
                // berechnet die 2. Wurzel einer Zahl
                System.out.println(Math.sqrt(f1));
                break;
            default:
                System.out.println("ungültige Rechenoperation ausgewählt!");
                break;
        }
    }



    /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// ///
    /// Methodenüberladung liegt vor, wenn mehrere Methoden denselben Namen haben,
    /// sie aber verschiedene Parameter (engl. argument) erwarten.

    ///
    // Überladene Methode ohne Parameter, die den Standardwert verwendet
    public void CharToNumber() {
        CharToNumber('0'); // Aufruf der anderen Methode mit dem Standardwert
    }

    // Überladene Methode mit einem char-Parameter
    public void CharToNumber( char _charNumber){

        //char CharNumber = '9'; // Das Zeichen mit ASCII-Wert 56
        int CharValueToInt = Character.getNumericValue(_charNumber);
        System.out.println(CharValueToInt); // Ausgabe des ASCII-Wertes

    }


    // Überladene Methode ohne Parameter, welche den Standartwert beinhaltet
    public void StringToNumber(){
        StringToNumber("0");
    }

    // Überladene Methode mit einem String-Parameter
    public void StringToNumber(String _stringNumber){
        int StringValueToInt = Integer.parseInt(_stringNumber);
        System.out.println(StringValueToInt);
    }

    /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// /// ///
}
