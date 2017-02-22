/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cola;

public class Cola {

    private NodoCola Cabeza, Cola, Auxiliar;

    public Cola() {
        this.Cabeza = null;
        this.Cola = null;
        this.Auxiliar = null;
    }

    public void Insertar(String ficha) {
        Auxiliar = new NodoCola(ficha);
        if (getCabeza() == null){
            setCabeza(Auxiliar);
        }else{
            getCola().setSiguiente(Auxiliar);
        }
        setCola(Auxiliar);
    }
    
    public NodoCola Buscar(String ficha){
        try{
            Auxiliar = getCabeza();
        while (!ficha.equals(Auxiliar.getficha())) {
            this.Auxiliar = Auxiliar.getSiguiente();
        }}catch(Exception e){}
        if (Auxiliar == null) {
            System.out.println("El dato no fue encontrado.");
        }
        return Auxiliar;
    }
    
    public NodoCola Eliminar(){
        this.Auxiliar = getCabeza();
        try{
            this.setCabeza(getCabeza().getSiguiente());
        }catch(Exception e){}
        return Auxiliar;
    }

    public NodoCola getCabeza() {
        return Cabeza;
    }

    public void setCabeza(NodoCola Cabeza) {
        this.Cabeza = Cabeza;
    }

    public NodoCola getCola() {
        return Cola;
    }

    public void setCola(NodoCola Cola) {
        this.Cola = Cola;
    }
}