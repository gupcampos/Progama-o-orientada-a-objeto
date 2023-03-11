import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        var engenheiro = new Engenheiro("jorginho", 60, new BigDecimal(50000.30), "Tecnoliga", 0000);
        System.out.println(engenheiro.calcSalario());
        
        var gerente = new Gerente("Limas", 50, new BigDecimal(6000), "area dos 3 estados", new BigDecimal(100));
        System.out.println(gerente.calcSalario());

        var presidente = new Presidente("bolsonaro", 13, new BigDecimal(2222222), new BigDecimal(171717));
        System.out.println(presidente.calcSalario());

        var folhaDePagamento = new FolhaDePagamento();
        folhaDePagamento.registrar(presidente);
        folhaDePagamento.registrar(engenheiro);
        System.out.println(folhaDePagamento.getTotalDaFolhaDePagamento());
    }
}
