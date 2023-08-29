
package ejerciciosfor;

import java.util.Scanner;

/**
 *
 * @author juan_montoya
 */
public class Numeros_20 {
    public static void main(String[] args) {
        //paso a paso
         Scanner scanner = new Scanner(System.in);
        int Pares = 0;
        int Negativos = 0;
        int Ceros = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                Pares++;
            }
            if (numero < 0) {
                Negativos++;
            }
            if (numero == 0) {
                Ceros++;
            }
        }
        System.out.println("Cantidad números pares: " + Pares);
        System.out.println("Cantidad números negativos: " + Negativos);
        System.out.println("Cantidad ceros: " + Ceros);

        scanner.close();
    }
}
   
    

