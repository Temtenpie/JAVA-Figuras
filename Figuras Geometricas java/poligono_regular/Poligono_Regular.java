package poligono_regular;

import java.util.Scanner;

class PoligonoRegular {
    private double tamanoLados;
    private int numeroLados;

    public PoligonoRegular(double tamanoLados, int numeroLados) {
        this.tamanoLados = tamanoLados;
        this.numeroLados = numeroLados;
    }

    public PoligonoRegular() {
        this.tamanoLados = 3;
        this.numeroLados = 5;
    }

    public double perimetro() {
        return tamanoLados * numeroLados;
    }
    public double alfa() {
        return 360.0 / numeroLados;
    }
    public double apotema() {
        double alfaRadianes = Math.toRadians(alfa() / 2);
        return tamanoLados / (2 * Math.tan(alfaRadianes));
    }
    public double area() {
        double apotema = apotema();
        double perimetro = perimetro();
        return (perimetro * apotema) / 2;
    }
    
    public void setTamanoLados(double tamanoLados) {
        this.tamanoLados = tamanoLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public double getTamanoLados() {
        return tamanoLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

}

public class Poligono_Regular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de un lado: ");
        double tamanoLados = scanner.nextDouble();
        System.out.print("Ingrese el número de lados: ");
        int numeroLados = scanner.nextInt();

        PoligonoRegular p1 = new PoligonoRegular(tamanoLados, numeroLados);

        PoligonoRegular p2 = new PoligonoRegular(2, 3);

        System.out.println("\n");
        System.out.println("===== Primer Poligono Regular =====");
        System.out.println("Perímetro del polígono regular p1: " + p1.perimetro());
        System.out.println("Alfa del polígono regular p1: " + p1.alfa());
        System.out.println("Apotema del polígono regular p1: " + p1.apotema());
        System.out.println("Área del polígono regular p1: " + p1.area()+ "\n");
        
        System.out.println("===== Segundo Poligono Regular =====");
        System.out.println("Perímetro del polígono regular p2: " + p2.perimetro());
        System.out.println("Alfa del polígono regular p2: " + p2.alfa());
        System.out.println("Apotema del polígono regular p2: " + p2.apotema());
        System.out.println("Área del polígono regular p2: " + p2.area()+ "\n");
      
        p1.setTamanoLados(8);
       
        System.out.println("===== Tercer Poligono Regular (modificado del primero) =====");
        System.out.println("Nuevo perímetro del polígono regular p1 con lado modificado: " + p1.perimetro());
        System.out.println("Alfa del polígono regular p1: " + p1.alfa());
        System.out.println("Nuevo potema del polígono regular p1 con lado modificado: " + p1.apotema());
        System.out.println("Nueva área del polígono regular p1 con lado modificado: " + p1.area()+ "\n");
     
        scanner.close();
    }

}
