package Task4_1;

public class Cat {
    int count=0;
    String name;
    int age;
    Human mistress;

    public Cat() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void myu() {
        System.out.println("Мяу-мяу-мяу");
    }

}
