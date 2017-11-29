package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hen hen = new HenFactory().getHen("Russia");
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());

    }
}
