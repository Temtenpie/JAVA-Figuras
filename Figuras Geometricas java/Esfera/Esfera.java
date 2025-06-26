import java.util.Scanner;

class Esfera1 {

    private int radio;
    private double pi;

    public Esfera1(){
        radio=2;
        pi=3.14;
    }

    public Esfera1(int radio, double pi) {
        this.radio = radio;
        this.pi = pi;
    }
    public double area() {
        return ((4)*(pi)*(Math.pow(radio,2)));
    }

   

    public int getradio() {
        return radio;
    }

    public void setradio(int radio) {
        this.radio = radio;
    }

    public double getPI() {
        return pi;
    }

    public void setpi(double pi) {
        this.pi = pi;
    }
}



public class Esfera {
   
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        int radio = scanner.nextInt();

        System.out.println("Ingrese el valor de pi : ");
        double pi = scanner.nextDouble();

        Esfera1 e1 = new Esfera1(radio,pi);
        Esfera1 e2 = new Esfera1(5,3.14);

        System.out.println("\n");
        System.out.println("=== Primera Esfera ===");
        System.out.println("El area de la Esfera e1: " + e1.area()+"\n");
        
        System.out.println("=== Segunda Esfera ===");
        System.out.println("El area de la Esfera e2: " + e2.area()+"\n");
        
        e1.setradio(6);

        System.out.println("=== Tercera Esfera ===");
        System.out.println("la nueva area de la esfera e1 es: " + e1.area()+"\n");
        scanner.close();

        }
    }
    

