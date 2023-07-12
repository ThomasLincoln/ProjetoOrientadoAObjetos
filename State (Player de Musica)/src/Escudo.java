public class Escudo implements Estado{

    @Override
    public void Atacar() {
        System.out.println("Como? Como você ataca usando um escudo?");
    }

    @Override
    public void Defender() {
        System.out.println("Agora sim uma defesa de verdade");
    }
    
}
