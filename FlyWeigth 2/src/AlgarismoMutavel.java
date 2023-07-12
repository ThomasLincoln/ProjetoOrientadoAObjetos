public class AlgarismoMutavel implements Mutavel {
    private Algarismo algarismo;
    private String cor;

    public AlgarismoMutavel(Algarismo algarismo, String cor) {
        this.algarismo = algarismo;
        this.cor = cor;
    }
        
    public Algarismo getAlgarismo() {
        return algarismo;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void alterarAlgarismo(Algarismo novoAlgarismo) {
        this.algarismo = novoAlgarismo;
    }

    @Override
    public String toString() {
        return "algarismo " + algarismo.getNumero() + " é " + cor;
    }

    

}
