import java.math.BigDecimal;

public class Presidente extends Funcionario {
    private BigDecimal cota;

    public Presidente(String nome, int id, BigDecimal salario, BigDecimal cota) {
        super(nome, id, salario);
        this.cota = cota;
    }

    @Override
    public BigDecimal calcSalario(){
        return this.salario.add(cota);
    }

    public BigDecimal getCota() {
        return cota;
    }

    public void setCota(BigDecimal cota) {
        this.cota = cota;
    }
    
}
