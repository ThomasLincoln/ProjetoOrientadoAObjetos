public class App {
    public static void main(String[] args) throws Exception {
        Banco bancoPessoas = new Banco();
        String[] add = { "new", "1", "João" };
        bancoPessoas.execute(add);
        add[2] = "Thomas";
        add[1] = "2";
        bancoPessoas.execute(add);
        String[] get = { "get", "1", null };
        bancoPessoas.execute(get);
        String[] all = { "all", "1", null };
        bancoPessoas.execute(all);        
        String[] remove = { "delete", "1", null };
        bancoPessoas.execute(remove);
        bancoPessoas.execute(all);        
    }
}
