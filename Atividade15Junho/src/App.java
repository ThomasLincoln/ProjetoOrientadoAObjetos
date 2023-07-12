import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando instância do sistema de gerenciamento de biblioteca
        LibrarySystem librarySystem = LibrarySystem.getInstancia();
        // Criando usuários
        User user1 = new User("John");
        User user2 = new User("Alice");
        // Adicionando usuários ao sistema
        librarySystem.addUser(user1);
        librarySystem.addUser(user2);

        // Criando recursos
        Recurso resource1 = Fabrica.createResource("livro", "Book 1", "autor 1", 10);
        Recurso resource2 = Fabrica.createResource("revista", "Book 2","", 10);
        // Adicionando recursos ao sistema
        librarySystem.addRecurso(resource1);
        librarySystem.addRecurso(resource2);

        // Fazendo uma reserva
        librarySystem.reservar(user1, resource1);

        // Realizando um empréstimo
        librarySystem.emprestar(user1, resource2);

        // Tentando fazer outra reserva para o mesmo recurso
        librarySystem.reservar(user2, resource1);

        // Retornando um recurso
        librarySystem.retornarRecurso(resource2);

        // Verificando recursos disponíveis
        List<Recurso> availableResources = librarySystem.showAvailableResources();
        for (Recurso resource : availableResources) {
            System.out.println(resource);
        }

        // Registrando usuário como observador de uma reserva
        ReservationNotifier reservationNotifier = librarySystem.getReservationNotifier();
        reservationNotifier.registrarObservador(user2);

        // Mudando o estado de um recurso para disponível (simulando a disponibilidade)
        resource1.setState(new AvailableState(resource1));

        // Observador é notificado sobre a disponibilidade do recurso
        reservationNotifier.notifyObservers(user2, resource1);
    }
}
