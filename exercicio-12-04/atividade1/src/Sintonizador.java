
public class Sintonizador {

    private Boolean Ligado;

    public void ligar() {
        this.Ligado = !this.Ligado;
    }

    public Sintonizador(Boolean ligado) {
        Ligado = ligado;
    }


}
