
public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Square square1 = new Square(5.0);
//        System.out.println(square.side);
//        System.out.println(square1.side);

        System.out.println("Pole kwadratu wynosi: \n"+square1.calculateArea());


        Circle circle = new Circle(3.0);
        System.out.println("Pole kola wynosi: "+ circle.calculateCircuit());
    }
}


