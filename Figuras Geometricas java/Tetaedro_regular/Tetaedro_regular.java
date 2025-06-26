import java.util.Scanner;

class TetraedroRegular {
    private double tamanoLados;
    
    public TetraedroRegular(double tamanoLados) {
        this.tamanoLados = tamanoLados;
    }

    public TetraedroRegular() {
        this.tamanoLados = 3;
    }

    public double perimetro() {
        return tamanoLados * 6;
    }

    public double area() {
        return (Math.pow(tamanoLados, 2))*(Math.sqrt(3));
    }

    public double volumen() {
        return (Math.pow(tamanoLados, 3))*(Math.sqrt(2))/12;
    }

    public double altura() {
        return (tamanoLados)*(Math.sqrt(6))/3;
    }

    public void setTamanoLados(double tamanoLados) {
        this.tamanoLados = tamanoLados;
    }

    public double getTamanoLados() {
        return tamanoLados;
    }

}

public class Tetaedro_regular {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de un lado: ");
        double tamanoLados = scanner.nextDouble();

        TetraedroRegular t1 = new TetraedroRegular(tamanoLados);

        TetraedroRegular t2 = new TetraedroRegular(4);

        System.out.println("\n");
        System.out.println("===== Primer Tatraedro Regular =====");
        System.out.println("Perímetro del Tatraedro regular t1: " + t1.perimetro());
        System.out.println("Área del Tatraedro regular t1: " + t1.area());
        System.out.println("Volumen del Tatraedro regular t1: " + t1.volumen());
        System.out.println("Altura del Tatraedro regular t1: " + t1.altura()+ "\n");
        
        System.out.println("===== Segundo Tatraedro Regular =====");
        System.out.println("Perímetro del Tatraedro regular t2: " + t2.perimetro());
        System.out.println("Área del Tatraedro regular t2: " + t2.area());
        System.out.println("Volumen del Tatraedro regular t2: " + t2.volumen());
        System.out.println("Altura del Tatraedro regular t2: " + t2.altura()+ "\n");
      
        t1.setTamanoLados(8);
       
        System.out.println("===== Tercer Tatraedro Regular (modificado del primero) =====");
        System.out.println("Nuevo perímetro del Tatraedro regular t1 con lado modificado: " + t1.perimetro());
        System.out.println("Área del Tatraedro regular t1: " + t1.area());
        System.out.println("Nuevo volumen del Tatraedro regular t1 con lado modificado: " + t1.volumen());
        System.out.println("Nueva altura del Tatraedro regular t1 con lado modificado: " + t1.altura()+ "\n");
     
        scanner.close();
    } 
}
