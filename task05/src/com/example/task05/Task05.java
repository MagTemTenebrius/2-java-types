package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        // функция
        while (x > 0) {
            if (x % 10 % 2 != 0) return "FALSE";
            x /= 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(88889);
        System.out.println(result);
    }

}
