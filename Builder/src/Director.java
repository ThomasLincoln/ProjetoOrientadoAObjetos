
public class Director {
    
    
    public void construirPessoa(String Nome, int identidade, PessoaBuilder builder){
        builder.setNome(Nome);
        builder.setIdentidade(identidade);
    }

    public void construirEmpresa(EmpresaBuilder builder, PessoaBuilder builderPessoa, String nomeEmpresa, String nomePessoa, int identidade){
        construirPessoa(nomePessoa, identidade, builderPessoa);
        Pessoa p1 = builderPessoa.getResult();
        builder.setNome(nomeEmpresa);
        builder.setResponsavel(p1);
    }
}
