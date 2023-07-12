public class espacosNum implements ServiceInterface {

    private ServiceInterface proximo;

    public espacosNum(ServiceInterface proximo) {
        this.proximo = proximo;
    }

    @Override
    public void operacao(String frase, valores val) {
        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                count++;
            }
        }

        val.setEspacos(count);
        proximo.operacao(frase, val);
    }

    public valores retornValores(valores val){
        return (val);
    }

}
