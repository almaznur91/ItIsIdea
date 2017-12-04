import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

      /*  1. Реализуй метод getAmount в классе Money:
        1.1. Подумай, какого типа нужно создать приватную переменную, если метод getAmount будет ее возвращать.
        1.2. Создай приватную переменную этого типа и верни ее в методе getAmount.
        1.3. В конструкторе присвой ей значение, полученное параметром.
        2. В отдельном файле создай класс Hrivna.
        3. Наследуй класс Hrivna от класса Money.
        4. В классе Hrivna реализуй метод getCurrencyName, который возвращает "HRN".
        5. В отдельном файле создай класс USD.
        6. Наследуй класс USD от класса Money.
        7. В классе USD реализуй метод getCurrencyName, который возвращает "USD".
        8. Подумай, объекты каких классов можно добавить в список(лист) allMoney.
        9. Добавь в конструктор класса Person заполнение листа allMoney объектами всех возможных классов.*/

    Humans ivan  = new Humans("ivan");

       for (Money money : ivan.getList()){

           System.out.println(ivan.name+ " имеет "+ money.getAmound() + "" + " "  + money.getCurrencyName());

       }


    }


}
