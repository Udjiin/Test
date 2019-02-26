package com.company;

import java.util.Scanner;

public class FibonachiNumber {
    void calculate(){
        int first_number=0;
        int second_number=1;

        Scanner sc=new Scanner(System.in);
        System.out.println("Input high limit of Fibonachi number ");
        int number=sc.nextInt();
        printText(first_number);
        printText(second_number);
        for(int i=0;i<number;i++){
            int next_number=first_number+second_number;
            printText(next_number);
            first_number=second_number;
            second_number=next_number;
        }
    }
    void printText(int number){
        System.out.println(number+" ");
    }
}
