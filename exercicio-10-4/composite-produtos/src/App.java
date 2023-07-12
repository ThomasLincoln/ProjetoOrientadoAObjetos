import java.util.List;

public class App {
    public static void main(String[] args) {
        PublicacaoComposta jornal = new PublicacaoComposta("Jornal Diário");
        PublicacaoComposta cadernoDeEsportes = new PublicacaoComposta("Caderno de Esportes");
        PublicacaoComposta cadernoDeCultura = new PublicacaoComposta("Caderno de Cultura");

        Artigo noticiaLoL = new Artigo("Notícia LoL", "Pedro ('Pandinha')");
        Artigo noticiaDota = new Artigo("Notícia Dota 2", "Serjo]");

        Artigo noticiaEsportes1 = new Artigo("Neymar marca gol de placa", "Jornalista Esportivo");
        Artigo noticiaEsportes2 = new Artigo("Brasil é eliminado da Copa do Mundo", "Jornalista Esportivo");
        Artigo noticiaCultura1 = new Artigo("Novo filme de Tarantino é sucesso de crítica", "Crítico de Cinema");
        Artigo noticiaCultura2 = new Artigo("Orquestra Sinfônica se apresenta na cidade", "Jornalista Cultural");

        cadernoDeEsportes.adicionarPublicacao(noticiaEsportes1);
        cadernoDeEsportes.adicionarPublicacao(noticiaEsportes2);
        cadernoDeCultura.adicionarPublicacao(noticiaCultura1);
        cadernoDeCultura.adicionarPublicacao(noticiaCultura2);

        jornal.adicionarPublicacao(cadernoDeEsportes);
        jornal.adicionarPublicacao(cadernoDeCultura);
        jornal.adicionarPublicacao(noticiaLoL);
        jornal.adicionarPublicacao(noticiaDota);

        // List<publicacao> publicacoes = jornal.getPublicacoes();
        // for (publicacao p : publicacoes) {
        // System.out.println(p.toString());
        // }
        int i[] = jornal.getNumeroPublicacoesEArtigos();
        System.out.println("Publicações: " + i[0] + " Artigos: " + i[1]);
        

        jornal.getString();
    }
}