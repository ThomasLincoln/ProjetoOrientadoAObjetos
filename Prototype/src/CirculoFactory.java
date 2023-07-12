public class CirculoFactory extends FormFactory{

    private int raio;
    private PointFactory pontoFactory;

    public CirculoFactory(int raio, PointFactory fabrica) {
        this.raio = raio;
        this.pontoFactory = fabrica;
    }

    @Override
    public Figura criarFigura() {
        Ponto ponto1 = pontoFactory.criarPonto();
        return new Circulo(raio, ponto1);
    }
    
}
