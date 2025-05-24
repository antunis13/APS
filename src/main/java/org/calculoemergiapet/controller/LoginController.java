package org.calculoemergiapet.controller;

import javafx.fxml.FXML;import javafx.scene.control.*;import javafx.scene.input.KeyCode;import org.calculoemergiapet.util.SceneManager;
public class LoginController {
    @FXML private void handleLogin(){ SceneManager.switchTo("/fxml/ConceitoView.fxml"); }
}
