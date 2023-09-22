import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {
    double boka;
    double bokb;


    public Triangle(double boka, double bokb) {
        this.boka = boka;
        this.bokb = bokb;
    }

    public double trangleArea() {
        double area = (this.boka * this.bokb)/2;
        return area;
    }

    public double triangleCircuit(){
        return sqrt(pow(boka,2) + pow(bokb ,2));

    }
}
