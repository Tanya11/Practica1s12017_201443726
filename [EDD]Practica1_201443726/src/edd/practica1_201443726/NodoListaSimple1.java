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
public class NodoListaSimple1 {
     Object valor;
     NodoListaSimple1 siguiente;

    public NodoListaSimple1(Object valor) {
        this.valor= valor;
        this.siguiente= null;
    }
         public Object ObtenerVal(){
         return valor;       
         
         }
     public void enlazarSiguiente(NodoListaSimple1 n){
     siguiente= n;
     }
     public  NodoListaSimple1 ObtenerSigu(){
         return siguiente;
     }
}
