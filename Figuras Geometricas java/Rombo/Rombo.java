package Rombo;

import java.util.Scanner;

class Rombo1 {
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo1(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public Rombo1() {
        this.diagonalMayor = 6;
        this.diagonalMenor = 4;
    }

    public double perimetro() {
        double lado = Math.sqrt(Math.pow(diagonalMayor / 2, 2) + Math.pow(diagonalMenor / 2, 2));
        return 4 * lado;
    }

    public double area() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }
}

public class Rombo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la diagonal mayor del rombo: ");
        double diagonalMayor = scanner.nextDouble();
        System.out.print("Ingrese la diagonal menor del rombo: ");
        double diagonalMenor = scanner.nextDouble();

        Rombo1 r1 = new Rombo1(diagonalMayor, diagonalMenor);
        Rombo1 r2 = new Rombo1(2, 3); 
        
        System.out.println("\n");
        System.out.println("===== Primer Rombo =====");
        System.out.println("Perímetro del rombo r1: " + r1.perimetro());
        System.out.println("Área del rombo r1: " + r1.area() + "\n");

        System.out.println("===== Segundo Rombo =====");
        System.out.println("Perímetro del rombo r2: " + r2.perimetro());
        System.out.println("Área del rombo r2: " + r2.area() + "\n");

        r1.setDiagonalMayor(10);
        
        System.out.println("===== Tercer Rombo =====");
        System.out.println("Nuevo perímetro del rombo r1 con dimensiones modificadas: " + r1.perimetro());
        System.out.println("Nueva área del rombo r1 con dimensiones modificadas: " + r1.area() + "\n");

        scanner.close();
    }
}
