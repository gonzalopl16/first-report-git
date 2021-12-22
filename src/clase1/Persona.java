/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author Luis Gonzalo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String nivelEstudio;
    
    public Persona(String nombre, String apellido, String nivelEstudio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivelEstudio = nivelEstudio;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nivelEstudio=" + nivelEstudio + '}';
    }
    
    
}
