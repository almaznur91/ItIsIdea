package ru.itpark;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayList<T> implements List<T> {

    Object objects[] = new Object[100];
    int count = 0;

    @Override
    public void add(Object element) {
        objects[count] = element;
        count++;
    }


    @Override
    public void addToBegin(Object object) {
        for (int i = count; i > 0; i--) {
            objects[i] = objects[i - 1];
        }
        count++;
        objects[0] = object;

    }


    @Override
    public Object get(int index) {
        return objects[index];
    }

    @Override
    public void remove(Object object) {
        for (int i = 0; i < count; i++) {
            if (object.equals(objects[i])) {
                for (; i < count - 1; i++) {
                    objects[i] = objects[i + 1];
                }
                count--;
                break;
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < count; i++) {
            if (object.equals(objects[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {

        int n = 0;

        @Override
        public Object next() {
            if (n < count) {
                Object element = objects[n];
                n++;
                return element;
            } else return null;
        }

        @Override
        public boolean hasNext() {
            return n != count - 1;
        }
    }


    private static class ArrayListStream<T> implements Stream<T> {

        private ArrayList<T> streamArrayList = new ArrayList<>();

        public ArrayListStream(ArrayList<T> arrayList) {
            for (T t : arrayList) {
                streamArrayList.add(t);
            }
        }


        @Override
        public Stream filter(Predicate<T> predicate) {

            for (T t : streamArrayList) {
                if (!predicate.test(t)) {

                    streamArrayList.remove(t);
                }

            }
            return this;

        }

        @Override
        public Stream foreach(Consumer<T> consumer) {
            for (T t : streamArrayList) {
                consumer.accept(t);
            }

        return this;
        }



        @Override
        public <R> Stream <R> map(Function<T, R> function) {
            ArrayList<R>rArrayList = new ArrayList<>();
            for (T t:streamArrayList) {
                rArrayList.add(function.apply(t));
                return rArrayList.stream();
            }




        }
    }
}
