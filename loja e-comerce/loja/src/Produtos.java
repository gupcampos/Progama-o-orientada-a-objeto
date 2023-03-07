import java.math.BigDecimal;

public class Produtos {
    protected String nome;
    protected BigDecimal preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

}
