public class Figure {


        private String name;
        private int numberofangles;

    public Figure(String name, int numberofangles) {
            this.name = name;
            this.numberofangles = numberofangles;
        }

    public String getName() {
        return name;
    }

    public int getNumberofangles() {
        return numberofangles;
    }
    public String toString() {
        return getName()+getNumberofangles();
    }
    }
