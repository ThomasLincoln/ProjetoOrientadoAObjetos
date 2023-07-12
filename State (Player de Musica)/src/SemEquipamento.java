public class SemEquipamento implements Estado{

    @Override
    public void Atacar() {
        System.out.println("Você não consegue fazer muito com só um soco");
    }

    @Override
    public void Defender() {
        System.out.println("Suas mãos não são bem uma defesa");
    }
    
}
