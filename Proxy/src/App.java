import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a frase:");
        String frase = teclado.nextLine();
        valores val = new valores();

        ServiceInterface firstChain = CriadorDeProcessador.criaEncadeamento();
        firstChain.operacao(frase, val);
        System.out.println("Numero de espaços: " + val.getEspacos() + ", numero de 'a': " + val.getLetrasA() + " e número de pontos: " + val.getPontos());
    }
}
