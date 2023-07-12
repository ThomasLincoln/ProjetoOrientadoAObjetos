public class Espada implements Estado{

    @Override
    public void Atacar() {
        System.out.println("Atacando com uma espada, você realmente deu muito dano");
    }

    @Override
    public void Defender() {
        System.out.println("Defendendo com uma espada, bem, não sei como você achou que daria em algo");
    }
    
}
