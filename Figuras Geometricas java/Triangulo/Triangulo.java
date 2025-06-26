package Triangulo;  // Aseguramos que el paquete sea "Triangulo"

import java.util.Scanner;  // Importación necesaria para usar Scanner

class triangulo_completo {
    private int ladoA, ladoB, ladoC;

    // Constructor por defecto
    public triangulo_completo() {
        ladoA = 3;
        ladoB = 2;
        ladoC = 4;
    }

    // Constructor con parámetros
    public triangulo_completo(int a, int b, int c) {
        ladoA = a;
        ladoB = b;
        ladoC = c;
    }

    // Método para calcular el perímetro
    public int perimetro() {
        return ladoA + ladoB + ladoC;
    }

    // Métodos setters
    public void setLadoA(int a) {
        ladoA = a;
    }

    public void setLadoB(int b) {
        ladoB = b;
    }

    public void setLadoC(int c) {
        ladoC = c;
    }

    // Métodos getters
    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }
}

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar valores para el triángulo t1
        System.out.print("Ingrese el valor del lado A para el triangulo t1: ");
        int ladoA1 = scanner.nextInt();
        System.out.print("Ingrese el valor del lado B para el triangulo t1: ");
        int ladoB1 = scanner.nextInt();
        System.out.print("Ingrese el valor del lado C para el triangulo t1: ");
        int ladoC1 = scanner.nextInt();

        // Crear instancias de Triangulo
        triangulo_completo t1 = new triangulo_completo(ladoA1, ladoB1, ladoC1);
        triangulo_completo t2 = new triangulo_completo(5, 6, 7);

        // Mostrar perímetros de los triángulos
        System.out.println("\n");
        System.out.println("===== Primer Triángulo =====");
        System.out.println("Perimetro del triángulo t1: " + t1.perimetro()+"\n");
        System.out.println("===== Segundo Triángulo =====");
        System.out.println("Perimetro del triángulo t2: " + t2.perimetro()+"\n");

        // Cambiar el valor del lado A de t1 y mostrar el nuevo perímetro
        t1.setLadoA(6);

        System.out.println("===== Tercer Triángulo (modificado del primero) =====");
        System.out.println("Nuevo perímetro del triangulo t1: " + t1.perimetro()+"\n");

        scanner.close();  // Cerrar el Scanner
    }
}

