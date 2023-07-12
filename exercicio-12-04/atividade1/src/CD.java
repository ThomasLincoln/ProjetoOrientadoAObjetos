
public class CD {
    
    private Boolean Ligado;
    private int volume;
    private String musica;

    public void ligar() {
        this.Ligado = !this.Ligado;
    }

    public void play(String cd) {
        System.out.println("Tocando: " + cd);
        this.musica = cd;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public CD(Boolean ligado, int volume, String musica) {
        Ligado = ligado;
        this.volume = volume;
        this.musica = musica;
    }

}
