import java.util.Random;
import java.util.List;
import java.util.ArrayList;

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
        List<String> cores = new ArrayList<String>();
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Roxo");
        cores.add("Laranja");
        cores.add("Cinza");
        cores.add("Rosa");
        cores.add("Marrom");
        cores.add("Preto");
        cores.add("Branco");
        cores.add("Prata");
        cores.add("Dourado");
        cores.add("Turquesa");
        cores.add("Magenta");
        cores.add("Ciano");
        cores.add("Lilás");
        cores.add("Verde-água");
        cores.add("Amarelo-limão");
        cores.add("Rubi");
        for (int j = 0; j < 10; j++) {
            int algarismoIndex = random.nextInt(fabrica.getNumeros().size());
            Algarismo algarismo = fabrica.getNumeros().get(algarismoIndex);
            int aux = random.nextInt(cores.size());
            AlgarismoMutavel auxAlg = new AlgarismoMutavel(algarismo, cores.get(aux));
            System.out.println(auxAlg.toString());
        }
    }
}
