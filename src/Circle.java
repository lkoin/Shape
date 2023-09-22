import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateCircuit() {
      return PI*pow(this.radius,2);
    };
}

