package Tronco_de_cono;

import java.util.Scanner;

class TroncoDeCono {
    private double radioMayor;
    private double radioMenor;
    private double altura;

    public TroncoDeCono(double radioMayor, double radioMenor, double altura) {
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
        this.altura = altura;
    }

    public TroncoDeCono() {
        this.radioMayor = 6;
        this.radioMenor = 3; 
        this.altura = 8;
    }

    public double generatriz() {
        return Math.sqrt(Math.pow(radioMayor - radioMenor, 2) + Math.pow(altura, 2));
    }

    public double areaLateral() {
        return Math.PI * generatriz() * (radioMayor + radioMenor);
    }

    public double areaTotal() {
        double areaBaseMayor = Math.PI * Math.pow(radioMayor, 2);
        double areaBaseMenor = Math.PI * Math.pow(radioMenor, 2);
        return areaLateral() + areaBaseMayor + areaBaseMenor;
    }

    public double volumen() {
        return (Math.PI * altura / 3) * (Math.pow(radioMayor, 2) + Math.pow(radioMenor, 2) + radioMayor * radioMenor);
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadioMayor() {
        return radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

    public double getAltura() {
        return altura;
    }
}

public class TroncoCono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio mayor del tronco de cono: ");
        double radioMayor = scanner.nextDouble();
        System.out.print("Ingrese el radio menor del tronco de cono: ");
        double radioMenor = scanner.nextDouble();
        System.out.print("Ingrese la altura del tronco de cono: ");
        double altura = scanner.nextDouble();

        TroncoDeCono t1 = new TroncoDeCono(radioMayor, radioMenor, altura);
        TroncoDeCono t2 = new TroncoDeCono(2, 3, 4); // Tronco de cono con valores por defecto

        System.out.println("\n");
        System.out.println("===== Primer Tronco de Cono =====");
        System.out.println("Generatriz del tronco de cono t1: " + t1.generatriz());
        System.out.println("Área lateral del tronco de cono t1: " + t1.areaLateral());
        System.out.println("Área total del tronco de cono t1: " + t1.areaTotal());
        System.out.println("Volumen del tronco de cono t1: " + t1.volumen() + "\n");

        System.out.println("===== Segundo Tronco de Cono =====");
        System.out.println("Generatriz del tronco de cono t2: " + t2.generatriz());
        System.out.println("Área lateral del tronco de cono t2: " + t2.areaLateral());
        System.out.println("Área total del tronco de cono t2: " + t2.areaTotal());
        System.out.println("Volumen del tronco de cono t2: " + t2.volumen() + "\n");

        t1.setRadioMayor(10);

        System.out.println("===== Tercer Tronco de Cono =====");
        System.out.println("Nueva generatriz del tronco de cono t1 con dimensiones modificadas: " + t1.generatriz());
        System.out.println("Nueva área lateral del tronco de cono t1 con dimensiones modificadas: " + t1.areaLateral());
        System.out.println("Nueva área total del tronco de cono t1 con dimensiones modificadas: " + t1.areaTotal());
        System.out.println("Nuevo volumen del tronco de cono t1 con dimensiones modificadas: " + t1.volumen() + "\n");

        scanner.close();
    }
}
