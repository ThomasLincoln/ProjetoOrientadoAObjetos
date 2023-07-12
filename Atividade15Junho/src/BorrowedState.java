public class BorrowedState extends EstadoDoRecurso {
    public BorrowedState(Recurso recurso){
        super(recurso);
    }

    @Override
    public void borrow(User usuario) {
        System.out.println("Já foi emprestado");
    }

    @Override
    public void retornaRecurso() {
        recurso.setState(new AvailableState(recurso));
        System.out.println(recurso.getTitulo() + " foi devolvido");
    }

    @Override
    public void fazerReserva(User usuario) {
        System.out.println("Resource is already borrowed.");
    }
    
}
