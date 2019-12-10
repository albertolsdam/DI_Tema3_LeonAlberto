/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

/**
 *
 * @author Alberto Leon
 */
public class Animal {
    private String nombre;
    private String rutaMiniatura;
    private String rutaGrande;

    public Animal(String nombre, String rutaMiniatura, String rutaGrande) {
        this.nombre = nombre;
        this.rutaMiniatura = rutaMiniatura;
        this.rutaGrande = rutaGrande;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaMiniatura() {
        return rutaMiniatura;
    }

    public void setRutaMiniatura(String rutaMiniatura) {
        this.rutaMiniatura = rutaMiniatura;
    }

    public String getRutaGrande() {
        return rutaGrande;
    }

    public void setRutaGrande(String rutaGrande) {
        this.rutaGrande = rutaGrande;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
    
}
