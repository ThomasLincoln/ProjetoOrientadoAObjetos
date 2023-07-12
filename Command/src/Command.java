import java.util.HashMap;

public interface Command {
    void execute(String[] args, HashMap<Integer, Pessoa>  banco);
}
