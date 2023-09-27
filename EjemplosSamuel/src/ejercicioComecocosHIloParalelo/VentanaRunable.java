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
public class VentanaRunable extends Thread{

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Moviendo el comecocos...");

    }

}
