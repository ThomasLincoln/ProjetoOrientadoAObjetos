
public class PessoaBuilder implements Builder{

    private String Nome;
    private int identidade;

    @Override
    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    public Pessoa getResult(){
        Pessoa p1 = new Pessoa(this.Nome, this.identidade);
        setNome("");
        setIdentidade(0);
        return p1;
    }

}
