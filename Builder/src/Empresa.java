
public class Empresa {
    private String nome;
    private Pessoa responsavel;

    public Empresa(String nome, Pessoa responsavel) {
        this.nome = nome;
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Empresa [nome=" + nome + ", responsavel=" + responsavel.getNome() + "]";
    }

    
}
