/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoEstructuras;

/**
 *
 * @author Nicol
 */
public class Clientes {
    public String correo;
    public String contra;
    public String nombre;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clientes(String nombre,String correo, String contra) {
        this.correo = correo;
        this.contra = contra;
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContra() {
        return contra;
    }
    
    public Clientes(){
        
    }
    
}
