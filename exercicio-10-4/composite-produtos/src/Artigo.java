public class Artigo implements publicacao {
    private String titulo;
    private String autor;


    public Artigo(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }


    @Override
    public String getAutor() {
        return autor;
    }


    @Override
    public String getTitulo() {
        return titulo;
    }


    @Override
    public String toString() {
        return "Artigo [titulo=" + titulo + ", autor=" + autor + "]";
    }



}
