package Trapecio_isosceles;

import java.util.Scanner;

class TrapecioIsosceles1 {
    private double bMayor;
    private double bMenor;
    private double lado;

    public TrapecioIsosceles1(double bMayor, double bMenor, double lado) {
        this.bMayor = bMayor;
        this.bMenor = bMenor;
        this.lado = lado;
    }

    public TrapecioIsosceles1() {
        this.bMayor = 8;
        this.bMenor = 6;
        this.lado = 5;
    }

    public double altura() {
        return Math.sqrt(Math.pow(lado, 2) - Math.pow((bMayor - bMenor) / 2, 2));
    }

    public double area() {
        return ((bMayor + bMenor) * altura()) / 2;
    }

    public double perimetro() {
        return bMayor + bMenor + 2 * lado;
    }

    public void setbMayor(double bMayor) {
        this.bMayor = bMayor;
    }

    public void setbMenor(double bMenor) {
        this.bMenor = bMenor;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getbMayor() {
        return bMayor;
    }

    public double getbMenor() {
        return bMenor;
    }

    public double getLado() {
        return lado;
    }
}

public class Trapecio_isosceles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base mayor del trapecio isósceles: ");
        double bMayor = scanner.nextDouble();
        System.out.print("Ingrese la base menor del trapecio isósceles: ");
        double bMenor = scanner.nextDouble();
        System.out.print("Ingrese el lado del trapecio isósceles: ");
        double lado = scanner.nextDouble();

        TrapecioIsosceles1 t1 = new TrapecioIsosceles1(bMayor, bMenor, lado);
        TrapecioIsosceles1 t2 = new TrapecioIsosceles1(2,3,4);

        System.out.println("\n===== Primer Trapecio Isósceles =====");
        System.out.println("Altura del trapecio t1: " + t1.altura());
        System.out.println("Área del trapecio t1: " + t1.area());
        System.out.println("Perímetro del trapecio t1: " + t1.perimetro() + "\n");

        System.out.println("===== Segundo Trapecio Isósceles =====");
        System.out.println("Altura del trapecio t2: " + t2.altura());
        System.out.println("Área del trapecio t2: " + t2.area());
        System.out.println("Perímetro del trapecio t2: " + t2.perimetro() + "\n");

        t1.setbMayor(12);

        System.out.println("===== Trapecio Modificado =====");
        System.out.println("Nueva altura del trapecio t1: " + t1.altura());
        System.out.println("Nueva área del trapecio t1: " + t1.area());
        System.out.println("Nuevo perímetro del trapecio t1: " + t1.perimetro() + "\n");

        scanner.close();
    }
}
