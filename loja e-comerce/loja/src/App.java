import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        Produtos produto = new Produtos();

        Livro livro = new Livro("Cássio", new BigDecimal(150), "Cássio: a trajetória do maior goleiro da história do Corinthians");
        System.out.println(livro.puxaLivros());

        Eletronico eletronico = new Eletronico("Sony ", "videogame ", "psp ", new BigDecimal(777));
        System.out.println(eletronico.puxaEletronico());
    }
}
