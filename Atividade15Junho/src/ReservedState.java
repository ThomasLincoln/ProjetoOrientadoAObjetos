public class ReservedState extends EstadoDoRecurso {
    private User reservadoUser;

    public ReservedState(Recurso recurso, User reservadoUser){
        super(recurso);
        this.reservadoUser = reservadoUser;
    }

    @Override
    public void borrow(User usuario) {
        if (usuario.equals(reservadoUser)) {
            recurso.setState(new BorrowedState(recurso));
            System.out.println(usuario.getName()+ " emprestou " + recurso.getTitulo());
        } else {
            System.out.println("Foi reservado por outro usuário");
        }
    }

    @Override
    public void retornaRecurso() {
        System.out.println("Está reservado e não pode ser retornado");
    }

    @Override
    public void fazerReserva(User usuario) {
        if (usuario.equals(reservadoUser)) {
            System.out.println("Você tem uma reserva para esse recurso");
        } else {
            System.out.println("Já está reservado");
        }
    }
}
