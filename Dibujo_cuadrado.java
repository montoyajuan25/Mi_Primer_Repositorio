
package ejerciciosfor;

/**
 *
 * @author juan_montoya
 */
public class Dibujo_cuadrado {
    public static void main(String[] args) {
        //procedimiento
        
         int lado = 5; // Cambio valor de 'lado' para ajustar el tamaño del cuadrado
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
    
    

