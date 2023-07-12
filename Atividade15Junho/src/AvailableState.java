
public class AvailableState extends EstadoDoRecurso {

    public AvailableState(Recurso recurso) {
        super(recurso);
    }

    @Override
    public void borrow(User usuario) {
        recurso.setState(new BorrowedState(recurso));
        System.out.println(usuario.getName() + " emprestou " + recurso.getTitulo());
    }

    @Override
    public void retornaRecurso() {
        System.out.println("Já esta devolvido");
    }

    @Override
    public void fazerReserva(User usuario) {
        recurso.setState(new ReservedState(recurso, usuario));
        System.out.println(usuario.getName() + " Reservou " + recurso.getTitulo());
    }

}
