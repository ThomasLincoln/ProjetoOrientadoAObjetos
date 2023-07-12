public class letterA implements ServiceInterface {

    private ServiceInterface proximo;

    
    public letterA(ServiceInterface proximo) {
        this.proximo = proximo;
    }


    @Override
    public void operacao(String frase, valores val) {
        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                count++;
            }
        }

        val.setLetrasA(count);

        proximo.operacao(frase, val);
    }
    
}
