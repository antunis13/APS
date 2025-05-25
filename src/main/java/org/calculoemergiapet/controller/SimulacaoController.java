package org.calculoemergiapet.controller;

import javafx.fxml.FXML;import javafx.scene.control.*;import org.calculoemergiapet.model.Simulacao;import org.calculoemergiapet.util.SceneManager;
public class SimulacaoController{
    @FXML private ComboBox<String> comboBoxId;
    @FXML private TextField inputEnergia;
    @FXML private Label labelResultado;
    @FXML private TextField tField;

    @FXML
    public void initialize() {
        comboBoxId.setOnAction(event -> {
            String fonte = comboBoxId.getValue();

            switch (fonte) {
                case "Sol":
                    tField.setText("1e4");
                    break;
                case "Maré":
                    tField.setText("3e4");
                    break;
            }
        });
    }

    @FXML
    private void calcular() {
        try {
            String fonte = comboBoxId.getValue();
            double energiaUsada = Double.parseDouble(inputEnergia.getText());

            String transformidadeTexto = tField.getText().replace(",", "."); // garante formato correto
            double transformidade;


            if (transformidadeTexto != null && !transformidadeTexto.trim().isEmpty()) {
                transformidade = Double.parseDouble(transformidadeTexto);
            } else {

                switch (fonte) {
                    case "Sol":
                        transformidade = 1 * Math.pow(10, 4); // (1 * 10)^4
                        break;
                    case "Maré":
                        transformidade = 3 * Math.pow(10, 4); // (3 * 10)^4
                        break;
                    default:
                        labelResultado.setText("Fonte inválida.");
                        return;
                }
            }
            Simulacao simulacao = new Simulacao(energiaUsada, transformidade, fonte);
            double resultado = simulacao.calcularEmergia();

            String resultadoFormatado = String.format("Emergia = %,.0f seJ", resultado);
            labelResultado.setText(resultadoFormatado);

        } catch (NumberFormatException e) {
            labelResultado.setText("Digite valores numéricos válidos.");
        } catch (Exception e) {
            labelResultado.setText("Erro no cálculo.");
        }
    }





    @FXML private void limpar() {
        inputEnergia.clear();
        tField.clear();
        labelResultado.setText("");
    }

    @FXML private void voltar(){ SceneManager.switchTo("/fxml/ConceitoView.fxml"); }
}

