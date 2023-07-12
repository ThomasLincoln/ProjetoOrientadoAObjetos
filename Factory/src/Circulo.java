public class Circulo implements Figura {

    public int raio;

    
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        double area = (this.raio * this.raio) * 3.14;
        return area;
    }
    
}
