public class Retangulo implements Figura {

    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Retangulo(int x) {
        this.x = x;
    }

    @Override
    public double area() {
        return this.x * this.x;
    }
    
}
