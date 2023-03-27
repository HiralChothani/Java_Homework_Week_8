package poolarea;

public class Cuboid extends Rectangle {

    double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
        if(height<0){
            this.height = 0;
        }
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        double volume = getArea()*getHeight();
                return volume;
    }
}
