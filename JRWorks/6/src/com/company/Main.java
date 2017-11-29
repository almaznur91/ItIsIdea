package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Appatment> appatments = new ArrayList<>();
        appatments.add(new Apartment1());
        appatments.add(new Apartment2());
        appatments.add(new Apartment3());

        cleanAllApartments(appatments);

    }

    public static void cleanAllApartments(ArrayList<Appatment> appatments) {

        for (int i = 0; i <appatments.size();i++){
          if (appatments.get(i)instanceof Apartment1){
              ((Apartment1) appatments.get(i)).clean1Room();
          }
            else if (appatments.get(i)instanceof Apartment2){
              ((Apartment2) appatments.get(i)).clean2Room();
          }
            else if (appatments.get(i)instanceof Apartment3){
                ((Apartment3) appatments.get(i)).clean3Room();
          }
        }


    }

    public static class Appatment    {
    }

    public static class Apartment1 extends Appatment {
        public void clean1Room() {
            System.out.println("Убираю однокомнатную хату");
        }
    }

    public static class Apartment2 extends Appatment {
        public void clean2Room() {
            System.out.println("Убара. 2х клмнатную хату");
        }
    }

    public static class Apartment3 extends Appatment {
        public void clean3Room() {
            System.out.println("Убираем треху");
        }
    }
}
