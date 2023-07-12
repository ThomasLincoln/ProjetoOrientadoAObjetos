public class Player {
    private EstrategiaDeAtaque estrategia;

    
    public void Atacar(){
        this.estrategia.Atacar();
    }
    public void setEstrategia(EstrategiaDeAtaque estrategia) {
        this.estrategia = estrategia;
    }
    
    public void setEstrategia() {
        this.estrategia = new SemEstrategia();
    }
}
