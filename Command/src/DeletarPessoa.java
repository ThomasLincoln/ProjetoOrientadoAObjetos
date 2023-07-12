import java.util.HashMap;

public class DeletarPessoa implements Command {

    @Override
    public void execute(String[] args, HashMap<Integer, Pessoa> banco) {
        banco.remove(Integer.parseInt(args[0]));
    }
    
}
