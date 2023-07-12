public class Triangulo extends Figura {
    private Ponto ponto1;
    private Ponto ponto2;
    private Ponto ponto3;

    public Triangulo(Ponto ponto1, Ponto ponto2, Ponto ponto3) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        this.ponto3 = ponto3;
    }

    @Override
    public double calcularArea() {
        double x1 = ponto1.getX();
        double y1 = ponto1.getY();
        double x2 = ponto2.getX();
        double y2 = ponto2.getY();
        double x3 = ponto3.getX();
        double y3 = ponto3.getY();

        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
    }
}
