public class Retangulo extends Figura {
    
    private Ponto cantoSuperiorEsquerdo;
    private Ponto cantoInferiorDireito;
    
    public Retangulo(Ponto cantoSuperiorEsquerdo, Ponto cantoInferiorDireito) {
        this.cantoSuperiorEsquerdo = cantoSuperiorEsquerdo;
        this.cantoInferiorDireito = cantoInferiorDireito;
    }

    @Override
    public double calcularArea() {
        double base = Math.abs(cantoSuperiorEsquerdo.getX() - cantoInferiorDireito.getX());
        double altura = Math.abs(cantoSuperiorEsquerdo.getY() - cantoInferiorDireito.getY());
        return base * altura;
    }

}
