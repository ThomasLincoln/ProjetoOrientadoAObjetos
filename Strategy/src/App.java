public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Player Carlos = new Player();
        Carlos.setEstrategia();
        Carlos.Atacar();
        Carlos.setEstrategia(new AtaqueEspada());
        Carlos.Atacar();
        Carlos.setEstrategia(new AtaqueMagia());
        Carlos.Atacar();
    }
}
