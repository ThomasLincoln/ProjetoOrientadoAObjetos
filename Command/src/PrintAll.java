import java.util.HashMap;

public class PrintAll implements Command {

    @Override
    public void execute(String[] args, HashMap<Integer, Pessoa> banco) {
        System.out.println("Printando todas pessoas");
        for (Pessoa pessoa : banco.values()) {
            System.out.println("ID: " + pessoa.getId() + ", Nome: " + pessoa.getNome());
        }
    }

}
