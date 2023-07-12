public class App {
    public static void main(String[] args) throws Exception {
        // Criando objetos para os componentes do cinema
        Projetor projetor = new Projetor(false, 40);
        Luz luz = new Luz(false);
        Amplificador amplificador = new Amplificador(false);
        Tela tela = new Tela(false);
        DVD dvd = new DVD(false, 20, "Mamonas Assassinas");
        CD cd = new CD(false, 20, "Ela Partiu");
        MaquinaPipoca maquinaPipoca = new MaquinaPipoca(false, 2000);
        Sintonizador sintonizador = new Sintonizador(false);
        Refrigerante refrigerante = new Refrigerante(false, 20);

        // Criando um objeto Fachada com os componentes do cinema
        Fachada fachada = new Fachada(projetor, luz, amplificador, tela, dvd, cd, maquinaPipoca, sintonizador,
                refrigerante);

        // Testando os métodos da Fachada
        fachada.assistirFilme(); // Liga todos os componentes e exibe um filme
        fachada.ajustarVolumeCD(10); // Ajusta o volume do CD para 10
        fachada.ajustarVolumeDVD(15); // Ajusta o volume do DVD para 15
        fachada.abastecerPipoca(2); // Abastece a máquina de pipoca com 2 unidades
        fachada.abastecerRefri(1); // Abastece o refrigerante com 1 unidade

        fachada.verificarStatus();
    }
}
