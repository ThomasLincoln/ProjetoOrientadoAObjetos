public class Fachada {
    private Projetor projetor;
    private Luz luz;
    private Amplificador amplificador;
    private Tela tela;
    private DVD dvd;
    private CD cd;
    private MaquinaPipoca maquinaPipoca;
    private Sintonizador sintonizador;
    private Refrigerante refrigerante;

    public Fachada(Projetor projetor, Luz luz, Amplificador amplificador, Tela tela, DVD dvd, CD cd,
            MaquinaPipoca maquinaPipoca, Sintonizador sintonizador, Refrigerante refrigerante) {
        this.projetor = projetor;
        this.luz = luz;
        this.amplificador = amplificador;
        this.tela = tela;
        this.dvd = dvd;
        this.cd = cd;
        this.maquinaPipoca = maquinaPipoca;
        this.sintonizador = sintonizador;
        this.refrigerante = refrigerante;
    }


    public void operarProjetor() {
        projetor.ligar();
    }

    public void operarLuz() {
        luz.ligar();
    }

    public void operarAmplificador() {
        amplificador.ligar();
    }

    public void operarTela() {
        tela.descer();
    }

    public void operarDVD(String dvdSelecionado) {
        dvd.ligar();
        dvd.play(dvdSelecionado);
    }

    public void operarCD(String cdSelecionado) {
        cd.ligar();
        cd.play(cdSelecionado);
    }

    public void operarMaquina() {
        maquinaPipoca.ligar();
        maquinaPipoca.prepararPipoca();
    }

    public void operarSintonizador() {
        sintonizador.ligar();
    }

    public void ajustarVolumeCD(int volume) {
        cd.setVolume(volume);
    }

    public void ajustarVolumeDVD(int volume) {
        dvd.setVolume(volume);
    }

    public void ajustarBrilhoProjetor(int brilho) {
        projetor.setBrilho(brilho);
    }

    public void abastecerRefri(int quantidade) {
        refrigerante.abastecer(quantidade);
    }

    public void abastecerPipoca(int quantidade) {
        maquinaPipoca.abastecer(quantidade);
    }

    public void encherCopo() {
        refrigerante.encherCopo();
    }

    public void pegarPipoca() {
        maquinaPipoca.prepararPipoca();
    }

    public void assistirFilme() {
        operarProjetor();
        operarLuz();
        operarAmplificador();
        operarTela();
        operarDVD(dvd.getFilme());
        ajustarVolumeDVD(20);
        encherCopo();
        pegarPipoca();
    }

    public void verificarStatus() {
        System.out.println("Status do projetor: " + projetor.getLigado());
        System.out.println("Status da luz: " + luz.getLigado());
        System.out.println("Status do amplificador: " + amplificador.getLigado());
        System.out.println("Status da tela: " + tela.getLigado());
        System.out.println("Filme em reprodução no DVD: " + dvd.getFilme());
        System.out.println("Volume do CD: " + cd.getVolume());
        System.out.println("Brilho do projetor: " + projetor.getBrilho());
        System.out.println("Nível de refrigerante: " + refrigerante.getQuantidade());
        System.out.println("Quantidade de pipoca: " + maquinaPipoca.getQuantidade());
    }

}
