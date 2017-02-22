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
  public class ListaCircular {

    private Nodo Cabeza, Auxiliar;
    private int contador, total;

    public ListaCircular() {
        this.Cabeza = null;
        this.Auxiliar = null;
        this.contador = 0;
        this.total = 20;
    }

    public void Insertar(String nombre) {
        Auxiliar = new Nodo(nombre);
        if (getCabeza() != null) {
            Auxiliar.setSiguiente(getCabeza().getSiguiente());
            getCabeza().setSiguiente(Auxiliar);
        }
        setCabeza(Auxiliar);
    }

    public Nodo Buscar(String nombre) {
        try {
            contador = 0;
            Auxiliar = getCabeza();
            do {
                this.Auxiliar = Auxiliar.getSiguiente();
                contador++;
            } while (Auxiliar != getCabeza() && (!(Auxiliar.getNombre().equals(nombre))));
        } catch (Exception e) {
        }
        if (contador >= total) {
            System.out.println("No existe");
            return null;
        } else {
            return Auxiliar;
        }
    }

    public Nodo Eliminar(String nombre) {
        contador = 0;
        Auxiliar = getCabeza();
        do {
            this.Auxiliar = Auxiliar.getSiguiente();
            contador++;
        } while (Auxiliar != getCabeza() && (!(Auxiliar.getSiguiente().getNombre().equals(nombre))));
        if (contador <= total) {
            Auxiliar.setSiguiente(Auxiliar.getSiguiente().getSiguiente());
        }
        total--;
        return Auxiliar.getSiguiente();
    }

    public Nodo Sacar() {
        Auxiliar = getCabeza();

        return Auxiliar;
    }

    public Nodo getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }
}