package org.calculoemergiapet.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import org.calculoemergiapet.model.Simulacao;
import org.calculoemergiapet.util.SceneManager;

import java.util.List;

public class RelatoriosController {

    @FXML
    private ListView<String> listRelatorios;

    @FXML
    public void initialize() {
        carregarRelatorios();
    }

    private void carregarRelatorios() {
        List<Simulacao> historico = Simulacao.getHistorico();

        if (historico.isEmpty()) {
            listRelatorios.getItems().add("Nenhuma simulação foi realizada ainda.");
            return;
        }

        for (Simulacao s : historico) {
            String relatorio = String.format(
                    "Fonte: %s\nEnergia usada: %.2f J\nTransformidade: %.2f seJ/J\nEmergia: %.2f seJ\n-------------------------------",
                    s.getFonte(),
                    s.getEnergia(),
                    s.getTransformidade(),
                    s.getEmergia()
            );
            listRelatorios.getItems().add(relatorio);
        }
    }


    @FXML private void voltar(){ SceneManager.switchTo("/fxml/ConceitoView.fxml"); }
}





