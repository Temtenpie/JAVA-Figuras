package Cubo;

import java.util.Scanner;

class Cuboa {
    private double lado;

    public Cuboa() {
        lado = 3;
    }

    public Cuboa(double l) {
        lado = l;
    }

    double volumen() {
        return lado * lado * lado;
    }

    double areaSuperficial() {
        return 6 * (lado * lado);
    }

    double diagonal() {
        return Math.sqrt(3) * lado;
    }

    void setLado(double l) {
        lado = l;
    }

    double getLado() {
        return lado;
    }
}

public class Cubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado para el cubo c1: ");
        double lado1 = scanner.nextDouble();

        Cuboa c1 = new Cuboa(lado1);
        Cuboa c2 = new Cuboa(7);

        System.out.println("\n");
        System.out.println("=== Primer Cubo ===");
        System.out.println("Volumen del cubo c1: " + c1.volumen());
        System.out.println("Área superficial del cubo c1: " + c1.areaSuperficial());
        System.out.println("Diagonal del cubo c1: " + c1.diagonal() + "\n");

        System.out.println("=== Segundo Cubo ===");
        System.out.println("Volumen del cubo c2: " + c2.volumen());
        System.out.println("Área superficial del cubo c2: " + c2.areaSuperficial());
        System.out.println("Diagonal del cubo c2: " + c2.diagonal() + "\n");

        c1.setLado(6);

        System.out.println("=== Tercer Cubo (modificado del primero) ===");
        System.out.println("Nuevo volumen del cubo c1: " + c1.volumen());
        System.out.println("Nueva área superficial del cubo c1: " + c1.areaSuperficial());
        System.out.println("Nueva diagonal del cubo c1: " + c1.diagonal() + "\n");

        scanner.close();
    }
}
