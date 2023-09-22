import static java.lang.Math.pow;

public class Square {
    double  side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {

    }

    public double calculateArea(){
        return pow(this.side,2);
    }
}
