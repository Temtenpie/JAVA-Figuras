package Piramide_cuadrangular;

import java.util.Scanner;

class PiramideCuadrangular {

    private double tamanoLados;
    private double apotema;

    public PiramideCuadrangular(double tamanoLados, double apotema) {
        this.tamanoLados = tamanoLados;
        this.apotema = apotema;
    }

    public PiramideCuadrangular() {
        this.tamanoLados = 3;
        this.apotema = 5;
    }

    public double perimetro() {
        return tamanoLados * 4;
    }

    public double altura() {
        return Math.sqrt(Math.pow(apotema, 2) - Math.pow(tamanoLados / 2, 2));
    }
    
    public double areaBase() {
        return Math.pow(tamanoLados, 2);
    }
    
    public double volumen() {
        return (1.0 / 3.0) * areaBase() * altura();
    }   

    public double superficie() {
        return (tamanoLados) * (Math.sqrt(6)) / 3;
    }

    public void setTamanoLados(double tamanoLados) {
        this.tamanoLados = tamanoLados;
    }

    public double getTamanoLados() {
        return tamanoLados;
    }

}

public class Piramide_cuadrangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de un lado: ");
        double tamanoLados = scanner.nextDouble();

        System.out.print("Ingrese el apotema: ");
        double apotema = scanner.nextDouble();

        PiramideCuadrangular p1 = new PiramideCuadrangular(tamanoLados, apotema);

        PiramideCuadrangular p2 = new PiramideCuadrangular(3, apotema);

        System.out.println("\n");
        System.out.println("===== Primera Piramide Cuadrangular =====");
        System.out.println("Perímetro de la Piramide Cuadrangular p1: " + p1.perimetro());
        System.out.println("Altura de la Piramide Cuadrangular p1: " + p1.altura());
        System.out.println("Area base de la Piramide Cuadrangular p1: " + p1.areaBase());
        System.out.println("Volumen de la Piramide Cuadrangular p1: " + p1.volumen());
        System.out.println("Superficie de la Piramide Cuadrangular p1: " + p1.superficie() + "\n");

        System.out.println("===== Segunda Piramide Cuadrangular =====");
        System.out.println("Perímetro de la Piramide Cuadrangular p2: " + p2.perimetro());
        System.out.println("Altura de la Piramide Cuadrangular p2: " + p2.altura());
        System.out.println("Area base de la Piramide Cuadrangular p1: " + p2.areaBase());
        System.out.println("Volumen de la Piramide Cuadrangular p2: " + p2.volumen());
        System.out.println("Superficie de la Piramide Cuadrangular p2: " + p2.superficie() + "\n");

        p1.setTamanoLados(8);

        System.out.println("===== Tercera Piramide Cuadrangular =====");
        System.out.println("Nuevo perímetro de la Piramide Cuadrangular p3 con lado modificado: " + p1.perimetro());
        System.out.println("Altura de la Piramide Cuadrangular p3: " + p1.altura());
        System.out.println("Nueva area base de la Piramide Cuadrangular p3: " + p1.areaBase());
        System.out.println("Nuevo volumen de la Piramide Cuadrangular p3 con lado modificado: " + p1.volumen());
        System.out.println("Nueva Superficie de la Piramide Cuadrangular p3 con lado modificado: " + p1.superficie() + "\n");

        scanner.close();
    }
}
