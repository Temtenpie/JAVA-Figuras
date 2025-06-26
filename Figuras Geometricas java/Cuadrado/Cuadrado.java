package Cuadrado;

import java.util.Scanner;

class Cuadrado2 {
    private double lado;

    public Cuadrado2(double lado) {
        this.lado = lado;
    }

    public Cuadrado2() {
        this.lado = 3;
    }

    public double perimetro() {
        return 4 * lado;
    }

    public double area() {
        return lado * lado;
    }

    public double diagonal() {
        return lado * Math.sqrt(2);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}

public class Cuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del lado del cuadrado: ");
        double lado = scanner.nextDouble();

        Cuadrado2 c1 = new Cuadrado2(lado);
        Cuadrado2 c2 = new Cuadrado2(4);


        System.out.println("\n");
        System.out.println("===== Primer Cuadrado =====");
        System.out.println("Perímetro del cuadrado c1: " + c1.perimetro());
        System.out.println("Área del cuadrado c1: " + c1.area());
        System.out.println("Diagonal del cuadrado c1: " + c1.diagonal() + "\n");

        System.out.println("===== Segundo Cuadrado =====");
        System.out.println("Perímetro del cuadrado c2: " + c2.perimetro());
        System.out.println("Área del cuadrado c2: " + c2.area());
        System.out.println("Diagonal del cuadrado c2: " + c2.diagonal() + "\n");

        c1.setLado(10);

        System.out.println("===== Tercer Cuadrado =====");
        System.out.println("Nuevo perímetro del cuadrado c1 con lado modificado: " + c1.perimetro());
        System.out.println("Nueva área del cuadrado c1 con lado modificado: " + c1.area());
        System.out.println("Nueva diagonal del cuadrado c1 con lado modificado: " + c1.diagonal() + "\n");

        scanner.close();
    }
}

