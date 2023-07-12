import java.util.HashMap;

public class Banco {
    private HashMap<Integer, Pessoa> banco;
    private HashMap<String, Command> comandos;

    public Banco() {
        banco = new HashMap<>();
        comandos = new HashMap<>();

        // Inicializa os comandos disponíveis
        comandos.put("new", new AdicionarPessoa());
        comandos.put("get", new Get());
        comandos.put("delete", new DeletarPessoa());
        comandos.put("all", new PrintAll());
    }

    public void execute(String[] args) {
        if (args.length < 1) {
            System.out.println("Comando inválido");
            return;
        }

        String comando = args[0];
        Command command = comandos.get(comando);
        if (command == null) {
            System.out.println("Comando inválido");
            return;
        }

        String[] argumentos = new String[args.length - 1];
        System.arraycopy(args, 1, argumentos, 0, argumentos.length);

        command.execute(argumentos, banco);
    }

}
