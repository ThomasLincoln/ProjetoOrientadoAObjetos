// Fábrica Concreta para Retangulos
class RetanguloFactory extends FormFactory{
    private PointFactory pontoFactory1;
    private PointFactory pontoFactory2;

    public RetanguloFactory(PointFactory pontoFactory1, PointFactory pontoFactory2) {
        this.pontoFactory1 = pontoFactory1;
        this.pontoFactory2 = pontoFactory2;
    }

    @Override
    public Figura criarFigura() {
        Ponto ponto1 = pontoFactory1.criarPonto();
        Ponto ponto2 = pontoFactory2.criarPonto();
        return new Retangulo(ponto1, ponto2);
    }
}