/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.control;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author 01714922260
 */
public class CalculadoraController implements Initializable {

    @FXML
    private TableView<?> tableHistorico;
    @FXML
    private TextField txtNum1;
    @FXML
    private TextField txtNum2;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btnAdicao;
    @FXML
    private Button btnSubtracao;
    @FXML
    private Button btnDivisao;
    @FXML
    private Button btnMultiplicacao;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    
    @FXML
    private void Adicao(ActionEvent event) {
       Double num1 = Double.parseDouble(txtNum1.getText()); 
       Double num2 = Double.parseDouble(txtNum1.getText()); 
       Double result = num1 + num2; 
       txtResultado.setText(result.toString());
       
    }
    
    @FXML
    private void Subtracao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNum1.getText()); 
        Double num2 = Double.parseDouble(txtNum1.getText()); 
        Double result = num1 - num2;
        txtResultado.setText(result.toString());

    }

    @FXML
    private void Divisao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNum1.getText()); 
        Double num2 = Double.parseDouble(txtNum1.getText()); 
        Double result = num1 / num2;
        txtResultado.setText(result.toString());

    }

    @FXML
    private void Multiplicacao(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNum1.getText()); 
        Double num2 = Double.parseDouble(txtNum1.getText()); 
        Double result = num1 * num2;
        txtResultado.setText(result.toString());
       
    }

     
    
}
