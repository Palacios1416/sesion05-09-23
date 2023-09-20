import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);

        double lado1 = 0, lado2 = 0, lado3 = 0;
        boolean condition;

        System.out.println("TRIANGULO");
        System.out.println("Inserte la longitud del primer lado: ");
        do {
        lado1 = scanner.nextDouble();
        } while (lado1 <= 0);
        
        System.out.println("Inserte la longitud del segundo lado: ");
        do {
        lado2 = scanner.nextDouble();    
        } while (lado2 <= 0);
        System.out.println("Inserte la longitud del tercer lado: ");
        do {
        lado3 = scanner.nextDouble();    
        } while (lado3 <= 0);

        if ((lado1 + lado2) == lado3 || (lado2 + lado3) == lado1 || (lado1 + lado3) == lado2) {

            if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {

            System.out.println("Es un triangulo equilatero");

            }else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {

            System.out.println("Es un triangulo escaleno");

            }else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {

            System.out.println("Es un triangulo isosceles");

            }  

        } else if ((lado1*lado1) == (lado2*lado2) + (lado3*lado3)){

            System.out.println("Es un triangulo rectangulo");

            }else {
                
            System.out.println("No es un triangulo");
        }
    }
}
