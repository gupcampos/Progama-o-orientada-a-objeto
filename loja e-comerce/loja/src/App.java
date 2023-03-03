public class App {
    public static void main(String[] args) throws Exception {
        Produtos produto = new Produtos();

        Livros livro = new Livros("Cássio", 29.65, "Cássio: a trajetória do maior goleiro da história do Corinthians");
        System.out.println(livro.puxaLivros());

        Eletronicos eletronico = new Eletronicos("Sony ", "videogame ", "psp ", 300);
        System.out.println(eletronico.puxaEletronico());
    }
}
