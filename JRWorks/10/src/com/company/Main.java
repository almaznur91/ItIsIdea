package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain]. Параметр конструктора - имя книги.
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook расширьте тип возвращаемого результата.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
    5.1. agathaChristieOutput для книг Агаты Кристи;
    5.2. markTwainOutput для книг Марка Твена.*/
        ArrayList<Book>books = new ArrayList<>();
        books.add(new MarkTwainBook("TomSoyer"));
        books.add(new AgathaChristieBook("А на войне"));
        books.add(new AgathaChristieBook("выаыва"));
        for (Book book:books){
            book.getOutputByBookType();
        }


    }

    public abstract static class Book {
        private String name;
        private String author;

        abstract Book getBook();

        abstract String getBookName();

        void getOutputByBookType() {

            if (this instanceof MarkTwainBook) {
                ((MarkTwainBook) this).markTwainOutput();
            } else if (this instanceof AgathaChristieBook) {
                ((AgathaChristieBook) this).agathaChristieOutput();
            }

        }
    }


    public static class MarkTwainBook extends Book {
        String name = null;

        public MarkTwainBook(String name) {
            super.author = "Mark Twain";
            super.name = name;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getBookName() {
            return this.name;
        }

        void markTwainOutput() {
            System.out.println(super.author+" "+getBook().getBookName() + "Отличный Марк Твен");

        }
    }


    public static class AgathaChristieBook extends Book {

        String name = "";

        public AgathaChristieBook(String name) {
            super.name = name;
            super.author = "Agatha Christie";
        }


        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getBookName() {
            return this.name;
        }

        void agathaChristieOutput() {
            System.out.println(super.author+" "+getBook().getBookName() + "Отличный АГАТА КРИСТИ");
        }
    }
}