/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_15{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String actual_password = "abc$123";

        System.out.print("What is the username? ");
        String users_username = scanner.nextLine();

        System.out.print("What is the password? ");
        String users_password = scanner.nextLine();

        if(actual_password.equals(users_password)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
