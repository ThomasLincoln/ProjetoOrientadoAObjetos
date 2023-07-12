public class Cela extends Componente implements Observer {

    // as celas são observadores de sinais
    private Mediator mediator;
    private String nome;
    private int quantidadeDePresos;
    private Boolean trancada;
    
    Cela(Mediator m, String nome) {
        super(m);
        this.mediator = m;
        this.nome = nome;
        this.trancada = true;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeDePresos() {
        return quantidadeDePresos;
    }

    public void setQuantidadeDePresos(int quantidadeDePresos) {
        this.quantidadeDePresos = quantidadeDePresos;
    }

    public void emergencia(String tipo){
        if(tipo == "Fogo"){
            this.trancada = false;
        } else if(tipo == "Fuga"){
            this.trancada = true;
        }
    }

    @Override
    public void update(float temperatura, boolean fuga) {
        if(fuga){

        }
        if(temperatura < 15){
            System.out.println("Ta muito frio");
            mediator.notificarEmergencia("Frio", fuga);
        }else if(temperatura > 40){
            mediator.notificarEmergencia("Fogo", fuga);
        }
        
    }
    
    
}
