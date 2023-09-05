import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);

        double lado1 = 0, lado2 = 0, lado3 = 0;

        System.out.println("TRIANGULO");
        System.out.println("Inserte la longitud del primer lado: ");
        System.out.println("Inserte la longitud del segundo lado: ");
        System.out.println("Inserte la longitud del tercer lado: ");

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es un triangulo equilatero");
        }else if (lado1 != lado2 && lado2 != lado3) {
            System.out.println("Es un triangulo escaleno");
        }else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            System.out.println("Es un triangulo isosceles");
        } else {
            
        }
    }
}
