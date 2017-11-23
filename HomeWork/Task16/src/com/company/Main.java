package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code hereg
        TextViewer textViewer = new TextViewer("Привет Загир 99");

        NumberOfSpaces numberOfSpaces = new NumberOfSpaces();
        textViewer.addObserver(numberOfSpaces);
        textViewer.addObserver(new NumberOfDigits());
        textViewer.addObserver(new NubersOfLetter());
        textViewer.event();



    }



}
