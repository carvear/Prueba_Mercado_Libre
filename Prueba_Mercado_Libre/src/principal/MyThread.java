package principal;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {   
    static List<Integer> lista_salida = new ArrayList<Integer>(); 
    
    /* Constructor de la clase */    
    public MyThread(String str){
        super(str);
    }
    
    /* Codigo a ser ejecutado por Threads */
    public void run(){       
        Primo pr = new Primo(Integer.parseInt(getName()));        
        if (pr.es_primo_circular()){            
            lista_salida.add(pr.numero);            
            System.out.println("ES"+pr.numero);
        }
        
        /*Primo pr = new Primo(100000); //Setear en 1000001 como dice la especificacion.        
        List lista_salida = pr.lista_primos_circulares();
        System.out.println("Cantidad de Primos Circulares Menores a "+pr.numero+": "+pr.cantidad_elementos(lista_salida));
        pr.mostrar_lista_elementos(lista_salida);*/
    }
    
    /* Metodo principal */
    public static void main (String [] args) throws InterruptedException {
        int numero_evaluado = 32; //1000001
        for(int i=2;i<numero_evaluado;i++){ 
            new MyThread(Integer.toString(i)).start();
            Thread.sleep(1);
        }        
        System.out.println("Cantidad de Primos Circulares Menores a "+numero_evaluado+": " + lista_salida.size());
    }
}