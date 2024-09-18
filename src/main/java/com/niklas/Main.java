package com.niklas;
import com.niklas.tasks_17_09_2024.basic;
import com.niklas.tasks_17_09_2024.Tasks;

import java.util.Scanner;

public class Main {

    // Initialisieren der Aufgaben-klasse, in welcher die Methoden für die Aufgaben stehen
    static Tasks tasks = new Tasks();;

    public static void main(String[] args) {

        System.out.println(TaskCrypticNumbers());
    }


    // Lösung zur Aufgabe Rückwärts
    private static String TaskReverseInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gebe die Zeichen ein, welche rückwärts sortiert werden sollen: ");
        String UserInput = scanner.nextLine();
        return tasks.ReverseString(UserInput);
    }


    // Lösung zur Aufgabe "Fibonacci-Reihe darstellen, bis die nächste größer wäre als der mitgegebene Zahl"
    private static String TaskFibonacciNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gebe eine Zahl ein, bis zu welcher die Fibonacci-Reihe dargestellt werden soll: ");
        int UserInput = scanner.nextInt();
        return tasks.GetFibonacciNumbersTo(UserInput);
    }


    // Lösung zur Aufgabe "Quersumme"
    private static int TaskChecksum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gebe die Zahl ein dessen Quersumme gebildet werden soll: ");
        String UserInput = scanner.nextLine();
        return tasks.GetChecksum(UserInput);
    }

    // Erhalte die Zahl PI auf definierte Genauigkeit. Berechnet nach der Leibniz-Methode
    private static double TaskPiToaAccuracy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie viele Iterationen sollen gemacht werden um Pi zu berechnen: ");
        int UserInput = scanner.nextInt();
        return tasks.GetPi(UserInput);
    }

    // Lösung zur Aufgabe "Test auf Primzahl"
    private static String TaskCheckPrimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Zahl für den Primetest eingeben (long): ");
        long UserInput = scanner.nextLong();
        return "Ergebnis: " + tasks.CheckPrimeNumber(UserInput);
    }

    // Lösung zur Aufgabe "Primfaktorzerlegung"
    private static String TaskCGetPrimeNumberFactors() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Zahl für die Primfaktorzerlegung eingeben (long): ");
        long UserInput = scanner.nextLong();
        return "Die Zahl " + UserInput + " kann in folgende Faktoren zerlegt werden: " + tasks.GetPrimeNumberFactors(UserInput);
    }


    private static String TaskCrypticNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte die Zahl eingeben: ");
        long firstparam = scanner.nextLong();
        System.out.print("Bitte Passwort (ZAHL) eingeben: ");
        long secoundparam = scanner.nextLong();

        long encyrptMessage = tasks.CryptClearText(firstparam, secoundparam);
        return "Result: " + encyrptMessage;
    }


}