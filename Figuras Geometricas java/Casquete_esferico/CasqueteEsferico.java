package Casquete_esferico;

import java.util.Scanner;

class CasqueteEsferico1 {
    private double radio;
    private double altura;

    public CasqueteEsferico1(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public CasqueteEsferico1() {
        this.radio = 6;
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

public class CasqueteEsferico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese la altura del casquete: ");
        double altura = scanner.nextDouble();

        CasqueteEsferico1 c1 = new CasqueteEsferico1(radio, altura);
        CasqueteEsferico1 c2 = new CasqueteEsferico1(2, 3);

        System.out.println("\n");
        System.out.println("===== Primer Casquete Esférico =====");
        System.out.println("Área del casquete esférico c1: " + c1.area());
        System.out.println("Volumen del casquete esférico c1: " + c1.volumen() + "\n");

        System.out.println("===== Segundo Casquete Esférico =====");
        System.out.println("Área del casquete esférico c2: " + c2.area());
        System.out.println("Volumen del casquete esférico c2: " + c2.volumen() + "\n");

        c1.setRadio(10);

        System.out.println("===== Tercer Casquete Esférico (modificado del primero) =====");
        System.out.println("Nueva área del casquete esférico c1 con dimensiones modificadas: " + c1.area());
        System.out.println("Nuevo volumen del casquete esférico c1 con dimensiones modificadas: " + c1.volumen() + "\n");

        scanner.close();
    }
}
