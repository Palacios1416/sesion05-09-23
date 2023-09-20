import java.util.Scanner;
public class Ejercicio6 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int numCuenta;
        double saldoMinimo, saldoNuevo, saldoActual, interes = 0;
        char tipoCuenta;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta: ");
        do {
           numCuenta = scan.nextInt(); 
        } while (numCuenta <= 0);
        System.out.println("Ingrese el tipo de cuenta: ");
        do {
           tipoCuenta = scan.next().charAt(0); 
        } while (tipoCuenta <= 0);

        System.out.println("Ingrese el saldo minimo: ");
        do {
           saldoMinimo = scan.nextInt(); 
        } while (saldoMinimo <= 0);

        System.out.println("Ingrese el saldo actual de la cuenta: ");
        do {
           saldoActual = scan.nextInt(); 
        } while (saldoActual <= 0);

        saldoNuevo = saldoActual;

        if (tipoCuenta == 'S' || tipoCuenta == 's') {
            if (saldoActual < saldoMinimo) {
                System.out.println("Error, su cuenta no cumple con el saldo minimo\n" +
                "Se le impondra un cargo de -10$");
                saldoNuevo -= 10;
            } else {
                interes = saldoActual * 0.04;
                saldoNuevo += interes;
                System.out.println("Numero de cuenta: " + saldoNuevo);
                System.out.println("tipo de cuenta: " + tipoCuenta);
                System.out.println("Saldo actual: " + saldoActual);
                System.out.println("Saldo nuevo: " + saldoNuevo);
            }
        } else if (tipoCuenta == 'C' || tipoCuenta == 'c') {
            if (saldoActual < saldoMinimo) {
                System.out.println("Error, su cuenta no cumple con el saldo minimo\n" +
                "Se le impondra un cargo de -25$");
                saldoNuevo -= 25;
            } else {
                if (saldoMinimo >= 5000) {
                    if (saldoActual <= saldoMinimo ) {
                    interes = saldoActual * 0.03;
                    } 
                }else {
                    interes = saldoActual * 0.05;
                }
                saldoNuevo += interes;
                System.out.println("Numero de cuenta: " + saldoNuevo);
                System.out.println("tipo de cuenta: " + tipoCuenta);
                System.out.println("Saldo actual: " + saldoActual);
                System.out.println("Saldo nuevo: " + saldoNuevo);
            }

        } else {
            System.out.println("Error, tipo de caracter invalido");
            
        }
        
    }
}