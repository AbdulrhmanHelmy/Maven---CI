package com;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Helmy, CI is running!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // Method that sometimes fails intentionally (based on current second)
    public static boolean sometimesFail() {
        int second = java.time.LocalTime.now().getSecond();
        return second % 2 == 0;
    }
}
