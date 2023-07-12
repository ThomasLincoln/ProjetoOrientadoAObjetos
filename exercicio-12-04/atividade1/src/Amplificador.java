public class Amplificador {

    private Boolean Ligado;

    public void ligar() {
        this.Ligado = !this.Ligado;
    }

    public Boolean getLigado() {
        return Ligado;
    }

    public void setLigado(Boolean ligado) {
        Ligado = ligado;
    }

    public Amplificador(Boolean ligado) {
        Ligado = ligado;
    }
    
}
