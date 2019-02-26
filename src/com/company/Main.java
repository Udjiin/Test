package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	/*  На переполнение
	     int a=2147483647;
    *    System.out.println(a+1);
    *    System.out.println(a*2);
    */
	Factorial factorial=new Factorial();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input int number for factorial !");
	System.out.println("Your number factorial is: "+factorial.factorial(scanner.nextInt()));
    FibonachiNumber fibonachiNumber=new FibonachiNumber();
        System.out.println("====================================");
        fibonachiNumber.calculate();


    }
}
