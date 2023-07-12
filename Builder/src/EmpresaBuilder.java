
public class EmpresaBuilder implements Builder{

    private String nome;
    private Pessoa responsavel;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setResponsavel(Pessoa p1){
        this.responsavel = p1;
    }

    public Empresa getResult(){
        return new Empresa(this.nome, this.responsavel);
    }

}
