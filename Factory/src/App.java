public class App {
    public static void main(String[] args) {
        Figura circulo = CriadorConcreto.criarFigura("circulo", 5, 0);
        System.out.println("Área do Círculo: " + circulo.area());
        System.out.println("Raio do Círculo: " + ((Circulo) circulo).getRaio());

        Figura quadrado = CriadorConcreto.criarFigura("quadrado", 4, 0);
        System.out.println("Área do Quadrado: " + quadrado.area());
        System.out.println("Lado do Quadrado: " + ((Retangulo) quadrado).getX());

        Figura trEquilatero = CriadorConcreto.criarFigura("trequilatero", 3, 6);
        System.out.println("Área do Triângulo Equilátero: " + trEquilatero.area());
        System.out.println("Lado do Triângulo Equilátero: " + ((Triangulo) trEquilatero).getAltura());
        System.out.println("Base do Triângulo Equilátero: " + ((Triangulo) trEquilatero).getBase());
    }
}
