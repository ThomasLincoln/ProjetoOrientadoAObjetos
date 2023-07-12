import java.util.ArrayList;
import java.util.List;

public class sinal implements Subject {
    
    private int temperatura;
    private boolean fuga;
    private List<Cela> observers;
        
    public sinal() {
        observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Cela o) {   
        observers.add(o);
    }
    @Override
    public void removeObserver(Cela o) {
        observers.remove(o);
    }
    @Override
    public void notifyObserver() {
        for(Cela o :observers){
            o.update(temperatura, fuga);
        }
    }

    public void setDados(int temperatura, boolean fuga) {
        this.temperatura = temperatura;
        this.fuga = fuga;
        notifyObserver();
    }
}
    
