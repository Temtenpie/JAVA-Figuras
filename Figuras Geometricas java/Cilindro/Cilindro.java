import java.util.Scanner;

class Cilindroa{
    
    private int radio;
    private int altura;
    private double pi;

    // Constructor por defecto
    
    public Cilindroa() {
        radio =2;
        altura= 5;
        pi = 3.14;
    
    }
    // Constructor con parámetros
    public Cilindroa(int radio, int altura, double pi) {
        this.radio = radio;
        this.altura = altura;
        this.pi = pi;
        
    }

    public double area() {
        return (((2)*(pi)*(radio))*(altura+radio));
    }
    // Método para calcular el perímetro
    public double volumen() {
        return ((pi)*(Math.pow(radio,2))*(altura));
    }
    
    // Métodos setters
    public int getradio() {
        return radio;
    }

    public void setradio(int radio) {
        this.radio = radio;
    }
    public int getaltura() {
        return altura;
    }

    public void setaltura(int altura) {
        this.radio = altura;
    }
    public double getPI() {
        return pi;
    }

    public void setpi(double pi) {
        this.pi = pi;
    }

}


public class Cilindro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        int radio = scanner.nextInt();

        System.out.println("Ingrese el valor de la altura: ");
        int altura = scanner.nextInt();

        System.out.println("Ingrese el valor de pi : ");
        double pi = scanner.nextDouble();

        Cilindroa c1 = new Cilindroa(radio, altura, pi);
        Cilindroa c2 = new Cilindroa(5,9,3.14);
        
        System.out.println("\n");
        System.out.println("===== Primer Cilindro =====");
        System.out.println("El area del cilindro c1: " + c1.area());
        System.out.println("El volumen del cilidro c1: " + c1.volumen() + "\n");
        
        System.out.println("===== Segundo Cilindro =====");
        System.out.println("El area del cilindro c2: " + c2.area());
        System.out.println("El volumen del cilidro c2: " + c2.volumen() + "\n");
        
        c1.setradio(5);

        System.out.println("===== Tercer Cilindro (modificado del primero) =====");
        System.out.println("la nueva area del cilindro c1 es: " + c1.area());
        System.out.println("El nuevo volumen del cilindro c1: " + c1.volumen()+ "\n");

        scanner.close();
    }

}

