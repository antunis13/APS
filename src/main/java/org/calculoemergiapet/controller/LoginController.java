package org.calculoemergiapet.controller;

import javafx.fxml.FXML;
import org.calculoemergiapet.util.SceneManager;
public class LoginController {
    @FXML private void handleLogin(){ SceneManager.switchTo("/fxml/ConceitoView.fxml"); }
}
