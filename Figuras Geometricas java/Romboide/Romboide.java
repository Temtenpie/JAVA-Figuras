package Romboide;

import java.util.Scanner;

class Romboide1 {
    private double base;
    private double altura;
    private double lado;

    public Romboide1(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public Romboide1() {
        this.base = 5; 
        this.altura = 3;
        this.lado = 4;
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + lado);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLado() {
        return lado;
    }
}

public class Romboide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la base del romboide: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del romboide: ");
        double altura = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado oblicuo del romboide: ");
        double lado = scanner.nextDouble();

        Romboide1 r1 = new Romboide1(base, altura, lado);
        Romboide1 r2 = new Romboide1(2, 3, 4);

        System.out.println("\n");
        System.out.println("===== Primer Romboide =====");
        System.out.println("Área del romboide r1: " + r1.area());
        System.out.println("Perímetro del romboide r1: " + r1.perimetro() + "\n");

        System.out.println("===== Segundo Romboide =====");
        System.out.println("Área del romboide r2: " + r2.area());
        System.out.println("Perímetro del romboide r2: " + r2.perimetro() + "\n");

        r1.setBase(8);

        System.out.println("===== Tercer Romboide =====");
        System.out.println("Nueva área del romboide r1 con dimensiones modificadas: " + r1.area());
        System.out.println("Nuevo perímetro del romboide r1 con dimensiones modificadas: " + r1.perimetro() + "\n");

        scanner.close();
    }
}
