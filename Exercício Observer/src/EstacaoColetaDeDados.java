import java.util.ArrayList;
import java.util.List;

public class EstacaoColetaDeDados implements Subject {
    private int temperatura;
    private int Ph;
    private int PA;
    private List<Observer> observers;

    public EstacaoColetaDeDados(){
        observers = new ArrayList<>();
    }

    public int getTemperatura() {
        return temperatura;
    }
    public void setDados(int temperatura, int ph, int pA) {
        this.temperatura = temperatura;
        this.Ph = ph;
        this.PA = pA;

        notifyObserver();
    }
    public int getPh() {
        return Ph;
    }
    public int getPA() {
        return PA;
    }

    @Override
    public void addObserver(Observer o) {   
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObserver() {
        for(Observer o :observers){
            o.update(temperatura, Ph, PA);
        }
    }
}
