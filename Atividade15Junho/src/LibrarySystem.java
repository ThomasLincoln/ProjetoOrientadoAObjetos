import java.util.ArrayList;
import java.util.List;


public class LibrarySystem {
    private static LibrarySystem instancia;
    private List<User> usuarios;
    private List<Recurso> recursos;
    private ReservationNotifier reservationNotifier;

    private LibrarySystem() {
        this.usuarios = new ArrayList<>();
        this.recursos = new ArrayList<>();
        this.reservationNotifier = new ReservationNotifier();
    }

    public static LibrarySystem getInstancia() {
        if (instancia == null) {
            instancia = new LibrarySystem();
        }
        return instancia;
    }

    public void addUser(User usuario) {
        usuarios.add(usuario);
    }

    public void removeUser(User usuario) {
        usuarios.remove(usuario);
    }

    public void addRecurso(Recurso recurso) {
        recursos.add(recurso);
    }

    public void removeRecurso(Recurso recurso) {
        recursos.remove(recurso);
    }

    public List<Recurso> showAvailableResources() {
        List<Recurso> availableResources = new ArrayList<>();
        for (Recurso recurso : recursos) {
            if (recurso.isAvailable()) {
                availableResources.add(recurso);
            }
        }
        return availableResources;
    }

    public boolean emprestar(User usuario, Recurso recurso) {
        if (recurso.isAvailable()) {
            recurso.borrow(usuario);
            return true;
        }
        return false;
    }

    public void retornarRecurso(Recurso recurso) {
        recurso.retornaRecurso();
    }

    public boolean reservar(User usuario, Recurso recurso) {
        if (recurso.isAvailable()) {
            recurso.fazerReserva(usuario);
            return true;
        }
        return false;
    }

    public ReservationNotifier getReservationNotifier() {
        return reservationNotifier;
    }
}
