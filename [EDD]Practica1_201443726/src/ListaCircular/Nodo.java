/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListaCircular;

/**
 *
 * @author Usuario
 */
public class Nodo {

    public Nodo() {
    }
    
    private String nombre;
    private Nodo Siguiente;

    public Nodo(String nombre) {
        this.nombre = nombre;
               this.Siguiente = this;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombreDeParada(String nombre) {
        this.nombre = nombre;
    }
    
        public Nodo getSiguiente() {
        return Siguiente;
    }
    
    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
}