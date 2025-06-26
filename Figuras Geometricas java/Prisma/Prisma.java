package Prisma;

import java.util.Scanner;

class Prisma1 {
    private double base;
    private double alturaBase;
    private double alturaPrisma;

    public Prisma1(double base, double alturaBase, double alturaPrisma) {
        this.base = base;
        this.alturaBase = alturaBase;
        this.alturaPrisma = alturaPrisma;
    }

    public Prisma1() {
        this.base = 5;
        this.alturaBase = 3;
        this.alturaPrisma = 10;
    }

    public double areaLateral() {
        return 2 * (base + alturaBase) * alturaPrisma;
    }

    public double areaTotal() {
        double areaBase = base * alturaBase;
        return 2 * areaBase + areaLateral();
    }

    public double volumen() {
        return base * alturaBase * alturaPrisma;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAlturaBase(double alturaBase) {
        this.alturaBase = alturaBase;
    }

    public void setAlturaPrisma(double alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    public double getBase() {
        return base;
    }

    public double getAlturaBase() {
        return alturaBase;
    }

    public double getAlturaPrisma() {
        return alturaPrisma;
    }
}

public class Prisma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la base del prisma: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la base del prisma: ");
        double alturaBase = scanner.nextDouble();
        System.out.print("Ingrese la altura del prisma: ");
        double alturaPrisma = scanner.nextDouble();

        Prisma1 p1 = new Prisma1(base, alturaBase, alturaPrisma);
        Prisma1 p2 = new Prisma1(2, 3, 4);

        System.out.println("\n");
        System.out.println("===== Primer Prisma =====");
        System.out.println("Área lateral del prisma p1: " + p1.areaLateral());
        System.out.println("Área total del prisma p1: " + p1.areaTotal());
        System.out.println("Volumen del prisma p1: " + p1.volumen() + "\n");

        System.out.println("===== Segundo Prisma =====");
        System.out.println("Área lateral del prisma p2: " + p2.areaLateral());
        System.out.println("Área total del prisma p2: " + p2.areaTotal());
        System.out.println("Volumen del prisma p2: " + p2.volumen() + "\n");

        p1.setBase(7);

        System.out.println("===== Tercer Prisma =====");
        System.out.println("Nueva área lateral del prisma p1 con dimensiones modificadas: " + p1.areaLateral());
        System.out.println("Nueva área total del prisma p1 con dimensiones modificadas: " + p1.areaTotal());
        System.out.println("Nuevo volumen del prisma p1 con dimensiones modificadas: " + p1.volumen() + "\n");

        scanner.close();
    }
}
