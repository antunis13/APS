package org.calculoemergiapet.model;
import java.util.ArrayList;
import java.util.List;

public class Simulacao {
    private double energiaUsada;
    private double transformidade;
    private double emergia;
    private final String fonte;

    private static final List<Simulacao> historico = new ArrayList<>();

    public Simulacao(double energiaUsada, double transformidade, String fonte) {
        this.energiaUsada = energiaUsada;
        this.transformidade = transformidade;
        this.fonte = fonte;
        this.emergia = calcularEmergia();

        historico.add(this);
    }

    public double calcularEmergia() {
        return emergia = energiaUsada * transformidade;
    }
    public double getEnergia() {
        return energiaUsada;
    }

    public double getTransformidade() {
        return transformidade;
    }

    public double getEmergia() {
        return emergia;
    }

    public String getFonte() {
        return fonte;
    }

    public static List<Simulacao> getHistorico() {
        return historico;
    }

}