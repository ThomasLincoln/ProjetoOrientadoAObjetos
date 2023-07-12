import java.util.Arrays;

public class ListaComVetor implements Implementador{

    private int vetor[];
    private int tamanho;

    @Override
    public void dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        int primeiro = 0;
        while (vetor[primeiro] == -1) {
            primeiro++;
        }
        vetor[primeiro] = -1;
        tamanho--;
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] == -1 && vetor[i + 1] != -1) {
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = -1;
            }
        }
    }

    public ListaComVetor(int capacidade) {
        this.vetor = new int[capacidade];
        Arrays.fill(vetor, -1); // preenche o vetor com -1 para indicar que está vazio
        this.tamanho = 0;
    }

    @Override
    public String imprimir() {
        if (tamanho == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != -1) {
                sb.append(vetor[i]);
                sb.append(", ");
            }
        }
        sb.delete(sb.length()-2, sb.length()); // Remove a última vírgula e espaço
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void enqueue(int o) {
        if (tamanho == vetor.length) {
            throw new IllegalStateException("Fila cheia");
        }
        int contador = 0;
        while (vetor[contador] != -1) {
            contador++;
        }
        vetor[contador] = o;
        tamanho++;
    }

    @Override
    public Boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public int size() {
        return tamanho;
    }
    
}
