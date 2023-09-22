import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(5.0);
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
                System.out.println("Podaj dlugosc boku kwadratu: ");
                square.side = scanner.nextDouble();
                System.out.println("Pole kwadratu wynosi: \n" + square.calculateArea());
                break;
            case 2:
                System.out.println("Podaj dlugosc promienia: ");
                circle.radius= scanner.nextDouble();
                System.out.printf("Pole kola o promeniu %.2f wynosi : \n %.2f", circle.radius, circle.calculateCircuit());
                break;
            case 3:
                System.out.println("1. Oblicz pole");
                System.out.println("2. Oblicz bok c");
                int wybor = scanner.nextInt();
                if (wybor== 1) {
                    System.out.println("Podaj dlugosc boku a trojkąta: ");
                    triangle.boka = scanner.nextDouble();
                    System.out.println("Podaj dlugosc boku b trojkąta: ");
                    triangle.bokb = scanner.nextDouble();
                    System.out.println("Pole kwadratu wynosi: \n" + triangle.trangleArea());
                } else if (wybor==2) {
                    System.out.println("Podaj dlugosc boku a trojkąta: ");
                    triangle.boka = scanner.nextDouble();
                    System.out.println("Podaj dlugosc boku b trojkąta: ");
                    triangle.bokb = scanner.nextDouble();
                    System.out.printf("Dlugosc boku c wynosi: %.2f", triangle.triangleCircuit());
                }
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


