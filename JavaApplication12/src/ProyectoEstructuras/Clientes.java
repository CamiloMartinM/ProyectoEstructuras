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
    public String celular;
    public String contra;
    public String nombre;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clientes(String nombre,String celular, String contra) {
        this.celular = celular;
        this.contra = contra;
        this.nombre = nombre;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCelular() {
        return celular;
    }

    public String getContra() {
        return contra;
    }
    
    public Clientes(){
        
    }
    
}
