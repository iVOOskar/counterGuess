package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] counters = getStrings();
        Scanner input = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("what is your next guess out of: black, pink, blue, white");
            String guess = input.next();
            if (guess.equals(counters[i])){
                System.out.println("that's right, next counter");
                score+=2;
            }else{
                System.out.println("that's wrong, next counter");
                score--;
            }
        }
        System.out.println("your score was "+score+" good job");
        System.out.println("the counter colours were" +Arrays.toString(counters));
    }

    private static String[] getStrings() {
        String[] counterColours = new String[]{"black", "pink", "blue", "white" };
        Random random = new Random();
        String[] counters = new String[10];
        for (int i = 0; i < 10; i++){
            counters[i] = counterColours[random.nextInt(4)];
        }
        return counters;
    }
}
