package principal;

import java.util.List;

public class MyThread extends Thread {   
    public MyThread(String str) {
        super(str);
    }
    public void run() {       
        Primo pr = new Primo(Integer.parseInt(getName())); //Setear en 1000001 como dice la especificacion.
        System.out.println("Nro"+pr.numero);
        if (pr.es_primo_circular()){
            System.out.println("ES"+pr.numero);
        }        
        //currentThread().stop();
        
        /*Primo pr = new Primo(100000); //Setear en 1000001 como dice la especificacion.        
        List lista_salida = pr.lista_primos_circulares();
        System.out.println("Cantidad de Primos Circulares Menores a "+pr.numero+": "+pr.cantidad_elementos(lista_salida));
        pr.mostrar_lista_elementos(lista_salida);*/
    }
    
    public static void main (String [] args) throws InterruptedException {
        for(int i=2;i<1000001;i++){
            new MyThread(Integer.toString(i)).start();
            Thread.sleep(1);
        }
    }
}