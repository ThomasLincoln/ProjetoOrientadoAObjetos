public class App {
    public static void main(String[] args) throws Exception {
        // Obtem instancia f
        // Criação de clientes e produtos
        Cliente cliente1 = new Cliente("Zé", 123);
        Produto produto1 = new Produto("Produto 1", 223, 10.0);
        Produto produto2 = new Produto("Produto 2", 342, 20.0);

        // Criação da instância de Facade com valores locais
        Facade f = new Facade();
        f.adicionarCliente(cliente1);
        f.adicionarProduto(produto1);
        f.adicionarProduto(produto2);

        // Utilização da instância de Facade
        // f.registrar("Zé", 123);
        f.comprar(223, 123);
        f.comprar(342, 123);
        f.fecharCompra(123);
    }
}
