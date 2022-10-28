package me.arrhioui.observer;

import me.arrhioui.figure.Figure;

import java.util.ArrayList;
import java.util.List;

public class ParametrageObservable {

    private String couleurConteur;
    private String coulleurRemplissage;
    private float epaisseur;
    private List<Figure> figures = new ArrayList<>();

    public ParametrageObservable() {
        this.couleurConteur = "Noir";
        this.coulleurRemplissage = "Blanc";
        this.epaisseur = 1;
    }

    public void addFigure(Figure figure) {
        this.figures.add(figure);
    }

    public void removeFigure(Figure figure) {
        this.figures.remove(figure);
    }

    public void notifyFigure() {
        for (Figure figure : figures) {
            figure.update(this);
        }
    }

    public String getCouleurConteur() {
        return couleurConteur;
    }

    public void setCouleurConteur(String couleurConteur) {
        this.couleurConteur = couleurConteur;
        this.notifyFigure();
    }

    public String getCoulleurRemplissage() {
        return coulleurRemplissage;
    }

    public void setCoulleurRemplissage(String coulleurRemplissage) {
        this.coulleurRemplissage = coulleurRemplissage;
        this.notifyFigure();
    }

    public float getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(float epaisseur) {
        this.epaisseur = epaisseur;
        this.notifyFigure();
    }
}
