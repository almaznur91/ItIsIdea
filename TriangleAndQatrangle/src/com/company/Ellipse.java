package com.company;

import static java.lang.Math.*;

public class Ellipse extends Figure {
    private final int DEFAULT_BIGR = 0;
    private final int DEFAULT_R = 1;

    protected int r;
    private int BigR;

    public Ellipse(int r, int BigR) {
        if (r > 0) {
            this.r = r;
        } else {
            this.r = DEFAULT_R;
        }
        if (BigR > 0) {
            this.BigR = BigR;
        } else {
            this.BigR = DEFAULT_BIGR;
        }
        this.BigR = BigR;
    }

    public void area() {
        System.out.println("Площадь эллипса =" + (PI * r * BigR));
    }

}
