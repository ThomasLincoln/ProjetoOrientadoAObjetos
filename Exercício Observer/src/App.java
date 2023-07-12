public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        EstacaoColetaDeDados amazonas1 = new EstacaoColetaDeDados();

        ConcretObserver SaoPaulo = new ConcretObserver("São Paulo");

        amazonas1.addObserver(SaoPaulo);

        amazonas1.setDados( 87, 47, 14);
        amazonas1.setDados( 91, 23, 108);
        amazonas1.setDados( 65, 30, 41 );

    }
}
