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
        dados.addValue(3.45E20, "Sol", "Land Water Vapor");
        dados.addValue(1.95E21, "Sol", "Ocean Water Vapor");
        dados.addValue(1.88E20, "Sol", "Continents");
        dados.addValue(5.34E20, "Maré", "Land Water Vapor");
        dados.addValue(1.20E17, "Maré", "Ocean Water Vapor");


        JFreeChart graficoBarra = ChartFactory.createBarChart(
                "Energia Proveniente do Sol(Sun) e da Maré(Tide)",
                "Simulações", "Energia(J/ano)", dados);

        ChartPanel painelGraficoBarra = new ChartPanel(graficoBarra);

        JFrame telaGrafico = new JFrame();
        telaGrafico.setLayout(new GridLayout());

        DefaultPieDataset dadosPizza = new DefaultPieDataset();
        dadosPizza.setValue("Extração e Producão de Energia, PET MJ/kg", 83);
        dadosPizza.setValue( "Fabricação da Garrafa, PET MJ/kg", 20);
        dadosPizza.setValue( "Transporte e distribuição, PET MJ/ %",10 );
        dadosPizza.setValue( "Uso(refrigeração), PET MJ/L", 0.4);
        dadosPizza.setValue( "Reciclagem, PET MJ/Unidade", 0.6 );

        JFreeChart graficoPizza = ChartFactory.createPieChart(
                "Grafico do Fluxo Energético da Garrafa PET", dadosPizza);

        ChartPanel painelGraficoPizza = new ChartPanel(graficoPizza);
        telaGrafico.getContentPane().add(painelGraficoPizza, BorderLayout.NORTH);

        telaGrafico.getContentPane().add(painelGraficoBarra, BorderLayout.CENTER);
        telaGrafico.pack();
        telaGrafico.setSize(1000, 600);
        telaGrafico.setVisible(true);

    }
    @FXML
    private void mostrarGraficos() {
        graficos();
    }
    @FXML private void voltar(){ SceneManager.switchTo("/fxml/ConceitoView.fxml"); }
}
