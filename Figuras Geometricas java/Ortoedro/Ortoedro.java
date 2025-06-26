package Ortoedro;

import java.util.Scanner;

class Ortoedro1 {
    private double largo;
    private double ancho;
    private double alto;

    public Ortoedro1(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Ortoedro1() {
        this.largo = 5;
        this.ancho = 4;
        this.alto = 3;
    }

    public double areaSuperficial() {
        return 2 * (largo * ancho + largo * alto + ancho * alto);
    }

    public double volumen() {
        return largo * ancho * alto;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(largo, 2) + Math.pow(ancho, 2) + Math.pow(alto, 2));
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
}

public class Ortoedro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el largo del ortoedro: ");
        double largo = scanner.nextDouble();
        System.out.print("Ingrese el ancho del ortoedro: ");
        double ancho = scanner.nextDouble();
        System.out.print("Ingrese el alto del ortoedro: ");
        double alto = scanner.nextDouble();

        Ortoedro1 o1 = new Ortoedro1(largo, ancho, alto);
        Ortoedro1 o2 = new Ortoedro1(2, 3, 4);

        System.out.println("\n");
        System.out.println("===== Primer Ortoedro =====");
        System.out.println("Área superficial del ortoedro o1: " + o1.areaSuperficial());
        System.out.println("Volumen del ortoedro o1: " + o1.volumen());
        System.out.println("Diagonal del ortoedro o1: " + o1.diagonal() + "\n");

        System.out.println("===== Segundo Ortoedro =====");
        System.out.println("Área superficial del ortoedro o2: " + o2.areaSuperficial());
        System.out.println("Volumen del ortoedro o2: " + o2.volumen());
        System.out.println("Diagonal del ortoedro o2: " + o2.diagonal() + "\n");

        o1.setLargo(10);

        System.out.println("===== Tercer Ortoedro =====");
        System.out.println("Nueva área superficial del ortoedro o1 con dimensiones modificadas: " + o1.areaSuperficial());
        System.out.println("Nuevo volumen del ortoedro o1 con dimensiones modificadas: " + o1.volumen());
        System.out.println("Nueva diagonal del ortoedro o1 con dimensiones modificadas: " + o1.diagonal() + "\n");

        scanner.close();
    }
}
