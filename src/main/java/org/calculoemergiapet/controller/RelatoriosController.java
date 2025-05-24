package org.calculoemergiapet.controller;

import javafx.fxml.FXML;import javafx.scene.control.*;import org.calculoemergiapet.util.SceneManager;
public class RelatoriosController{
    @FXML private ListView<String> listRelatorios; @FXML private Label detalhesLbl;
    @FXML public void initialize(){ listRelatorios.getItems().addAll("Simulação 1 - R:10 N:20 F:30","Simulação 2 - R:15 N:10 F:25"); }
    @FXML private void mostrarDetalhes(){ String s=listRelatorios.getSelectionModel().getSelectedItem(); if(s!=null) detalhesLbl.setText("Detalhes (mock):\n"+s); }
    @FXML private void voltar(){ SceneManager.switchTo("/fxml/ConceitoView.fxml"); }
}

