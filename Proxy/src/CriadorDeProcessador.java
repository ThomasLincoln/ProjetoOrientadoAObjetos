public class CriadorDeProcessador {
    
    public static ServiceInterface criaEncadeamento(){
        dotsNumber verificaPonto = new dotsNumber();
        letterA verificaLetraA = new letterA(verificaPonto);
        espacosNum verificaEspaco = new espacosNum(verificaLetraA);

        return verificaEspaco;
    }
}
