package com.company;

public class Factorial {
    int factorial(int n){
        int result;

        if (n==1){
            return 1;
        }
        result=factorial(n-1)*n;
        return result;
    }
}
