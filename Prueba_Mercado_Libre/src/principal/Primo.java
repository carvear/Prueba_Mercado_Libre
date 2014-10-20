/**
 *
 * @author Carlos G. Velázquez
 */

package principal;

import java.util.ArrayList;
import java.util.List;

public class Primo extends Numero{    
    
    /* Constructor de la clase */
    public Primo(int numero){
        super(numero);
    }

    /* Verifica si es un numero primo. */
    protected boolean es_primo() {
         int divisores=0,i;
         
         for(i=1; i<(this.numero+1); i++){  
             if(this.numero%i==0){ 
                 divisores++;  
             }  
         }
         
         if(divisores==2){                      
                return(true); // Es primo                
            }else{                
                return(false); // No es primo
         }
     }
    
    /* Verifica si es un numero primo circular. */
    protected boolean es_primo_circular(){
        int k;
        boolean continuar;
        
        String valor = Integer.toString(this.numero);
        int tamaño = valor.length()-1;
        
        continuar = this.es_primo();
        
        for(k=0; continuar && k < tamaño; k++)
        {           
            this.rotar_numero();
            continuar = this.es_primo();            
        }
        return continuar;
    }
  
    /* Cuenta la cantidad de numeros primos circulares por debajo de un valor */
    protected List lista_primos_circulares(){
        List<Integer> lista_primos_circulares = new ArrayList<Integer>(); 
        int k,cantidad = 0;        
        Primo valor = new Primo(2);
                
        for(k = 2; k < this.numero; k++)
        {   
            valor.set_numero(k);            
            if(valor.es_primo_circular())
            {                   
                cantidad++;
                lista_primos_circulares.add(k);  
            }
        }
        return lista_primos_circulares;
    }  
}