/**
 *
 * @author Carlos G. Velázquez
 */

package principal;

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
             if(divisores>2){
                 i = this.numero+1;
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
}
