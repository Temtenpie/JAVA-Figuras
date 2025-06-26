package HusoCuñaEsferica;


import java.util.Scanner;

class HusoEsferico1 {
    private double radio;
    private double angulo;

    public HusoEsferico1(double radio, double angulo) {
        this.radio = radio;
        this.angulo = angulo;
    }

    public HusoEsferico1() {
        this.radio = 5;
        this.angulo = 45;
    }

    public double area() {
        return 2 * Math.PI * Math.pow(radio, 2) * (angulo / 360);
    }


    public double volumen() {
        return (2 * Math.PI * Math.pow(radio, 3) * (angulo / 360)) / 3;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getRadio() {
        return radio;
    }

    public double getAngulo() {
        return angulo;
    }
}

public class HusoEsferico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese el ángulo del huso en grados: ");
        double angulo = scanner.nextDouble();

        HusoEsferico1 h1 = new HusoEsferico1(radio, angulo);
        HusoEsferico1 h2 = new HusoEsferico1(5, 60);

        System.out.println("\n");
        System.out.println("===== Primer Huso Esférico =====");
        System.out.println("Área del huso esférico h1: " + h1.area());
        System.out.println("Volumen del huso esférico h1: " + h1.volumen() + "\n");

        System.out.println("===== Segundo Huso Esférico =====");
        System.out.println("Área del huso esférico h2: " + h2.area());
        System.out.println("Volumen del huso esférico h2: " + h2.volumen() + "\n");

        h1.setRadio(7);

        System.out.println("===== Tercer Huso Esférico =====");
        System.out.println("Nueva área del huso esférico h1 con dimensiones modificadas: " + h1.area());
        System.out.println("Nuevo volumen del huso esférico h1 con dimensiones modificadas: " + h1.volumen() + "\n");

        scanner.close();
    }
}
