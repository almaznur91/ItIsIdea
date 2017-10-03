package com.company;

public class Triangle {
    private int angle1;
    private int angle2;
    private int angle3;

    public boolean setAngle1(int angle1) {

        if (isTrue()||(angle1==0&&angle2==0||angle3==0&&angle1==0||angle3==0&&angle2==0)){
            this.angle1 = angle1;
            return true;
        }
        return false;

    }

    public void setAngle2(int angle2) {
        this.angle2 = angle2;
    }

    public void setAngle3(int angle3) {
        this.angle3 = angle3;
    }

    public Triangle(int angle1, int angle2, int angle3) {
        this.setAngle1(angle1);
        this.setAngle2(angle2);
        this.setAngle3(angle3);
    }

    public double sAgle() {

        return Math.sqrt((angle3 + angle2 + angle1) / 2);
    }

    public boolean Bedr() {

        if (angle2 == angle1) {
            return true;
        } else if (angle2 == angle3) {
            return true;
        } else if (angle3 == angle1) {
            return true;
        }
        return false;

    }

    public boolean Pryam() {
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

    public boolean isTrue() {
        if (angle3 < (angle1 + angle2)) {
            return true;
        } else if (angle2 < (angle1 + angle3)) {
            return true;
        } else if (angle1 < (angle2 + angle3)) {
            return true;
        } else return false;

    }

}