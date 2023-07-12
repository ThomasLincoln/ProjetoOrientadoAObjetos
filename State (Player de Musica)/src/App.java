public class App {
    public static void main(String[] args) throws Exception {
        Escudo grassShield = new Escudo();
        Player Carlos = new Player(grassShield);
        Carlos.Atacar();
        Carlos.Defender();
        Espada katanEspada = new Espada();
        Player Marcelo = new Player(katanEspada);
        Marcelo.Atacar();
        Marcelo.Defender();

        Player Jonais = new Player();
        Jonais.Atacar();
        Jonais.Defender();
    }
}
