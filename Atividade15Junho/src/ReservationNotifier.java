import java.util.ArrayList;
import java.util.List;

public class ReservationNotifier {
     private List<ReservationObserver> observers;

     public ReservationNotifier(){
        observers = new ArrayList<>();
     }

     public void registrarObservador(ReservationObserver observador){
        observers.add(observador);
     }

     public void removerObservador(ReservationObserver observador){
        observers.remove(observador);
     }

     public void notifyObservers(User usuario, Recurso recurso){
        for (ReservationObserver observer : observers){
            observer.notify(usuario, recurso);
        }
     }
}
