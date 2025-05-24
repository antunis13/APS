package org.calculoemergiapet.controller;
import org.calculoemergiapet.util.SceneManager;
import javafx.fxml.FXML;

public class ConceitoController {
    @FXML
    private void irSimulacao(){
        SceneManager.switchTo("/fxml/SimulacaoView.fxml");
    }

    @FXML
    private void irRelatorios(){
        SceneManager.switchTo("/fxml/RelatoriosView.fxml");
    }

    @FXML private void irGraficos(){ SceneManager.switchTo("/fxml/GraficosView.fxml"); }

    @FXML
    private void irTutorial(){
        SceneManager.switchTo("/fxml/TutorialView.fxml");
    }

    @FXML
    private void irConfiguracao(){
        SceneManager.switchTo("/fxml/ConfiguracaoView.fxml");
    }
}
