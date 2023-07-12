public class App {
    public static void main(String[] args) throws Exception {
        // Criação das fábricas de pontos
        PointFactory PointFactory1 = new PointFactoryImp1(0, 0);
        PointFactory PointFactory2 = new PointFactoryImp1(4, 0);
        PointFactory PointFactory3 = new PointFactoryImp1(0, 3);

        // Criação das fábricas de figuras
        FormFactory circuloFactory = new CirculoFactory(5);
        FormFactory retanguloFactory = new RetanguloFactory(PointFactory1, PointFactory2);
        FormFactory trianguloFactory = new TrianguloFactory(PointFactory1, PointFactory2, PointFactory3);

        // Criação das figuras usando as fábricas
        Figura circulo = circuloFactory.criarFigura();
        Figura retangulo = retanguloFactory.criarFigura();
        Figura triangulo = trianguloFactory.criarFigura();

        // Cálculo das áreas
        double areaCirculo = circulo.calcularArea();
        double areaRetangulo = retangulo.calcularArea();
        double areaTriangulo = triangulo.calcularArea();

        // Impressão dos resultados
        System.out.println("Área do Círculo: " + areaCirculo);
        System.out.println("Área do Retângulo: " + areaRetangulo);
        System.out.println("Área do Triângulo: " + areaTriangulo);

    }
}
