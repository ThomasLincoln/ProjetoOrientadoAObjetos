public abstract class EstadoDoRecurso {
    protected Recurso recurso;

    public EstadoDoRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public abstract void borrow(User usuario);

    public abstract void retornaRecurso();

    public abstract void fazerReserva(User usuario);

}
