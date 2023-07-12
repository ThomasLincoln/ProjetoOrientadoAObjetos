public class dotsNumber implements ServiceInterface{

    @Override
    public void operacao(String frase, valores val) {
        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == '.') {
                count++;
            }
        }
        val.setPontos(count);
    }
    
}
