import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;
    private Cliente cliente;

    public Carrinho(Cliente cliente) {
        this.produtos = new ArrayList<>();
        this.cliente = cliente;
    }

    public void adicionar(Produto p) {
        this.produtos.add(p);
    }

    public double getTotal() {
        double total = 0;
        for (Produto p : this.produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}