package Tronco_de_piramide;

import java.util.Scanner;

class TroncoPiramide {
    private double Bmayor;
    private double Bmenor;
    private double altura;

    public TroncoPiramide(double Bmayor, double Bmenor, double altura) {
        this.Bmayor = Bmayor;
        this.Bmenor = Bmenor;
        this.altura = altura;
    }

    public TroncoPiramide() {
        this.Bmayor = 6;
        this.Bmenor = 4;
        this.altura = 5;
    }

    public double areaBmayor() {
        return Bmayor * Bmayor;
    }

    public double areaBmenor() {
        return Bmenor * Bmenor;
    }

    public double perimetroBmayor() {
        return 4 * Bmayor;
    }

    public double perimetroBmenor() {
        return 4 * Bmenor;
    }

    public double areaLateral() {
        double alturaLateral1 = Math.sqrt((Bmayor / 2 - Bmenor / 2) * (Bmayor / 2 - Bmenor / 2) + altura * altura);
        double areaLateral1 = (Bmayor + Bmenor) * alturaLateral1 / 2;
        return 4 * areaLateral1;
    }

    public double areaTotal() {
        return areaBmayor() + areaBmenor() + areaLateral();
    }

    public double volumen() {
        return (altura / 3) * (areaBmayor() + areaBmenor() + Math.sqrt(areaBmayor() * areaBmenor()));
    }

    public void setBmayor(double Bmayor) {
        this.Bmayor = Bmayor;
    }

    public void setBmenor(double Bmenor) {
        this.Bmenor = Bmenor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBmayor() {
        return Bmayor;
    }

    public double getBmenor() {
        return Bmenor;
    }

    public double getAltura() {
        return altura;
    }
}

public class Tronco_Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la base mayor del tronco: ");
        double Bmayor = scanner.nextDouble();
        System.out.print("Ingrese la longitud de la base menor del tronco: ");
        double Bmenor = scanner.nextDouble();
        System.out.print("Ingrese la altura del tronco: ");
        double altura = scanner.nextDouble();

        TroncoPiramide t1 = new TroncoPiramide(Bmayor, Bmenor, altura);
        TroncoPiramide t2 = new TroncoPiramide(2, 3, 4);

        System.out.println("\n");
        System.out.println("===== Primer Tronco de Pirámide =====");
        System.out.println("Área de la base mayor del tronco t1: " + t1.areaBmayor());
        System.out.println("Área de la base menor del tronco t1: " + t1.areaBmenor());
        System.out.println("Área lateral del tronco t1: " + t1.areaLateral());
        System.out.println("Área total del tronco t1: " + t1.areaTotal());
        System.out.println("Volumen del tronco t1: " + t1.volumen() + "\n");

        System.out.println("===== Segundo Tronco de Pirámide =====");
        System.out.println("Área de la base mayor del tronco t2: " + t2.areaBmayor());
        System.out.println("Área de la base menor del tronco t2: " + t2.areaBmenor());
        System.out.println("Área lateral del tronco t2: " + t2.areaLateral());
        System.out.println("Área total del tronco t2: " + t2.areaTotal());
        System.out.println("Volumen del tronco t2: " + t2.volumen() + "\n");

        t1.setBmayor(8);

        System.out.println("===== Tercer Tronco de Pirámide =====");
        System.out.println("Nueva área de la base mayor del tronco t1 con base modificada: " + t1.areaBmayor());
        System.out.println("Nueva área de la base menor del tronco t1 con base modificada: " + t1.areaBmenor());
        System.out.println("Nueva área lateral del tronco t1 con altura modificada: " + t1.areaLateral());
        System.out.println("Nueva área total del tronco t1 con altura modificada: " + t1.areaTotal());
        System.out.println("Nuevo volumen del tronco t1 con altura modificada: " + t1.volumen() + "\n");

        scanner.close();
    }
}
