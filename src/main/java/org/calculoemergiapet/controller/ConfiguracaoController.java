package org.calculoemergiapet.controller;

import javafx.fxml.FXML;import javafx.scene.control.*;import org.calculoemergiapet.util.SceneManager;
public class ConfiguracaoController{
    @FXML private CheckBox darkModeCheck; @FXML private ComboBox<String> idiomaCombo; @FXML private Slider volumeSlider; @FXML private Label volumeValor;
    @FXML public void initialize(){ idiomaCombo.getItems().addAll("Português","Inglês","Espanhol"); idiomaCombo.setValue("Português"); volumeSlider.valueProperty().addListener((o,ov,nv)->volumeValor.setText("Volume: "+nv.intValue()+"%")); volumeValor.setText("Volume: "+(int)volumeSlider.getValue()+"%"); }
    @FXML private void voltar(){ SceneManager.switchTo("/fxml/ConceitoView.fxml"); }
}

