/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciapisos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author node
 */
public class Agencia {

    private ArrayList<Piso> pisos;
    private String nombre;

    public Agencia(String nombre) {
        this.nombre = nombre;
        this.pisos = new ArrayList();
    }

    public Agencia(ArrayList<Piso> Pisos, String nombre) {
        this.pisos = Pisos;
        this.nombre = nombre;
    }

    public void anadir(Piso piso) {
        if (!pisos.contains(piso)) {
            this.pisos.add(piso);
        }
    }
    
    public Boolean modificar(Piso piso,Piso nuevo){
        if(this.pisos.contains(piso)){
//            int lugar = pisos.
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Listar los disponibles
     * @return lista de los
     */
    public ArrayList<Piso> listarD(){
        ArrayList<Piso> pisos = (ArrayList<Piso>) this.pisos.clone();
        ArrayList<Piso> pisosCump = new ArrayList();
        for(Piso actu:pisos){
            if(actu.getDisponible()){
                pisosCump.add(actu);
            }
        }
        return pisosCump;
    }

    public ArrayList<Piso> listarP(Integer precioMin, Integer precioMax) {
        ArrayList<Piso> pisos = (ArrayList<Piso>) this.pisos.clone();
        ArrayList<Piso> pisosCump = new ArrayList();
        Iterator iter = pisos.iterator();
        if (iter.hasNext()) {
            Piso sigui = (Piso) iter.next();
            while (iter.hasNext()) {
                if ((sigui.getPrecio() >= precioMin) && (sigui.getPrecio() <= precioMax)) {
                    pisosCump.add(sigui);
                }
            }
        }
        return pisosCump;
    }

    public ArrayList<Piso> listarM(Integer metrosCuadradosMin, Integer metrosCuadradosMax) {
        ArrayList<Piso> pisos = (ArrayList<Piso>) this.pisos.clone();
        ArrayList<Piso> pisosCump = new ArrayList();
        Iterator iter = pisos.iterator();
        if (iter.hasNext()) {
            Piso sigui = (Piso) iter.next();
            while (iter.hasNext()) {
                if ((sigui.getMetrosCuadrados() >= metrosCuadradosMin) && (sigui.getMetrosCuadrados() <= metrosCuadradosMax)) {
                    pisosCump.add(sigui);
                }
            }
        }
        return pisosCump;
    }
    
    public boolean eliminar(Piso piso){
        return pisos.remove(piso);
    }
}
