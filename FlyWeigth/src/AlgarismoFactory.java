import java.util.List;
import java.util.ArrayList;

public class AlgarismoFactory {
    List<Algarismo> numeros;

    public void criar(int numero) {
        Boolean existeAux = false;

        for (int i = 0; i < numeros.size(); i++) {
            if (numero == numeros.get(i).numero) {
                existeAux = true;
                break;
            }
        }
        if (!existeAux) {
            Algarismo numeroaux = new Algarismo(numero);
            numeros.add(numeroaux);
        }
    }

    public List<Algarismo> getNumeros() {
        return numeros;
    }

    public AlgarismoFactory() {
        numeros = new ArrayList<Algarismo>();
    }
}
