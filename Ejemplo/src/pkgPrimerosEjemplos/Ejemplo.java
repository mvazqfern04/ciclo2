package pkgPrimerosEjemplos;

import javax.swing.JFrame;

/**
 *
 * @author node
 */
public class Ejemplo {

    public static void main(String[] args) {

        //Primeros ejemplos
        
//        JFrame frame = new JFrame("Ejemplo");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(600, 500);
//        frame.setVisible(true);
        
//        Ejemplo gui = new Ejemplo();
        
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                Ejemplo gui = new Ejemplo();
            }
            
        });
        
        //
    }

    public Ejemplo() {
        JFrame frame = new JFrame("Ejemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setVisible(true);
    }
}
