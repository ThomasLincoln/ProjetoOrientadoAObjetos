public class Fabrica {
    
    public static Recurso createResource(String type, String title, String autor, int pages){
        if(type.equalsIgnoreCase("livro")){
            return new Livro(title, autor, pages);            
        }else if(type.equalsIgnoreCase("revista")){
            return new Revista(title, pages);
        }
        else{
            throw new IllegalArgumentException("Tipo de recurso desconhecido: " + type);
        }
    }
}
