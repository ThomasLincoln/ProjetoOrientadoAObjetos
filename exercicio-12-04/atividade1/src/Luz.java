public class Luz {

    private Boolean Ligado;

    public void ligar() {
        this.Ligado = !this.Ligado;
    }

    public Luz(Boolean ligado) {
        Ligado = ligado;
    }

    public Boolean getLigado() {
        return Ligado;
    }
}
