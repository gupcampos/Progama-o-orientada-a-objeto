import java.math.BigDecimal;

public class Engenheiro extends Funcionario {
    private String departamento;
    private int crea;

    public Engenheiro(String nome, int id, BigDecimal salario, String departamento, int crea) {
        super(nome, id, salario);
        this.departamento = departamento;
        this.crea = crea;
    }

    @Override
    public BigDecimal calcSalario(){
        return this.salario.multiply(new BigDecimal(1.5));
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCrea() {
        return crea;
    }

    public void setCrea(int crea) {
        this.crea = crea;
    }

}
