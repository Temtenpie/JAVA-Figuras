package Zona_esferica;

import java.util.Scanner;

class ZonaEsferica1 {
    private double radio;
    private double altura;

    public ZonaEsferica1(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public ZonaEsferica1() {
        this.radio = 5;
        this.altura = 3;
    }

    public double area() {
        return 2 * Math.PI * radio * altura;
    }

    public double volumen() {
        return (Math.PI * Math.pow(altura, 2) * (3 * radio - altura)) / 3;
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

public class ZonaEsferica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese la altura de la zona esférica: ");
        double altura = scanner.nextDouble();

        ZonaEsferica1 z1 = new ZonaEsferica1(radio, altura);
        ZonaEsferica1 z2 = new ZonaEsferica1(2, 3);

        System.out.println("\n");
        System.out.println("===== Primera Zona Esférica =====");
        System.out.println("Área de la zona esférica z1: " + z1.area());
        System.out.println("Volumen de la zona esférica z1: " + z1.volumen() + "\n");

        System.out.println("===== Segunda Zona Esférica =====");
        System.out.println("Área de la zona esférica z2: " + z2.area());
        System.out.println("Volumen de la zona esférica z2: " + z2.volumen() + "\n");

        z1.setAltura(4);

        System.out.println("===== Tercera Zona Esférica =====");
        System.out.println("Nueva área de la zona esférica z1 con dimensiones modificadas: " + z1.area());
        System.out.println("Nuevo volumen de la zona esférica z1 con dimensiones modificadas: " + z1.volumen() + "\n");

        scanner.close();
    }
}
