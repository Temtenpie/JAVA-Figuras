import java.util.Scanner;

class Rectanguloa {
    private double ladoA, ladoB;


    public Rectanguloa() {
        ladoA = 3;
        ladoB = 4;
    }

    public Rectanguloa(double a, double b) {
        ladoA = a;
        ladoB = b;
    }

    double area() {
        return ladoA * ladoB;
    }

    double perimetro() {
        return 2 * (ladoA + ladoB);
    }


    double diagonal() {
        return Math.sqrt(ladoA * ladoA + ladoB * ladoB);
    }


    void setLadoA(double a) {
        ladoA = a;
    }

    void setLadoB(double b) {
        ladoB = b;
    }

    double getLadoA() {
        return ladoA;
    }

    double getLadoB() {
        return ladoB;
    }
}

public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado A para el rectangulo r1: ");
        double ladoA1 = scanner.nextDouble();
        System.out.print("Ingrese el valor del lado B para el rectangulo r1: ");
        double ladoB1 = scanner.nextDouble();


        Rectanguloa r1 = new Rectanguloa(ladoA1, ladoB1);

        Rectanguloa r2 = new Rectanguloa(2, 3);

        System.err.println("\n");
        System.out.println("Area del rectangulo r1: " + r1.area());
        System.out.println("Perimetro del rectangulo r1: " + r1.perimetro());
        System.out.println("Diagonal del rectangulo r1: " + r1.diagonal()+ "\n" );


        System.out.println("Area del rectangulo r2: " + r2.area());
        System.out.println("Perimetro del rectangulo r2: " + r2.perimetro());
        System.out.println("Diagonal del rectangulo r2: " + r2.diagonal()+ "\n");


        System.out.print("Ingrese un nuevo valor para el lado A de r1: "+ "\n");
        r1.setLadoA(scanner.nextDouble());

        System.out.println("Nuevo perimetro del rectangulo r1: " + r1.perimetro());
        System.out.println("Nueva area del rectangulo r1: " + r1.area());
        System.out.println("Nueva diagonal del rectangulo r1: " + r1.diagonal());

        scanner.close();
    }
}