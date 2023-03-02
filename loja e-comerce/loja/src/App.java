public class App {
    public static void main(String[] args) throws Exception {
        Produtos produto = new Produtos();

        Livros livro = new Livros("Cássio: a trajetória do maior goleiro da história do Corinthians", 29, "CASSIO");
        System.out.println(livro.puxaLivros());

        Eletronicos eletronico = new Eletronicos("Sony", "videogame", "psp desbloqueado funcionando 100%", 300);
        System.out.println(eletronico.puxaEletronico());
    }
}
