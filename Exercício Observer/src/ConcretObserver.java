public class ConcretObserver implements Observer {

    private String nome;
    

    public ConcretObserver(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {
        System.out.println(this.nome + " atualizou temp:" + temperatura);
        System.out.println(this.nome + " atualizou umidade:" + umidade);
        System.out.println(this.nome + " atualizou pressao:" + pressao);
    }
    
}
