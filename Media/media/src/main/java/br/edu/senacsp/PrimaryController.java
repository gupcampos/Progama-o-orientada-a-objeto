package br.edu.senacsp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    private TextField textNota1;
    @FXML
    private TextField textNota2;
    @FXML
    private Label labelResultado;
    

    public void calcular(){
        double nota1 = Double.valueOf(textNota1.getText());
        System.out.println(nota1);
        double nota2 = Double.valueOf(textNota2.getText());
        System.out.println(nota2);
        double media = (nota1 + nota2)/2;
        labelResultado.setText("Media: "+ media);
    }
}
