
public class Revista implements Recurso {
    private String titulo;
    private int paginas;
    public EstadoDoRecurso state;
    
    @Override
    public String getTitulo() {
        return titulo;
    }
    public Revista(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.state = new AvailableState(this);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        this.setState(new AvailableState(this));
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


    public void fazerReserva(User usuario) {
        state.fazerReserva(usuario);
    }

    public void setState(EstadoDoRecurso estado) {
        this.state = estado;
    }

    public boolean isAvailable() {
        return state instanceof AvailableState;
    }

    public void borrow(User usuario) {
        state.borrow(usuario);
    }

    public void retornaRecurso() {
        state.retornaRecurso();
    }

}
