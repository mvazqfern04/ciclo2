/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioComecocosHIloParalelo;

import javax.swing.JOptionPane;

/**
 *
 * @author node
 */
public class Principal {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, "Moviendo el comecocos...");

            }
        });
        t.run();
        Comecocos c = new Comecocos();
        c.start();
        t.join();
        c.para();
        System.out.println(c.getMensaje(c.getCont()));
    }
}
