package Task7_done;


public class Main {

    public static void swap(String[] string, int a, int b) {
        String temp;
        temp = string[a];
        string[a] = string[b];
        string[b] = temp;
    }
    public static String myStr(String[] strings) {
        String sOut = "";
        for (int i = 0; i < strings.length; i++) {
            sOut = sOut + strings[i] + " ";
        }
        return sOut;
    }


    /**
     * НИ НАМЕКА НА ООП=)
     */
    public static void swao(){}
    public static void main(String[] args) {
        String[] string = new String[10];
        for (int i = 0; i < string.length; i++) {
            string[i] = "Номер " + i + "1, ";
        }
        swap(string,4,6);



    //выше я создал массив строк и заполнил их строками
    //TODO: сделай функцию чтобы поменять местами значения двух элементов массива
    //TODO: swap(4,6); вот так например
    //эта функция прямо в этом классе

    //TODO: Bonus: выведи массив на экран через переменную
   // String myStr = "";
    //тут внесение массива в переменную
        System.out.println(myStr(string));

}
}
