
public class User implements ReservationObserver{
    private String nome;


    public User(String nome) {
        this.nome = nome;
    }

    public String getName() {
        return nome;
    }

    @Override
    public void notify(User usuario, Recurso recurso) {
        System.out.println(usuario.getName() + ", o recurso '" + recurso.getTitulo() + "' está disponivel.");
    }

    @Override
    public String toString() {
        return nome;
    }
}
