package Octaedro_regular;

import java.util.Scanner;

class Octaedro {
    private double arista;

    public Octaedro(double arista) {
        this.arista = arista;
    }

    public Octaedro() {
        this.arista = 5;
    }

    public double area() {
        return 2 * Math.sqrt(3) * arista * arista;
    }

    public double volumen() {
        return (Math.sqrt(2) / 3) * arista * arista * arista;
    }

    public double longitudTotalAristas() {
        return 12 * arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double getArista() {
        return arista;
    }
}

public class Octaedro_regular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la arista del octaedro: ");
        double arista = scanner.nextDouble();

        Octaedro o1 = new Octaedro(arista);
        Octaedro o2 = new Octaedro(4);

        System.out.println("\n");
        System.out.println("===== Primer Octaedro =====");
        System.out.println("Área del octaedro o1: " + o1.area());
        System.out.println("Volumen del octaedro o1: " + o1.volumen());
        System.out.println("Longitud total de las aristas del octaedro o1: " + o1.longitudTotalAristas() + "\n");

        System.out.println("===== Segundo Octaedro =====");
        System.out.println("Área del octaedro o2: " + o2.area());
        System.out.println("Volumen del octaedro o2: " + o2.volumen());
        System.out.println("Longitud total de las aristas del octaedro o2: " + o2.longitudTotalAristas() + "\n");

        o1.setArista(7);

        System.out.println("===== Tercer Octaedro =====");
        System.out.println("Nueva área del octaedro o1 con arista modificada: " + o1.area());
        System.out.println("Nuevo volumen del octaedro o1 con arista modificada: " + o1.volumen());
        System.out.println("Nueva longitud total de las aristas del octaedro o1 con arista modificada: " + o1.longitudTotalAristas() + "\n");

        scanner.close();
    }
}
