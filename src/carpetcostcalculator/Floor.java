package carpetcostcalculator;

public class Floor {

    double width;
    double length;


    public Floor (double width, double length) {
        this.length = length;
        this.width = width;

        if (width < 0 && length < 0) {
            this.width = 0;
            this.length = 0;
        }
    }
        public double getArea(){
        return width*length;
        }

    }


