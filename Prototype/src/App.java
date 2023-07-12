public class App {
    public static void main(String[] args) throws Exception {
        // Criação das fábricas de pontos
        PointFactory PointFactory1 = new PointFactoryImp1(0, 0);
        PointFactory PointFactory2 = new PointFactoryImp1(4, 0);
        PointFactory PointFactory3 = new PointFactoryImp1(0, 3);

        // Criação das fábricas de figuras
        FormFactory circuloFactory = new CirculoFactory(5, PointFactory1);
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

        Ponto p1 = new Ponto(3, 0);
        Ponto p2 = p1.clonar();
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Circulo circulo1 = new Circulo(3, p2);
        Circulo circulo2 = (Circulo) circulo1.clonar();

        System.out.println(circulo1.toString());
        System.out.println(circulo2.toString());

        Triangulo t1 = new Triangulo(p2, p1, p2);
        Triangulo t2 = (Triangulo) t1.clonar();

        System.out.println(t1.toString());
        System.out.println(t2.toString());

        Retangulo r1 = new Retangulo(p1, p2);
        Retangulo r2 = (Retangulo) r1.clonar();

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
