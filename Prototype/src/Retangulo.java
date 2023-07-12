public class Retangulo extends Figura implements Cloneable{
    
    private Ponto cantoSuperiorEsquerdo;
    private Ponto cantoInferiorDireito;
    
    public Retangulo(Ponto cantoSuperiorEsquerdo, Ponto cantoInferiorDireito) {
        this.cantoSuperiorEsquerdo = cantoSuperiorEsquerdo;
        this.cantoInferiorDireito = cantoInferiorDireito;
    }

    public Ponto getCantoSuperiorEsquerdo() {
        return cantoSuperiorEsquerdo;
    }

    public void setCantoSuperiorEsquerdo(Ponto cantoSuperiorEsquerdo) {
        this.cantoSuperiorEsquerdo = cantoSuperiorEsquerdo;
    }

    public Ponto getCantoInferiorDireito() {
        return cantoInferiorDireito;
    }

    public void setCantoInferiorDireito(Ponto cantoInferiorDireito) {
        this.cantoInferiorDireito = cantoInferiorDireito;
    }

    @Override
    public String toString() {
        return "Retangulo [cantoSuperiorEsquerdo=" + cantoSuperiorEsquerdo + ", cantoInferiorDireito="
                + cantoInferiorDireito + "]";
    }

    @Override
    public double calcularArea() {
        double base = Math.abs(cantoSuperiorEsquerdo.getX() - cantoInferiorDireito.getX());
        double altura = Math.abs(cantoSuperiorEsquerdo.getY() - cantoInferiorDireito.getY());
        return base * altura;
    }

    @Override
    public Figura clonar() {
        try {
            Retangulo clone = (Retangulo) super.clone();
            clone.setCantoInferiorDireito(this.cantoInferiorDireito.clonar());
            clone.setCantoSuperiorEsquerdo(this.cantoSuperiorEsquerdo.clonar());
            return clone;
          } catch (CloneNotSupportedException e) {
            return null;
          }
    }

}
