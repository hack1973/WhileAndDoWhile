package com.company;

public class Main {

    public static void main(String[] args) {

        int startNumber = 1;
        int endNumber = 20;

        while (startNumber <= endNumber) {
            System.out.println(startNumber + " is even?(true or false) " +
                    isEvenNumber(startNumber));
            startNumber++;
        }

        startNumber = 1;
        int evenNumberCount =0;
        while (startNumber <= endNumber) {
            startNumber++;
            if (!isEvenNumber(startNumber)) {
                continue;
            }
            System.out.println(startNumber + " is even.");
            evenNumberCount++;
            if (evenNumberCount >= 5) {
                break;
            }
        }
        System.out.println(evenNumberCount + " even numbers were found.");
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
