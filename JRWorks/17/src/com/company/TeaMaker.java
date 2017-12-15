package com.company;

public class TeaMaker extends DrinMaker {

    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай"        );
    }

    @Override
    void pour() {
        System.out.println("Заливаем водой"        );
    }
}

