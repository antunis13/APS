package org.calculoemergiapet.controller;

import javafx.fxml.FXML;import javafx.scene.web.WebView;import org.calculoemergiapet.util.SceneManager;
public class TutorialController{
    @FXML private WebView webViewTutorial;
    @FXML public void initialize(){ String html="<html style='color:white;background:#141e30;padding:16px;font-family:sans-serif'><h2>Como usar</h2><p>1. Faça login (qualquer).</p><p>2. Acesse Simulação e preencha R,N,F.</p><p>3. Clique em Calcular e veja os indicadores.</p><p>4. Consulte Relatórios.</p></html>";
        webViewTutorial.getEngine().loadContent(html);
    }
    @FXML private void voltar(){ SceneManager.switchTo("/fxml/ConceitoView.fxml"); }
}

