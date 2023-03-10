import java.math.BigDecimal;

abstract class Funcionario {
    protected String nome;
    protected int Id;
    protected BigDecimal salario;

    public Funcionario(String nome, int id, BigDecimal salario) {
        this.nome = nome;
        Id = id;
        this.salario = salario;
    }

    public abstract BigDecimal calcSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

}
