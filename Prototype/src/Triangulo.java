public class Triangulo extends Figura implements Cloneable {
  private Ponto ponto1;
  private Ponto ponto2;
  private Ponto ponto3;

  public Ponto getPonto1() {
    return ponto1;
  }

  public void setPonto1(Ponto ponto1) {
    this.ponto1 = ponto1;
  }

  public Ponto getPonto2() {
    return ponto2;
  }

  public void setPonto2(Ponto ponto2) {
    this.ponto2 = ponto2;
  }

  public Ponto getPonto3() {
    return ponto3;
  }

  public void setPonto3(Ponto ponto3) {
    this.ponto3 = ponto3;
  }

  public Triangulo(Ponto ponto1, Ponto ponto2, Ponto ponto3) {
    this.ponto1 = ponto1;
    this.ponto2 = ponto2;
    this.ponto3 = ponto3;
  }

  @Override
  public String toString() {
    return "Triangulo [ponto1=" + ponto1 + ", ponto2=" + ponto2 + ", ponto3=" + ponto3 + "]";
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

  @Override
  public Figura clonar() {
    try {
      Triangulo clone = (Triangulo) super.clone();
      clone.setPonto1(this.ponto1.clonar());
      clone.setPonto2(this.ponto2.clonar());
      clone.setPonto3(this.ponto3.clonar());
      return clone;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}
