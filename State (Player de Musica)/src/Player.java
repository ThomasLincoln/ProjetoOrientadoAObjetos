public class Player {
    private Estado equipamento;

    public Player (){
        this.equipamento = new SemEquipamento();
    }

    public Player(Estado equipamento) {
        this.equipamento = equipamento;
    }

    public void Atacar(){
        this.equipamento.Atacar();
    }

    public void Defender(){
        this.equipamento.Defender();
    }
}
