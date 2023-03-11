import java.math.BigDecimal;

public class FolhaDePagamento {
    private BigDecimal totalDaFolhaDePagamento;

    public BigDecimal getTotalDaFolhaDePagamento() {
        return totalDaFolhaDePagamento;
    }

    public void registrar(Presidente f) {
    totalDaFolhaDePagamento = totalDaFolhaDePagamento.add(f.calcSalario());
    }
    public void registrar(Engenheiro f) {
        totalDaFolhaDePagamento = totalDaFolhaDePagamento.add(f.calcSalario());
        }

        public void login (Autenticavel autenticado){
            autenticado.autenticar();
        }
    
}
