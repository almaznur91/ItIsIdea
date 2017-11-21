package com.company;

public class Main {



            final static int THE_MAX = 1000;

            public static void main(String[] args) {
                boolean isPrime;
                for (int i = 1; i < THE_MAX; i++) {
                    isPrime = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.print(i + " ");
                    }
                }
            }
        }


