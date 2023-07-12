public interface Recurso {

    public void fazerReserva(User usuario);

    public void setState(EstadoDoRecurso estado);

    public boolean isAvailable();

    public void borrow(User usuario);

    public void retornaRecurso(); 

    public String getTitulo();
    

}
