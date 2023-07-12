// Fábrica Concreta para Triangulos
class TrianguloFactory extends FormFactory {
    private PointFactory PointFactory1;
    private PointFactory PointFactory2;
    private PointFactory PointFactory3;

    public TrianguloFactory(PointFactory PointFactory1, PointFactory PointFactory2, PointFactory PointFactory3) {
        this.PointFactory1 = PointFactory1;
        this.PointFactory2 = PointFactory2;
        this.PointFactory3 = PointFactory3;
    }

    @Override
    public Figura criarFigura() {
        Ponto ponto1 = PointFactory1.criarPonto();
        Ponto ponto2 = PointFactory2.criarPonto();
        Ponto ponto3 = PointFactory3.criarPonto();
        return new Triangulo(ponto1, ponto2, ponto3);
    }
}