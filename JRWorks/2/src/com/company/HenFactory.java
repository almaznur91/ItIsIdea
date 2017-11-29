package com.company;

public class HenFactory {
    Hen hen;

    Hen getHen(String country) {
        if (country.equals("Russia")) {
            hen = new RussianHen();
        } else if (country.equals("Moldavan")) {
            hen = new MoldovanHen();
        }

        return hen;
    }
}
