public class App {
    public static void main(String[] args) throws Exception {
        Director diretor = new Director();

        PessoaBuilder builderPessoa = new PessoaBuilder();

        diretor.construirPessoa("Thomas", 12, builderPessoa);
        
        Pessoa p1 = builderPessoa.getResult();
        
        EmpresaBuilder builderEmpresa = new EmpresaBuilder();
        diretor.construirEmpresa(builderEmpresa, builderPessoa, "Otaco", "Serjo", 122);

        Empresa e1 = builderEmpresa.getResult();

        System.out.println(p1.toString());
  
        System.out.println(e1.toString());
        
    }
}
