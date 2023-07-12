import java.util.ArrayList;
import java.util.List;

public interface Implementador {

    abstract public void dequeue();
    abstract public void enqueue(int o);
    abstract public int size();
    abstract public Boolean isEmpty();
    abstract public String imprimir();

}
