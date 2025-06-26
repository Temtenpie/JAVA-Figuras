import java.util.Scanner;

class Circuloa{
    
    private int radio;
    private double pi;

    // Constructor por defecto
    
    public Circuloa() {
        radio =2;
        pi = 3.14;
    
    }
    // Constructor con parámetros
    public Circuloa(int radio, double pi) {
        this.radio = radio;
        this.pi = pi;
    }

    public double area() {
        return ((pi)*(Math.pow(radio,2)));
    }
    // Método para calcular el perímetro
    public double perimetro() {
        return ((2)*(pi)*(radio));
    }
    
    // Métodos setters
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
public class Circulo{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        int radio = scanner.nextInt();

        System.out.println("Ingrese el valor de pi : ");
        double pi = scanner.nextDouble();

        Circuloa c1 = new Circuloa (radio,pi);
        Circuloa c2 = new Circuloa(6, 3.14);

        System.out.println("\n");
        System.out.println("===== Primer Circulo =====");
        System.out.println("El area del circulo c1: " + c1.area());
        System.out.println("El perimeto del circulo c1: " + c1.perimetro()+ "\n");
        
        System.out.println("===== Segundo Circulo =====");
        System.out.println("El area del circulo c2: " + c2.area());
        System.out.println("El perimetro del circulo c2: " + c2.perimetro()+ "\n");
        
        c1.setradio(4);

        System.out.println("===== Tercer Circulo (modificadod el primero) =====");
        System.out.println("la nueva area del circulo c1 es: " + c1.area());
        System.out.println("El nuevo perimetro del circulo c1: " + c1.perimetro()+ "\n");

        scanner.close();
    }

}

