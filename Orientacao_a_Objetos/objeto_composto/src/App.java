public class App {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 1.75, 31);

        l[1] = new Lutador("Radagon", "Eldus Regus", 50, 1000, 1, 0, 10, 200);

        l[0].status();
    }
}
