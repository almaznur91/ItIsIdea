package com.company;

public class Program {

    private char c;


    public Program(char c) {
        this.c = c;
    }

    public boolean isLetter() {
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            return true;
        }
        return false;
    }

    public boolean isDigit() {
        if (c >= 48 && c <= 57) {
            return true;
        }
        return false;
    }

    public boolean isUpper() {
        if (c >= 65 && c <= 90) {
            return true;
        }
        return false;
    }

    public boolean isLower() {
        if (c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }

    private char n1;
    private char n2;
    private char n3;
    private char n4;

    char number[] = {n1, n2, n3, n4};

    public int x (){
        return  (number[0] * 1000 + number[1] * 100 + number[2] * 10 + number[3] * 1);
    }


}