package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(goWalk(generateRandomAge(), 20));
        System.out.println(goWalk(generateRandomAge(), 15));
        System.out.println(goWalk(generateRandomAge(), -10));
        System.out.println(goWalk(generateRandomAge(), 35));
        System.out.println(goWalk(generateRandomAge(), 0));
    }

    public static String goWalk(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int randomAge = random.nextInt(100);
        return randomAge;
    }
}
