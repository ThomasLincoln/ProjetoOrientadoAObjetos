public class Estoque {
    private Produto itens[] = new Produto[10];
    private int index = 1;
    public void estocar(Produto prodAux){
        salvar(prodAux);
    }
    
    private void salvar(Produto prodAux){
        if(index == 10){
            System.out.println("O estoque não tem mais capacidade");
        }

        index++;
        itens[index] = prodAux;
    }
}
