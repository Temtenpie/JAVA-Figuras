package Cono;

import java.util.Scanner;

class Cono1 {
    private double radio;
    private double altura;

    public Cono1(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public Cono1() {
        this.radio = 5;
        this.altura = 10;
    }

    public double generatriz() {
        return Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
    }

    public double areaLateral() {
        return Math.PI * radio * generatriz();
    }

    public double areaTotal() {
        return areaLateral() + (Math.PI * Math.pow(radio, 2));
    }

    public double volumen() {
        return (Math.PI * Math.pow(radio, 2) * altura) / 3;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }
}

public class Cono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la base del cono: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese la altura del cono: ");
        double altura = scanner.nextDouble();

        Cono1 c1 = new Cono1(radio, altura);
        Cono1 c2 = new Cono1(2, 3);

        System.out.println("\n");
        System.out.println("===== Primer Cono =====");
        System.out.println("Generatriz del cono c1: " + c1.generatriz());
        System.out.println("Área lateral del cono c1: " + c1.areaLateral());
        System.out.println("Área total del cono c1: " + c1.areaTotal());
        System.out.println("Volumen del cono c1: " + c1.volumen() + "\n");

        System.out.println("===== Segundo Cono =====");
        System.out.println("Generatriz del cono c2: " + c2.generatriz());
        System.out.println("Área lateral del cono c2: " + c2.areaLateral());
        System.out.println("Área total del cono c2: " + c2.areaTotal());
        System.out.println("Volumen del cono c2: " + c2.volumen() + "\n");

        c1.setRadio(7);

        System.out.println("===== Tercer Cono =====");
        System.out.println("Nueva generatriz del cono c1 con dimensiones modificadas: " + c1.generatriz());
        System.out.println("Nueva área lateral del cono c1 con dimensiones modificadas: " + c1.areaLateral());
        System.out.println("Nueva área total del cono c1 con dimensiones modificadas: " + c1.areaTotal());
        System.out.println("Nuevo volumen del cono c1 con dimensiones modificadas: " + c1.volumen() + "\n");

        scanner.close();
    }
}
