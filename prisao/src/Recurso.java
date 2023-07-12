
public class Recurso extends Componente{
    private Mediator mediator;
    private String nome;
    private int quantidade;
    private int ideal;



    public Recurso(Mediator m, int quantidade, String nome, int ideal) {
        super(m);
        this.mediator = m;
        this.quantidade = quantidade;
        this.nome = nome;
        this.ideal = ideal;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdeal() {
        return ideal;
    }

    public void setIdeal(int ideal) {
        this.ideal = ideal;
    }

    public void distribuir(int quantidade){
        if (this.quantidade >= quantidade){
            System.out.println("Distribuiremos " + quantidade + " igualmente entre as celas");
            this.quantidade = this.quantidade - quantidade;
        }else{
            System.out.println("Estoque de " + this.nome + " insuficiente");
        }
    }
}
