import java.util.HashMap;

public class AdicionarPessoa implements Command{
    
    public AdicionarPessoa() {
    }

    @Override
    public void execute(String[] args, HashMap<Integer, Pessoa>  banco) {
        String nome = args[1];
        int id = Integer.parseInt(args[0]);
        Pessoa pessoa = new Pessoa(nome, id);
        banco.put(id, pessoa);
    }
    
}
