package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello Friend! What's your name?");
        String name=keyboard.nextLine();
        //kontatenering eng. concatenation
        System.out.println("Du heter "+name+".");
        System.out.println("Hello Friend! First number please" );
        double talEtt=keyboard.nextDouble();
        System.out.println("Hello Friend! Second number please" );
        double talTvå=keyboard.nextDouble();
        System.out.println(talEtt+talTvå);


    }
}


