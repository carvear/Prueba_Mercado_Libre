/**
 *
 * @author Carlos G. Velázquez
 */

package principal;

import java.util.List;

public class Main {
    public static void main(String[] args) {        
        Primo pr = new Primo(1000001); //Setear en 1000001 como dice la especificacion.        
        List lista_salida = pr.lista_primos_circulares();
        System.out.println("Cantidad de Primos Circulares Menores a "+pr.numero+": "+pr.cantidad_elementos(lista_salida));
        pr.mostrar_lista_elementos(lista_salida);
    }  
}