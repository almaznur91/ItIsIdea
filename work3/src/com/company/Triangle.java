package com.company;

public class Triangle {
    private static int angle1;
    private static int angle2;
    private static int angle3;

    public static void setAngle1(int angle1) {
        Triangle.angle1 = angle1;
    }

    public static void setAngle2(int angle2) {
        Triangle.angle2 = angle2;
    }

    public static void setAngle3(int angle3) {
        Triangle.angle3 = angle3;
    }

    public Triangle(int angle1, int angle2, int angle3) {
        Triangle.setAngle1(angle1);
        Triangle.setAngle2(angle2);
        Triangle.setAngle3(angle3);
    }

    public double sAgle() {

        return Math.sqrt((angle3 + angle2 + angle1) / 2);
    }

    public static boolean Bedr() {

        if (angle2 == angle1) {
            return true;
        } else if (angle2 == angle3) {
            return true;
        } else if (angle3 == angle1) {
            return true;
        }
        return false;

    }

    public static boolean Pryam() {
        if (angle1 == (angle2 / 2)) {
            return true;
        } else if (angle1 == (angle3 / 2)) {
            return true;
        } else if (angle2 == angle1 / 2) {
            return true;
        } else if (angle2 == angle3 / 2) {
            return true;
        } else if (angle3 == angle1 / 2) {
            return true;
        } else if (angle3 == angle2 / 2) {
            return true;
        } else return false;

    }

    public static boolean tru() {
        if (angle3 < (angle1 + angle2)) {
            return true;
        } else if (angle2 < (angle1 + angle3)) {
            return true;
        } else if (angle1 < (angle2 + angle3)) {
            return true;
        } else return false;

    }

}