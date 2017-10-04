package com.company;

public class ArrayList {

    // константа - в коде уже изменить не получится
    private final int INITIAL_SIZE = 100;
    // поле - хранилище данных
    private int elements[];
    // количество элементов массива
    private int count;

    public ArrayList() {
        elements = new int[INITIAL_SIZE];
        //TODO: удалить
//        for (int i=0;i<elements.length;i++){
//            elements[i]=i;
//        }
        count = 0;
    }

    public int[] getArray() {
        int[] array1 = new int[count];
        for (int i = 0; i < count; i++) {
            array1[i] = elements[i];
        }
        return array1;
    }

    public String outString() {
        String sOut = "";
        for (int i = 0; i < count; i++) {
            sOut = sOut + elements[i] + " ";
        }
        return sOut;
    }


    public boolean delByInd(int index) {
        if (index >= 0 || index < count) {
            for (int i = index; i < count - 1; i++) {
                elements[i] = elements[i + 1];
            }
            count--;
            return true;
        } else {
            return false;
        }
    }

    public void add(int element) {

        if (elements.length == count) {

            int[] tempArray = new int[(int) (elements.length * 1.5)];
            for (int i = 0; i < count; i++) {
                tempArray[i] = elements[i];
                elements = tempArray;
            }
        }
        elements[count] = element;
        count++;
    }

    public int get(int index) {
        return elements[index];
    }

    public int replace(int index, int element) {
        elements[index] = element;
        //TODO: не нужен return
        return element;
    }

    public int addStart(int index) {
        //TODO:пределы и порядок при смещении направо, позже при занесении в elements[0] он потеряется
        for (int i = 1; i < count - 2; i++) {
            //TODO:это смещение налево, теряется 1-ый элемент
            elements[i] = elements[i + 1];
        }
        elements[0] = index;
        //TODO:зачем этот return
        return index;
    }
    //TODO:название
    public int isReturnIndex(int element) {
        int a = -1;
        //TODO:пропустил последний элемент при поиске
        for (int i = 0; i < count - 1; i++) {
            if (elements[i] == element) {
                //TODO:сделай return i; потому что ты должен вернуть ПЕРВЫЙ! найденный элемент
                a = i;
            }
        }
        return a;
    }

    public void insertElement(int element, int index) {
        if (elements.length == count) {
            int[] tempArray = new int[(int) (elements.length * 1.5)];
            for (int i = 0; i < count; i++) {
                tempArray[i] = elements[i];
                elements = tempArray;
            }
        }
        //TODO:неправильный предел
        for (int i = index; i < count - 2; i++) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        count++;
    }

    public void sort() {
        int min;
        int index;
        int temp;
        for (int n = 0; n < count; n++) {
            min = elements[n];
            index = n;
            for (int i = n + 1; i < count; i++) {
                if (min > elements[i]) {
                    min = elements[i];
                    index = i;
                }
            }
            temp = elements[index];
            elements[index] = elements[n];
            elements[n] = temp;
        }
    }

//    public void show() {
//        for (int i = 0; i <= count; i++) {
//        }
//    }

}

