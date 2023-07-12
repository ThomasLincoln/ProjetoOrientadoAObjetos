public class DVD {


    private Boolean Ligado;
    private int volume;


    private String filme;

    public void ligar() {
        this.Ligado = !this.Ligado;
    }

    public void play(String dvd) {
        System.out.println("Tocando " + dvd);
        this.filme = dvd;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public Boolean getLigado() {
        return Ligado;
    }

    public void setLigado(Boolean ligado) {
        Ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public DVD(Boolean ligado, int volume, String filme) {
        Ligado = ligado;
        this.volume = volume;
        this.filme = filme;
    }

    public String getFilme() {
        return filme;
    }

}
