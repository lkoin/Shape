
public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Square square1 = new Square(5.0);
//        System.out.println(square.side);
//        System.out.println(square1.side);

        System.out.println("Pole kwadratu wynosi: \n"+square1.calculateArea());


        Circle circle = new Circle(3.0);
        System.out.printf("Pole kola o promeniu %.2f wynosi : \n %.2f",circle.radius,circle.calculateCircuit());

        Triangle triangle = new Triangle(3.0,5.0);
        System.out.println("Pole kwadratu wynosi: \n"+triangle.trangleArea());
        System.out.printf("Dlugosc boku c wynosi: %.2f",triangle.triangleCircuit());
    }
}


