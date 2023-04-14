module br.edu.senac.concessionaria {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.senac.concessionaria to javafx.fxml;
    exports br.edu.senac.concessionaria;
}
