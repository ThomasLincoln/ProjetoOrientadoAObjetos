import java.util.ArrayList;
import java.util.List;

public class Pavimento implements Mediator{

    
    private String nome;

    private List<Cela> celas;
    private List<Guarda> guardas;
    private List<Recurso> estoque;

    
    public Pavimento(String nome) {
        this.nome = nome;
        celas = new ArrayList<>();
        guardas = new ArrayList<>();
        estoque = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void registrarCela(Cela o) {
        this.celas.add(o);
    }

    @Override
    public void registrarGuarda(Guarda o) {
        this.guardas.add(o);
    }

    @Override
    public void registrarRecurso(Recurso o) {
        this.estoque.add(o);
    }

    @Override
    public void quantidadeDePresos() {
        int i = 0;
        for(Cela o: celas){
            i = i + o.getQuantidadeDePresos();
        }
        System.out.println("Temos " + i + " presos");
    }

    @Override
    public void notificarEmergencia(String tipoDeEmergencia, boolean fuga) {
        if(tipoDeEmergencia == "Frio"){
            System.out.println("Mandar guardas verificar aquecedor");
            // TODO guarda interage com isso

        }else if(tipoDeEmergencia == "Fogo"){
            System.out.println("Acionar alarmes de Incendio");
            // TODO guarda interage com isso
            
            for(Cela o: celas){
                o.emergencia(tipoDeEmergencia);
            }
        }

        if(fuga == true){
            System.out.println("Está havendo uma fuga");
            // TODO guarda interage com isso

            for(Cela o: celas){
                o.emergencia(tipoDeEmergencia);
            }
        }
    }

    @Override
    public void updateQuantidadePresoNaCela(Cela o, int quantidadeDePresos) {
        // método para atualizar a quantidade de presos
        o.setQuantidadeDePresos(quantidadeDePresos);
    }

    @Override
    public void updateRecursos(Recurso o, int quantidade) {
        o.setQuantidade(quantidade);
    }

    @Override
    public void distribuirRecurso(Recurso o, int quantidade) {
        int i = celas.size();
        o.distribuir(quantidade * i);
    }

    @Override
    public void verificarQuantidadeDeRecursos(Recurso o) {
        int quantidade = o.getQuantidade();
        int ideal = o.getIdeal();
        int diferenca = ideal - quantidade;
        if (diferenca > 0){
            System.out.println("Estoque abaixo do ideal recomenda-se adicionar pelo menos: " + diferenca);
            // TODO mandar algum guarda especifico fazer isso, da pra tipo, fazer uma lista de guardas especificos, 
            // TODO ou um objeto de guarda tipo, private Guarda gerenciadorDeRecursos; que ai a classe app cria e passa pra ele no construtor.
            // TODO mas é só uma ideia
        }else{
            System.out.println("Tudo okay");
        }
    }
    
    
}
