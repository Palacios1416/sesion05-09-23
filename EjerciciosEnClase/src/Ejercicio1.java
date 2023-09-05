import java.util.Scanner;
public class Ejercicio1 {

    public static byte edad, arma, intentos;
    public static char sex;
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("ingrese su edad: ");
        do {

            edad = scanner.nextByte();
            if (edad <= 0 || edad > 99) {
                System.out.println("Usted no existe");
            }
            
        } while (edad <= 0 || edad > 99);
        
        
        System.out.println("ingrese su sexo (f/m): ");
        do {
            sex = scanner.next().charAt(0);

        } while (sex != 'f' && sex != 'm');
         
         
        System.out.println("porta armas? Si (1), No (2)");
        do {
            arma = scanner.nextByte();
        } while (arma < 1 || arma > 2);
         
        
        if (arma == 1 || edad < 18) {

            System.out.println(" usted no puede pasar ");

        } else if (sex == 'f' && edad >= 18) {

            System.out.println("Puede pasar y tomar bebidas");

        } else if (sex == 'm' && edad >= 18 && edad <=21) {

            System.out.println("Puede pasar pero no puedes tomar bebidas");

        } else if (sex == 'm' && edad > 21) {

            System.out.println("Puede pasar y tomar bebidas");
        }
            
        
    }
}