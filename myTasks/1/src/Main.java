public class Main {
    public static void main(String[] args) {

        long[] prosty = new long[100000];
        int count = 0;
        int tempcount = 0;
        //Числа, которые будем рассматривать
        for (int i = 1; i < 10000; i++) {
            //числа, на которые будем делить
            for (int j = 2; j < i; j++) {

                if (i % j != 0) {
                //подсчет количества чисел, которые подеяется с остатком
                    tempcount++;

                }
            }
            //простое число должно делиться только на себя  и 1
            // ->
            if ((i - tempcount) == 2) {
                prosty[count] = i;
                count++;
            }
            tempcount = 0;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(prosty[i] + " ");
        }


    }
}
