import java.math.BigDecimal;

public class Gerente extends Funcionario {
    private String area;
    private BigDecimal bonus;

    public Gerente(String nome, int id, BigDecimal salario, String area, BigDecimal bonus) {
        super(nome, id, salario);
        this.area = area;
        this.bonus = bonus;
    }

    @Override
    public BigDecimal calcSalario(){
        return this.salario.add(bonus);
    }
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

}
