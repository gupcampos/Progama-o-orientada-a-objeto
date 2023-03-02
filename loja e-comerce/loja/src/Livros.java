public class Livros extends Produtos {
    private String autor;

    public Livros(String autor, double preco, String nome) {
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
