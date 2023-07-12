
public class MaquinaPipoca {

    private Boolean Ligado;
    private int quantidade;

    public void ligar() {
        this.Ligado = !this.Ligado;
    }
    
    public void prepararPipoca() {
        System.out.println("Preparando pipoca");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Pipoca terminada");
        this.quantidade = this.quantidade - 200;
    }

    public void abastecer(int abastecimento) {
        this.quantidade = abastecimento;
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

    public MaquinaPipoca(Boolean ligado, int quantidade) {
        Ligado = ligado;
        this.quantidade = quantidade;
    }

}
