
public class Tela {

    private Boolean ligado;

    public void descer() {
        this.ligado = !this.ligado;
    }

    public Tela(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getLigado() {
        return ligado;
    }

}
