/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

/**
 *
 * @author quique
 */
public class Pedir {
    private static String nombre;
    
    public Pedir (){}
    
    public Pedir (String nombre){
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;       
    }
    
    public String getNombre(){
        return nombre;
    } 
}
