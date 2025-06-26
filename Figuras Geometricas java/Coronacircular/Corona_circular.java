package Coronacircular;

import java.util.Scanner;

class CoronaCircular {
    private double rExterior;
    private int rInterior;

    public CoronaCircular(double rExterior, int rInterior) {
        this.rExterior = rExterior;
        this.rInterior = rInterior;
    }

    public CoronaCircular() {
        this.rExterior = 5;
        this.rInterior = 4;
    }

public double area() {
    return Math.PI * (Math.pow(rExterior, 2) - Math.pow(rInterior, 2));
}
    public double PerimetroExterior() {
        return 2*Math.PI*rExterior;
    }
    public double PerimetroInterior() {
        return 2*Math.PI*rInterior;
    }

    public void setrExterior(double rExterior) {
        this.rExterior = rExterior;
    }

    public void setrInterior(int rInterior) {
        this.rInterior = rInterior;
    }

    public double getrExterior() {
        return rExterior;
    }

    public int getrInterior() {
        return rInterior;
    }

}

public class Corona_circular {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio exterior de la corona circular: ");
        double rExterior = scanner.nextDouble();
        System.out.print("Ingrese el radio interior de la corona circular: ");
        int rInterior = scanner.nextInt();

        
        CoronaCircular C1 = new CoronaCircular(rExterior, rInterior);

        CoronaCircular C2 = new CoronaCircular(7,6);

        System.out.println("\n");
        System.out.println("===== Primera Corona Circular =====");
        System.out.println("Área del Corona Circular C1: " + C1.area());
        System.out.println("Perímetro del Corona Circular C1: " + C1.PerimetroExterior());
        System.out.println("Apotema del Corona Circular C1: " + C1.PerimetroInterior()+ "\n");
        
        System.out.println("===== Segunda Corona Circular =====");
        System.out.println("Área del Corona Circular C2: " + C2.area());
        System.out.println("Perímetro del Corona Circular C2: " + C2.PerimetroExterior());
        System.out.println("Apotema del Corona Circular C2: " + C2.PerimetroInterior()+ "\n");
      
        C1.setrExterior(8);
       
        System.out.println("===== Tercera Corona Circular =====");
        System.out.println("Área del Corona Circular C3: " + C1.area());
        System.out.println("Perímetro del Corona Circular C3: " + C1.PerimetroExterior());
        System.out.println("Apotema del Corona Circular C3: " + C1.PerimetroInterior()+ "\n");
     
        scanner.close();
    }

}
