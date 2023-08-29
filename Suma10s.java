
package ejerciciosfor;

import java.util.Scanner;

/**
 *
 * @author juan_montoya
 */
public class Suma10s {
    public static void main(String[] args) {
        //proceso
        Scanner scanner = new Scanner(System.in);
        int Numeros = 10;
        int sum = 0;

        for (int i = 0; i < Numeros; i++) {
            System.out.print("Ingresar número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            sum += numero;
        }

        System.out.println("La suma del numero es: " + sum);

        
        scanner.close();
    }
}
    

