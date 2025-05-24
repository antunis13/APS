package org.calculoemergiapet.controller;

import javafx.fxml.FXML;import javafx.scene.control.*;import org.calculoemergiapet.model.Simulacao;import org.calculoemergiapet.util.SceneManager;
public class SimulacaoController{
    @FXML private TextField rField,nField,fField; @FXML private Label lblY,lblRen,lblElr,lblEir,lblEyr,lblEsi,lblMsg;
    @FXML private void calcular(){ try{ Simulacao s=new Simulacao(Double.parseDouble(rField.getText()),Double.parseDouble(nField.getText()),Double.parseDouble(fField.getText())); lblY.setText("Y: "+s.y()); lblRen.setText("REN: "+String.format("%.2f",s.ren())+" %"); lblElr.setText("ELR: "+String.format("%.2f",s.elr())); lblEir.setText("EIR: "+String.format("%.2f",s.eir())); lblEyr.setText("EYR: "+String.format("%.2f",s.eyr())); lblEsi.setText("ESI: "+String.format("%.2e",s.esi())); lblMsg.setText(""); }catch(NumberFormatException e){lblMsg.setText("Somente números."); limpar();}}
    private void limpar(){ lblY.setText(""); lblRen.setText(""); lblElr.setText(""); lblEir.setText(""); lblEyr.setText(""); lblEsi.setText(""); }
    @FXML private void voltar(){ SceneManager.switchTo("/fxml/ConceitoView.fxml"); }
}

