package ejemplos.crearhilos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Principal {
//    public static Thread empezarSorteo(List<Thread> hilos){
//        Thread primero = new Hilo("Afortunado");
//        return primero;
//    }
    public static void main(String[] args) {
//        //Probando hilo con Thread
//        Thread h1 = new Hilo("H1");
//        Hilo h2 = new Hilo("H2");
//        Hilo h3 = new Hilo("H3");
//        h1.start();
//        h2.start();
//        h3.start();
//
//    //Probando hilo con Runnable
//    Thread h1 = new Thread(new HiloRunnable("H1",3000));
//    Thread h2 = new Thread(new HiloRunnable("H2",500));
//    
//    h1.start();
//    h2.start();

    
    //Experimento raro
//    List<Thread> lista= new ArrayList();
//    
//    Thread i1 = new Hilo("Lunes");
//    lista.add(i1);
//    Thread i2 = new Hilo("Martes");
//    lista.add(i2);
//    Thread i3 = new Hilo("Miercoles");
//    lista.add(i3);
//    Thread i4 = new Hilo("Jueves");
//    lista.add(i4);
//    Thread i5 = new Hilo("Viernes");
//    lista.add(i5);
//    Thread i6 = new Hilo("Sabado");
//    lista.add(i6);
//    Thread i7 = new Hilo("Domingo");
//    lista.add(i7);
//    Thread i8 = new Hilo("Ningun día");
//    lista.add(i8);
//
//    List<Thread> listaFinal=(List<Thread>)lista;
//    
//    JOptionPane.showMessageDialog(null, empezarSorteo(listaFinal));
    
    //Empezar ejercicio
    Thread hilo = new Hilo("Sorteo");
    System.out.println(hilo.isAlive());
    JOptionPane.showMessageDialog(null,hilo.getName());
    System.out.println(hilo.isAlive());

//    //Probando hilo con clase anonima
//    Thread t = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("Hago una cosa que solo hago aquí.");
//        }
//    });
//    t.start();
    }
    
}
