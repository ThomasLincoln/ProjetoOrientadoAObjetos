public class Funcionario {
    public static void main(String[] args){

        
        Produto bananaPrata = new Produto(12.99, "Banana Prata", 10);
        Produto cola = new Produto(5.99, "Cola", 20);
        Produto vassouraDePalha = new Produto(15, "Vassoura de Palha", 5);

        cola.setNome("Super Cola");

        Estoque brasil = new Estoque();
        
        brasil.estocar(bananaPrata);   
        brasil.estocar(cola);   
        brasil.estocar(vassouraDePalha);   
    }
    
}
