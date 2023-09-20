
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciapisos;

import java.util.Objects;

/**
 *
 * @author node
 */
class Piso {
    private String id;
    private String direccion;
    private Boolean disponible;
    private Integer metrosCuadrados;
    private Integer precio;

    public Piso(Boolean disponible, Integer metrosCuadrados) {
        this.disponible = disponible;
        this.metrosCuadrados = metrosCuadrados;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.direccion);
        hash = 59 * hash + Objects.hashCode(this.disponible);
        hash = 59 * hash + Objects.hashCode(this.metrosCuadrados);
        hash = 59 * hash + Objects.hashCode(this.precio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Piso other = (Piso) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.disponible, other.disponible)) {
            return false;
        }
        if (!Objects.equals(this.metrosCuadrados, other.metrosCuadrados)) {
            return false;
        }
        return Objects.equals(this.precio, other.precio);
    }

    @Override
    public String toString() {
        return "Piso: " + "id=" + id + ", direccion=" + direccion + ", disponible=" + disponible + ", metrosCuadrados=" + metrosCuadrados + ", precio=" + precio + '\n';
    }
    
    
    
    
    
}