public class TestFifo {

    public static void main(String[] args) {
        Implementador listaComArray = new ListaComArray();
        Implementador listaComVetor = new ListaComVetor(10);

        Queue fifoComArray = new Fifo(listaComArray);
        Queue fifoComVetor = new Fifo(listaComVetor);

        // Adiciona elementos na fila com Array
        fifoComArray.adcionar(1);
        fifoComArray.adcionar(2);
        fifoComArray.adcionar(3);

        // Remove um elemento da fila com Array e verifica se está correto
        fifoComArray.remover();
        System.out.println("Fila com Array após remover um elemento: " + fifoComArray.implementador1.imprimir());

        // Adiciona elementos na fila com Vetor
        fifoComVetor.adcionar(1);
        fifoComVetor.adcionar(2);
        fifoComVetor.adcionar(3);
        fifoComVetor.adcionar(4);

        // Remove um elemento da fila com Vetor e verifica se está correto
        fifoComVetor.remover();
        System.out.println("Fila com Vetor após remover um elemento: " + fifoComVetor.implementador1.imprimir());

    }
}