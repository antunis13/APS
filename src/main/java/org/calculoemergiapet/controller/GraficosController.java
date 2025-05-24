package org.calculoemergiapet.controller;


import javax.swing.*;
import java.awt.*;

import javafx.fxml.FXML;
import org.calculoemergiapet.util.SceneManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class GraficosController {
    public static void graficos(){
        DefaultCategoryDataset dados = new DefaultCategoryDataset();
        dados.addValue(5, "estudo1", "renovável, energia");
        dados.addValue(10, "estudo1", "renovável, gases atmosféricos");
        dados.addValue(15, "estudo1", "não renovável, recursos fósseis");
        dados.addValue(4, "estudo2", "renovável, energia");
        dados.addValue(11, "estudo2", "renovável, gases atmosféricos");
        dados.addValue(13, "estudo2", "não renovável, recursos fósseis");

        JFreeChart graficoBarra = ChartFactory.createBarChart(
                "Comparação dois estudos",
                "Simulações", "sej", dados);

        ChartPanel painelGraficoBarra = new ChartPanel(graficoBarra);

        JFrame telaGrafico = new JFrame();
        telaGrafico.setLayout(new GridLayout());

        DefaultPieDataset dadosPizza = new DefaultPieDataset();
        dadosPizza.setValue("renovável, energia", 5);
        dadosPizza.setValue("renovável, gases atmosféricos", 10);
        dadosPizza.setValue("não renovável, recursos fósseis", 15);

        JFreeChart graficoPizza = ChartFactory.createPieChart(
                "Comparação recursos", dadosPizza);

        ChartPanel painelGraficoPizza = new ChartPanel(graficoPizza);
        telaGrafico.getContentPane().add(painelGraficoPizza, BorderLayout.NORTH);

        telaGrafico.getContentPane().add(painelGraficoBarra, BorderLayout.CENTER);
        telaGrafico.pack();
        telaGrafico.setSize(500, 400);
        telaGrafico.setVisible(true);

    }
    @FXML
    private void mostrarGraficos() {
        graficos();
    }
    @FXML private void voltar(){ SceneManager.switchTo("/fxml/ConceitoView.fxml"); }
}
