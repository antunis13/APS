package org.calculoemergiapet;

import javafx.application.Application;
import javafx.stage.Stage;
import org.calculoemergiapet.util.SceneManager;

public class Main extends Application {
    @Override public void start(Stage stage) {
        SceneManager.init(stage);
        SceneManager.switchTo("/fxml/SimulacaoView.fxml");
    }
    public static void main(String[] args) { launch(args); }
}