public class AlgarismoMutavel implements Mutavel {
    private Algarismo algarismo;
    private String cor;

    public AlgarismoMutavel(Algarismo algarismo, String cor) {
        this.algarismo = algarismo;
        this.cor = cor;
    }

    public void AlterarAlagarismo(Algarismo algarismo) {
        this.algarismo = algarismo;
    }

    public Algarismo getAlgarismo() {
        return algarismo;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void alterarAlgarismo(int novoAlgarismo) {
        // TODO Auto-generated method stub

    }

}
