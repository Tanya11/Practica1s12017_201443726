package Cola;

   public class NodoCola {
    
       private String ficha;
    private NodoCola Siguiente;

    public NodoCola(String ficha) {
        this.ficha = ficha;
                this.Siguiente = null;
    }
    
    public String getficha() {
        return ficha;
    }
    
    public void setficha(String ficha) {
        this.ficha = ficha;
    }
         
    public NodoCola getSiguiente() {
        return Siguiente;
    }
    
    public void setSiguiente(NodoCola Siguiente) {
        this.Siguiente = Siguiente;
    }
}

