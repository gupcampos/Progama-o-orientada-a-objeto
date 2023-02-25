public class Livros extends Produtos {
    private String autor;

    public Livros(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
