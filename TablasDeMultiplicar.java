
package ejerciciosfor;

import java.util.Scanner;

/**
 *
 * @author juan_montoya
 */
public class TablasDeMultiplicar {
    public static void main(String[] args) {
        //procedimiento
        
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el numero de la  tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}