public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pavimento pavimento01 = new Pavimento("Pavimento 01");
        sinal sinal01 = new sinal();
        Cela cela01 = new Cela(pavimento01, "cela 01");
        Cela cela02 = new Cela(pavimento01, "cela 02");
        Recurso racao = new Recurso(pavimento01, 100, "Ração", 100);
        
        
        pavimento01.registrarRecurso(racao);
        pavimento01.registrarCela(cela01);
        pavimento01.registrarCela(cela02);
        cela01.setQuantidadeDePresos(200);
        cela02.setQuantidadeDePresos(50);
        sinal01.addObserver(cela01);
        
        pavimento01.distribuirRecurso(racao, 50);
        pavimento01.distribuirRecurso(racao, 50);
        sinal01.setDados(80, true);
        pavimento01.quantidadeDePresos();
        
    }
}
