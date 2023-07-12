import java.util.ArrayList;

public class ListaComArray implements Implementador{

    ArrayList<Integer> listola = new ArrayList<>();
    @Override
    public void dequeue() {
        listola.remove(0);
        
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < listola.size(); i++) {
            sb.append(listola.get(i));
            if (i < listola.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void enqueue(int o) {
        listola.add(o);        
    }

    @Override
    public Boolean isEmpty() {
        return listola.isEmpty();
    }

    @Override
    public int size() {
        return listola.size();
    }
    
}
