/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd.practica1_201443726;

/**
 *
 * @author Usuario
 */
public class NodoListaSimple2 {
    Object valor;
     NodoListaSimple2 siguiente;

    public NodoListaSimple2(Object valor) {
        this.valor= valor;
        this.siguiente= null;
    }
         public Object ObtenerValor(){
         return valor;       
         
         }
     public void enlazarSiguiente(NodoListaSimple2 n){
     siguiente= n;
     }
     public  NodoListaSimple2 ObtenerSiguiente(){
         return siguiente;
     }
}
