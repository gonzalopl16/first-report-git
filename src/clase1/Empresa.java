/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.ArrayList;


/**
 *
 * @author Luis Gonzalo GitHub: https://github.com/gonzalopl16
 */
public class Empresa {
    private ArrayList<Persona> listaPersonas;
    
    public Empresa(){
        this.listaPersonas = new ArrayList<>();
    }
    
    public void agregarPersona(Persona p){
        this.listaPersonas.add(p);
    }
    
    public void mostrarPorNivel(String nivel){
        for(Persona p : listaPersonas){
            
        }
    }
}
