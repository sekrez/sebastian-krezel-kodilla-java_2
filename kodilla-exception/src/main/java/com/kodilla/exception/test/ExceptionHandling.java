package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallange secondChallange = new SecondChallange();

        try {
            secondChallange.probablyIWillThrowException(1, 1.5);
        } catch (Exception e) {
            System.out.println("You have entered incorrect values for probablyIWillThrowException method !!!");
        } finally {
            System.out.println(" END OF WORK - EXIT");
        }

    }
}

