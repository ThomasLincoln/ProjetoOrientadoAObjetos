public class Projetor {

    private Boolean Ligado;
    private int brilho;

    public void ligar() {
        this.Ligado = !this.Ligado;
    }

    public void setBrilho(int brilho) {
        this.brilho = brilho;
    }

    public Boolean getLigado() {
        return Ligado;
    }

    public void setLigado(Boolean ligado) {
        Ligado = ligado;
    }

    public int getBrilho() {
        return brilho;
    }

    public Projetor(Boolean ligado, int brilho) {
        Ligado = ligado;
        this.brilho = brilho;
    }
    
}
