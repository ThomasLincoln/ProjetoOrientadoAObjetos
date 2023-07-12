public class CirculoFactory extends FormFactory{

    private int raio;

    public CirculoFactory(int raio) {
        this.raio = raio;
    }

    @Override
    public Figura criarFigura() {
        return new Circulo(raio);
    }
    
}
