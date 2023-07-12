import java.util.HashMap;

public class Get implements Command {

    @Override
    public void execute(String[] args, HashMap<Integer, Pessoa> banco) {
        args.toString();
        // System.out.println(args[0].toString());
        Pessoa pessoa = banco.get(Integer.parseInt(args[0]));
        System.out.println("ID: " + pessoa.getId() + ", Nome: " + pessoa.getNome());

    }

}
