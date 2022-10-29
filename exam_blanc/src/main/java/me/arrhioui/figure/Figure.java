package me.arrhioui.figure;

import me.arrhioui.observer.ParametrageObservable;

import java.io.Serializable;

public abstract class Figure implements Serializable {

    protected String couleurConteur = "Noir";
    protected String coulleurRemplissage = "Blanc";
    protected float epaisseur;

    public void afficher(){
        System.out.println("epaisseur = " + epaisseur);
        System.out.println("couleurConteur = " + couleurConteur);
        System.out.println("coulleurRemplissage = " + coulleurRemplissage);
    }
    abstract public float calculePerimetre();
    abstract public float calculeSurface();

    public void update(ParametrageObservable parametrageObservable){
        this.epaisseur = parametrageObservable.getEpaisseur();
        this.couleurConteur = parametrageObservable.getCouleurConteur();
        this.coulleurRemplissage = parametrageObservable.getCoulleurRemplissage();
    }
}
