package ru.itpark.forServlets;

public class Util {
    public static String headWithTitle(String title){
        return ("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n");

    }
}
