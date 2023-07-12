import java.util.ArrayList;
import java.util.List;

public class PublicacaoComposta implements publicacao {
    private String titulo;
    private List<publicacao> publicacoes = new ArrayList<>();

    @Override
    public String getAutor() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getTitulo() {
        return titulo;
    }


    
    @Override
    public String toString() {
        return "PublicacaoComposta [titulo=" + titulo + "]";
    }

    public int[] getNumeroPublicacoesEArtigos() {
        int numPublicacoes = 0;
        int numArtigos = 0;

        for (publicacao p : publicacoes) {
            if (p instanceof PublicacaoComposta) {
                int[] result = ((PublicacaoComposta) p).getNumeroPublicacoesEArtigos();
                numPublicacoes+= result[0];
                numPublicacoes++;
                numArtigos+= result[1];
            }else if (p instanceof Artigo) {
                numArtigos++;
            } else{
                numPublicacoes++;
            }
        }
        return new int[] {numPublicacoes, numArtigos};
    }

    public void getString() {
        for (publicacao p : publicacoes) {
            if (p instanceof Artigo) {
                System.out.println(p.toString());
            } else{
                System.out.println(p.toString());
            }
        }

    }

    public PublicacaoComposta(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarPublicacao(publicacao publicacao) {
        publicacoes.add(publicacao);
    }

    public void removerPublicacao(publicacao publicacao) {
        publicacoes.remove(publicacao);
    }

    public List<publicacao> getPublicacoes() {
        return publicacoes;
    }
}
