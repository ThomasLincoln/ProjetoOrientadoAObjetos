import java.util.Random;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        AlgarismoFactory fabrica = new AlgarismoFactory();
        fabrica.criar(1);
        fabrica.criar(2);
        fabrica.criar(3);
        fabrica.criar(4);
        fabrica.criar(5);
        fabrica.criar(6);
        fabrica.criar(7);
        fabrica.criar(8);
        fabrica.criar(9);
        fabrica.criar(0);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            StringBuilder numero = new StringBuilder();
            for (int j = 0; j < 10; j++) {
                int algarismoIndex = random.nextInt(fabrica.getNumeros().size());
                Algarismo algarismo = fabrica.getNumeros().get(algarismoIndex);
                numero.append(algarismo.getNumero());
            }
            System.out.println(numero.toString());
        }

    }
}
