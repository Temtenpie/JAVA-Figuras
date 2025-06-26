package Piramide_recta;

import java.util.Scanner;

class PiramideRecta {
    private double base;
    private double altura;

    public PiramideRecta(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public PiramideRecta() {
        this.base = 8;
        this.altura = 5;
    }

    public double areaBase() {
        return base * base;
    }

    public double perimetroBase() {
        return 4 * base;
    }

    public double alturaLateral() {
        return Math.sqrt((base / 2) * (base / 2) + altura * altura);
    }

    public double areaLateral() {
        return perimetroBase() * alturaLateral() / 2;
    }

    public double areaTotal() {
        return areaBase() + areaLateral();
    }

    public double volumen() {
        return (areaBase() * altura) / 3;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}

public class Piramide_Recta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la base de la pirámide: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        double altura = scanner.nextDouble();

        PiramideRecta p1 = new PiramideRecta(base, altura);
        PiramideRecta p2 = new PiramideRecta(4, 6);

        System.out.println("\n");
        System.out.println("===== Primera Pirámide =====");
        System.out.println("Área de la base de la pirámide p1: " + p1.areaBase());
        System.out.println("Perímetro de la base de la pirámide p1: " + p1.perimetroBase());
        System.out.println("Altura lateral de la pirámide p1: " + p1.alturaLateral());
        System.out.println("Área lateral de la pirámide p1: " + p1.areaLateral());
        System.out.println("Área total de la pirámide p1: " + p1.areaTotal());
        System.out.println("Volumen de la pirámide p1: " + p1.volumen() + "\n");

        System.out.println("===== Segunda Pirámide =====");
        System.out.println("Área de la base de la pirámide p2: " + p2.areaBase());
        System.out.println("Perímetro de la base de la pirámide p2: " + p2.perimetroBase());
        System.out.println("Altura lateral de la pirámide p2: " + p2.alturaLateral());
        System.out.println("Área lateral de la pirámide p2: " + p2.areaLateral());
        System.out.println("Área total de la pirámide p2: " + p2.areaTotal());
        System.out.println("Volumen de la pirámide p2: " + p2.volumen() + "\n");

        p1.setBase(5);
   
        System.out.println("===== Tercera Pirámide =====");
        System.out.println("Nueva área de la base de la pirámide p1 con base modificada: " + p1.areaBase());
        System.out.println("Nuevo perímetro de la base de la pirámide p1 con base modificada: " + p1.perimetroBase());
        System.out.println("Nueva altura lateral de la pirámide p1 con altura modificada: " + p1.alturaLateral());
        System.out.println("Nueva área lateral de la pirámide p1 con altura modificada: " + p1.areaLateral());
        System.out.println("Nueva área total de la pirámide p1 con altura modificada: " + p1.areaTotal());
        System.out.println("Nuevo volumen de la pirámide p1 con altura modificada: " + p1.volumen() + "\n");

        scanner.close();
    }
}
