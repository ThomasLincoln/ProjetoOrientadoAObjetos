public class Circulo extends Figura implements Cloneable{
    private int raio;
    private Ponto centro;

    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public Circulo(int raio, Ponto centro) {
        this.raio = raio;
        this.centro = centro;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public Figura clonar() {
        try{
            Circulo clone = (Circulo) super.clone();
            clone.setCentro(this.centro.clonar());
            return clone;
        }catch(CloneNotSupportedException e){
            return null;
        }
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", centro=" + centro + "]";
    }
    
}
