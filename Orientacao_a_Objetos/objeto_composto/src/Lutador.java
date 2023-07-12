public class Lutador {
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private int vitorias, derrotas, empate;
    private double altura;
    private float peso;

    // métodos publicos
    public void apresentar() {
        System.out.println("CHEGOU A HORA! Apresentamos " + this.getNome());
        System.out.println("Direto de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " metros");
        System.out.println("Pesando " + this.getPeso()  + " Kg");
    }

    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getPeso());
        System.out.println("Ganhou : " + this.getVitorias());
        System.out.println("Perdeu : " + this.getDerrotas());
        System.out.println("Empaptou : " + this.getEmpate());
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empataLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }

    // Métodos especiais
    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empate, double altura,
            float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empate = empate;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if(this.peso <=70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Médio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    
}
