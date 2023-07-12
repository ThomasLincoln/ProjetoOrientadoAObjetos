public class Cliente {
    private String nome;
    private int id;
    private Carrinho carrinho;

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.carrinho = new Carrinho(this);
    }

    public void adicionarProduto(Produto p) {
        carrinho.adicionar(p);
    }

    public void fecharCompra() {
        double valor = carrinho.getTotal();
        // System.out.println("Terá que pagar: " + valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
