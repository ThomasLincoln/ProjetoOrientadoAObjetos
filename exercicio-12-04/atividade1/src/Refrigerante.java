
public class Refrigerante {

    private Boolean Ligado;
    private int quantidade;

    public void ligar() {
        this.Ligado = !this.Ligado;
    }

    public void abastecer(int abastecimento) {
        this.quantidade = abastecimento;
    }

    public void encherCopo() {
        this.quantidade =- 250;
    }

    public Boolean getLigado() {
        return Ligado;
    }

    public void setLigado(Boolean ligado) {
        Ligado = ligado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Refrigerante(Boolean ligado, int quantidade) {
        Ligado = ligado;
        this.quantidade = quantidade;
    }

}
