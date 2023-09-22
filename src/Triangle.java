import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {
    double boka;
    double bokb;


    public Triangle(double boka, double bokb) {
        this.boka = boka;
        this.bokb = bokb;
    }

    public double sqrtTrangleArea() {
        double area = (this.boka * this.bokb)/2;
        return area;
    }

    public double sqrtTriangleCircuit(){
        return sqrt(pow(boka,2) + pow(bokb ,2));

    }

    public double equilateralTriangleArea() {
        return (pow(boka,2)*sqrt(3)/4);
    }
    public double equilateralTriangleCirciut() {
        return 3*boka;
    }

    public double isoscelesTriangleArea(){
        double h = sqrt(pow(bokb,2)-pow((1/2)*boka,2));
        return (this.boka * h)/2;
    }

    public double isoscelesTriangleCircut(){
        return boka+(2*bokb);
    }
}
