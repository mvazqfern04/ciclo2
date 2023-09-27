/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioComecocosHIloParalelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author node
 */
public class Comecocos extends Thread {

    private final static String[] MENSAJE = {
        "Rojo", "Azul", "Amarillo", "Verde que te quiero verde"};

    private final static int DILEY = 200;
    private int cont;
    private boolean parado;

    public Comecocos() {
        super();
        this.cont = 0;
        this.parado = false;
    }

    public void para() {
        if (!this.parado) {
            this.parado = true;
        }
    }

    public void run() {
        try {
            while (!parado) {
                cont = (cont + 1) % MENSAJE.length;
                Thread.sleep(DILEY);
                System.out.println(MENSAJE[cont]);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Comecocos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public boolean isParado() {
        return parado;
    }

    public void setParado(boolean parado) {
        this.parado = parado;
    }

    public String getMensaje(int num) {
        return MENSAJE[num];
    }

}
