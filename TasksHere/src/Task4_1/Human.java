package Task4_1;

public class Human {
    int Age;
    String name;
    Cat[] cats = new Cat[10];

    public void ZavestiKoshku(Cat cat) {
        for (int i = 0; i < cats.length; i++)
            cat[i] = cats;
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