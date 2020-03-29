package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Your name:");
            String s = scanner.nextLine().trim();
            if (s.length() > 2)
                return s;
            System.out.println("Name too short. Try again!");
        }
    }

    public static int getRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Number of rounds:");
            String s = scanner.nextLine().trim();
            try {
                int n = Integer.parseInt(s);
                if (n <= 0 || n > 9)
                    throw new Exception();
                return n;
            } catch (Exception e){
                System.out.println("Invalid number. Try again!");
            }
        }
    }
}
