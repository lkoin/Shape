import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Square square1 = new Square(5.0);
        Circle circle = new Circle(3.0);
        Triangle triangle = new Triangle(3.0,5.0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz co chcesz obliczyc: ");
        System.out.println("1. Pole kwadratu");
        System.out.println("2. Pole koła");
        System.out.println("3. Oblicz pole kwadratu prostokątnego oraz bok c");
        System.out.println("0. Wyjscie");
        boolean petla = true;
        while (petla == true) {
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Pole kwadratu wynosi: \n" + square1.calculateArea());
                break;
            case 2:
                System.out.printf("Pole kola o promeniu %.2f wynosi : \n %.2f", circle.radius, circle.calculateCircuit());
                break;
            case 3:
                System.out.println("Pole kwadratu wynosi: \n" + triangle.trangleArea());
                System.out.printf("Dlugosc boku c wynosi: %.2f", triangle.triangleCircuit());
                break;
            case 0:
                System.out.println("Wyjscie z programu");
                petla = false;
                break;
        }
        }

//        System.out.println(square.side);
//        System.out.println(square1.side);








    }
}


