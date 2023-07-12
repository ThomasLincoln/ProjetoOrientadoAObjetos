public class Livro implements Recurso {
    private String titulo, autor;
    private int pages;
    public EstadoDoRecurso state;


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Livro(String titulo, String autor, int pages) {
        this.titulo = titulo;
        this.autor = autor;
        this.pages = pages;
        this.state = new AvailableState(this);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
