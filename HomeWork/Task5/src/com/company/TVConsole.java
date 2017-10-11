package com.company;

public class TVConsole {


    public TV controlTv;

    public TVConsole(TV controlTv) {
        this.controlTv = controlTv;
    }

    public void menu() {
        System.out.println("1. кнопка №1 \n" +
                "2. кнопка №2 \n" +
                "3. кнопка №3");
    }

    public boolean pushButton (int button){
        switch (button){
            case 1:
                controlTv.show(0);
                break;
            case 2:
                controlTv.show(1);
                break;
            case 3:
                controlTv.show(2);
                default:
                    System.out.println("");
        }
        return  false;
    }
}
