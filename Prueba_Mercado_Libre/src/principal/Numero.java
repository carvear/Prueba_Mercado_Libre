/**
 *
 * @author Carlos G. Velazquez
 */

package principal;

import java.util.List;

public class Numero {
    int numero;
    
    /* Constructor de la clase */
    public Numero(int numero){
        this.numero = numero;
    }
    
    /* Rota el primer digito de un numero de manera circular. */
    protected void rotar_numero() {
        int r,d;
      
        String valor = Integer.toString(numero);
        int tamaño = valor.length();
        
        d = (int) Math.pow(10, tamaño - 1);        
        r = numero % d;      
        r =  10 * r + numero / d;
        
        this.numero = r;
    }
    
    /* Fija el valor de la variable 'numero' en el dato miembro de la clase */
    protected void set_numero(int numero){
        this.numero = numero;
    }
    
    /* Retorna la cantidad de elementos en la lista */
    protected int cantidad_elementos(List elementos){        
        return elementos.size();
    }
    
    /* Muestra por pantalla los elementos de una lista */
    protected void mostrar_lista_elementos(List elementos){        
        int i=0;
        while(i < elementos.size()){
            System.out.println(elementos.get(i));
            i++;
        }
   }       
}