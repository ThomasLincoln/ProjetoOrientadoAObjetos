public class Pessoa {
    private String nome;
    private int Id;

    
    public String getNome() {
        return nome;
    }
    public int getId() {
        return Id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public Pessoa(String nome, int Id) {
        this.nome = nome;
        this.Id = Id;
    }
}
