import java.util.HashMap;

public class CriadorConcreto {
    private static final HashMap<String, Figura> construtores = new HashMap<>();

    static {
        construtores.put("circulo", new Circulo(0));
        construtores.put("quadrado", new Retangulo(0));
        construtores.put("trequilatero", new Triangulo(0, 0));
    }

    public static Figura criarFigura(String tipo, int medida, int base) {
        Figura figura = construtores.get(tipo.toLowerCase());

        if (figura != null) {
            if (figura instanceof Circulo) {
                ((Circulo) figura).setRaio(medida);
            } else if (figura instanceof Retangulo) {
                ((Retangulo) figura).setX(medida);
            } else if (figura instanceof Triangulo) {
                ((Triangulo) figura).setAltura(medida);
                ((Triangulo) figura).setBase(base);
            }
        }

        return figura;
    }
}
