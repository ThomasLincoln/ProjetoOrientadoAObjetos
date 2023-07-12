public class PointFactoryImp1 extends PointFactory {
    private int x;
    private int y;
    
    public PointFactoryImp1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Ponto criarPonto() {
        return new Ponto(x, y);
    }
    
}
