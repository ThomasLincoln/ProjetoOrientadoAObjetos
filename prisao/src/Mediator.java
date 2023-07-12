import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public interface Mediator {
    // Registra uma cela no mediator
    void registrarCela(Cela o);

    // Registra um guarda no mediator
    void registrarGuarda(Guarda o);

    // Registra recurso no mediator
    void registrarRecurso(Recurso o);

    // Notificar emergencia 
    void notificarEmergencia(String tipoDeEmergencia, boolean fuga);

    // Atualizar a quantidade de presos por cela
    void updateQuantidadePresoNaCela(Cela o, int quantidaeCela);

    // Atualizar a quantidade de recursos disponíveis
    void updateRecursos (Recurso o, int quantidade);

    // Distribuir recursos para as celas do pavimento
    void distribuirRecurso (Recurso o, int quantidade);

    void quantidadeDePresos();

    void verificarQuantidadeDeRecursos(Recurso o);
}
