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
public class ListaSimple1 {
    NodoListaSimple1 cabeza; 
    int tamaño;

    public ListaSimple1() {
        cabeza= null; //no hay nada
        tamaño=0;
    }
    public void AgregarPrimero(Object obj){
        if (cabeza==null){
            cabeza= new NodoListaSimple1(obj);
        }else{
            NodoListaSimple1 temp=cabeza;
            NodoListaSimple1 nuevo = new NodoListaSimple1(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza=nuevo;
        }tamaño++;
            
    }
    
    public Object Obtener(int index){
        int contador=0;
        NodoListaSimple1 temporal= cabeza;
        while(contador < index){
       temporal=temporal.siguiente;
       contador++;
            }
        return temporal.ObtenerVal();
    }
    
        public boolean esVacia(){
        return(cabeza==null)?true:false;
    }
   public int tamaño()       {
           return tamaño;     
            }
   
    
}
