package com.niklas.tasks_17_09_2024;

public class Tasks {

    // Gebe den Eingabe String rückwärtsgeschrieben zurück
    public String ReverseString(String inputString) {
        String resultString = "";
        int i = 0;

        while(i < inputString.length()) {
            resultString = inputString.charAt(i) + resultString;
            i++;
        }

        return resultString;
    }

    public String GetFibonacciNumbersTo(int max) {
        // Prüfe, ob eine 0 Eingeben wird und stelle das korrekte da (Workaround da keine IF erlaubt)
        while (max == 0) {
            return "0";
        }

        int lastDigit = 0;
        int currentDigit = 1;

        String resultString = lastDigit + " " + currentDigit; // Startstring mit Startwerten

        // So lange in der Schleife bleiben bis nächste Zahl größer wäre
        while (lastDigit + currentDigit <= max) {
            int nextDigit = lastDigit + currentDigit;
            resultString += " " + nextDigit; // Füge als Ziffer an String an
            lastDigit = currentDigit;
            currentDigit = nextDigit;
        }

        return resultString;
    }

    public int GetChecksum(String inputNumberString) {
        int result = 0;
        int i = 0;
        // Durchlaufe, die Ziffern des Parameters "inputNumberString"
        while (i < inputNumberString.length()) {
            result += Integer.parseInt("" + inputNumberString.charAt(i));
            i++;
        }
        return result;
    }

    public double GetPi(long iterations) {
        int i = 1;

        double dividend = 1;
        double divisor = 3; // wird pro Iteration um 2 erhöht (1/3, 1/5, 1/7 ...)
        int vorzeichen = -1; // (+, -, +, - ...)

        double factor_sum = 1; // Faktor (Summe der Quotienten) Leibniz-Reihe
        while (i < iterations) {

            factor_sum += vorzeichen * (dividend/divisor);
            vorzeichen *= -1;

            divisor += 2;
            i++; // erhöhe die gemachte Anzahl an Iteration
        }

        return 4 * factor_sum;
    }

    public boolean CheckPrimeNumber(long number) {
        while(number < 1) {
            return false;
        }

        long divisor = 2; // starte bei 2, da Primzahlen auch durch 1 teilbar sein dürfen
        // Prüfen, ob die Zahl durch sich selbst geteilt eine Ganzzahl ergibt
        while (divisor < number) {
            while(number % divisor == 0) {
                return false; // ist durch eine andere Zahl teilbar, es ist keine Primzahl
            }
            divisor++;
        }

        return true;
    }


    public String GetPrimeNumberFactors(long number){
        String result = "";
        long divisor = 2;

        // Prüfe, durch welche Primzahl teilbar ist
        while(number > 1) {

            while(number % divisor == 0) {
                // ist durch den teiler ohne rest Teilbar, ergänze Faktor in der liste und teile die eingegebene Zahl durch ihn
                number /= divisor;
                result += divisor + " ";
            }

            divisor++; // Erhöhe dein Teiler für den nächsten durchlauf
        }

        return result;
    }


    public long CryptClearText(long firstParam, long secoundParam){
        // Binäre XOR Operation (Symmetrisches Verschlüsselungsverfahren)
        return firstParam ^ secoundParam;
    }

    public String GetDivisors (long divisor, long limit) {
        String result = "";
        long sum = 0;

        while(sum < limit) {
            result += sum + "\n";
            sum += divisor;
        }

        return result;
    }

    public String GetUpperCase(String inputString) {
        String result = "";
        int i=0;
        while (i < inputString.length()) {

            int charIndex = inputString.charAt(i);
            char UpperNewCharacter = (char) charIndex;

            int tempIndex = charIndex;

            // Wenn es sich um einen kleinbuchstaben handelt, ersetze ihn gegen einen Großbuchstaben (ASCII DEC -= 32)
            while (tempIndex > 96) {
                while (tempIndex < 123) {
                    UpperNewCharacter = (char) (charIndex-32);
                    tempIndex = 999; // Verlassen der Schleife, da nur einmal durchlaufen soll
                }
                tempIndex = -1; // Verlassen der Schleife, da nur einmal durchlaufen soll
            }

            result += UpperNewCharacter;
            i++;
        }

        return result;
    }



}
