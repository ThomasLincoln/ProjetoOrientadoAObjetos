import java.util.ArrayList;
import java.util.List;

public class Facade {
    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Carrinho> carrinhos = new ArrayList<>();
    private static Facade instanciaUnica = null;

    private Facade(List<Produto> produtos, List<Cliente> clientes, List<Carrinho> carrinhos) {
        this.produtos = produtos;
        this.clientes = clientes;
        this.carrinhos = carrinhos;
    }

    public static Facade getInstancia(List<Produto> produtos, List<Cliente> clientes, List<Carrinho> carrinhos){
        if(instanciaUnica == null){
            instanciaUnica = new Facade(produtos, clientes, carrinhos);
        }

        return instanciaUnica;
    }


    public void adicionarCliente(Cliente c) {
        clientes.add(c);
        carrinhos.add(new Carrinho(c));
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void comprar(int prodID, int clienteID) {
        Cliente c = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == clienteID) {
                c = cliente;
                break;
            }
        }
        // System.out.println(c.getNome());
        Produto p = null;
        for (Produto produto : produtos) {
            if (produto.getId() == prodID) {
                p = produto;
                break;
            }
        }
        // System.out.println(p.getId());
        Carrinho carrinho = null;
        for (Carrinho crr : carrinhos) {
            if (crr.getCliente().getId() == clienteID) {
                carrinho = crr;
                break;
            }
        }
        carrinho.adicionar(p);
    }

    public void fecharCompra(int clienteID) {
        Carrinho carrinho = null;
        for (Carrinho crr : carrinhos) {
            if (crr.getCliente().getId() == clienteID) {
                carrinho = crr;
                break;
            }
        }
        double valor = carrinho.getTotal();
        processarPagamento(carrinho.getCliente(), valor);
    }

    void processarPagamento(Cliente c, double valor) {
        String nome = c.getNome();
        System.out.println(nome + ", você precisa pagar: " + valor);
    }
}