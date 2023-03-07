import java.math.BigDecimal;

public class Livro extends Produtos {
    private String autor;

    public Livro(String autor, BigDecimal preco, String nome) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String puxaLivros() {
        return ("nome do livro: " + nome + "preço" + preco + "autor: " + autor);

    }
}
