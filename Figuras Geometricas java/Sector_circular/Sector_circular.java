import java.util.Scanner;

class SectorCircular {
    private double radio;
    private int numeroGrados;
    private double pi;

    public SectorCircular() {
        radio = 5;
        numeroGrados = 180;
        pi = 3.14;
    }

    public SectorCircular(double radio, int numeroGrados, double pi) {
        this.radio = radio;
        this.numeroGrados = numeroGrados;
        this.pi = pi;
    }

    public double area() {
        return ((pi) * (Math.pow(radio, 2)) * (numeroGrados)) / (360);

    }

    public void setradio(double radio) {
        this.radio = radio;
    }

    public void setnumeroGrados(int numeroGrados) {
        this.numeroGrados = numeroGrados;
    }

    public void setpi(double pi) {
        this.pi = pi;
    }

    public double getradio() {
        return radio;
    }

    public int getnumeroGrados() {
        return numeroGrados;
    }

    public double getPI() {
        return pi;
    }

}

public class Sector_circular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n");
        System.out.print("Ingrese el radio : " + "\n");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese el numero de grados: " + "\n");
        int numeroGrados = scanner.nextInt();
        System.out.print("Ingrese el valor de pi : " + "\n");
        double pi = scanner.nextDouble();

        SectorCircular s1 = new SectorCircular(radio, numeroGrados, pi);
        SectorCircular s2 = new SectorCircular(7, 150, 3.14);

        System.out.println("\n");
        System.out.println("=== Primer Sector Circular ===");
        System.out.println("Área del sector circular S1: " + s1.area() + "\n");
        System.out.println("=== Segundo Sector Circular ===");
        System.out.println("Área del sector Circular S2: " + s2.area() + "\n");

        s1.setradio(4);
        
        System.out.println("=== Tercer Sector Circular (modificado del primero) ===");
        System.out.println("nueva area del sector Circular S1: " + s1.area() + "\n");

        scanner.close();
    }

}