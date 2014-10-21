/**
 *
 * @author Carlos G. Velázquez
 */

package principal;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {   
    static List<Integer> lista_salida = new ArrayList<Integer>(); 
    
    /* Constructor de la clase */    
    public MyThread(String str){
        super(str);
    }
 
    /* Muestra por pantalla los elementos de una lista */
    private static void mostrar_lista_elementos(List elementos){        
        int i=0;
        while(i < elementos.size()){
            System.out.println(elementos.get(i));
            i++;
        }
    }
    
    /* Codigo a ser ejecutado por Threads */
    public void run(){
        Primo pr = new Primo(Integer.parseInt(getName()));
        int valor = pr.numero;
        if (pr.es_primo_circular()){
            lista_salida.add(valor);
            System.out.println("Primo Circular: "+valor);
        }        
    }
    
    /* Metodo principal */
    public static void main (String [] args) throws InterruptedException {
        int numero_evaluado = 1000001;
        for(int i=2;i<numero_evaluado;i++){ 
            new MyThread(Integer.toString(i)).start();            
            Thread.sleep(1);            
        }
        Thread.sleep(2000);
        System.out.println("Cantidad de Primos Circulares Menores a "+numero_evaluado+": " + lista_salida.size());
    }
}