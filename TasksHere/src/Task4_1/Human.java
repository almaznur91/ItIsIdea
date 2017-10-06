package Task4_1;

public class Human {
    int Age;
    String name;

    Cat[] cats = new Cat[10];
    int count = 0;

    public void howMatchCat(Cat cat) {

        cats[count] = cat;
        count++;

        System.out.println(count);
    }

    public void skol(Cat cat) {
        int count = 0;

        for (int i = 0; i < cats.length; i++) {
            if (cats[i] != null) {
                count = count + 1;
            }
        }

        System.out.println("Количество кошек:" + count);
    }
}