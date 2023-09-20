import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c, x1, x2;
        
        System.out.println("Ingrese el valor de a");
        do {
           a = scan.nextInt(); 
        } while (a < 0);
        System.out.println("Ingrese el valor de b");
        do {
           b = scan.nextInt(); 
        } while (b < 0);
        System.out.println("Ingrese el valor de c");
        do {
           c = scan.nextInt(); 
        } while (c < 0);

        double determinante = (b*b) - 4* (a*c);

        if (determinante < 0) {
            System.out.println("NO existe raiz de un numero negativo");
        } else {
            x1 = b + Math.sqrt(determinante);
            x2 = b - Math.sqrt(determinante)/(2*a);
        }
    }
}
