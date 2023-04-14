package br.edu.senac.concessionaria;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField textMarca;
    @FXML TextField textAno;
    @FXML TextField textPreco;
    @FXML TextArea lista;


    public void cadastrar(){
        System.out.println(textMarca.getText());
    }
}
