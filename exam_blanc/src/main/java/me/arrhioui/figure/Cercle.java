package me.arrhioui.figure;

import me.arrhioui.observer.ParametrageObservable;

public class Cercle extends Figure{
    private Point c;
    private float r;

    public Cercle(Point c, float r) {
        this.c = c;
        this.r = r;
    }

    @Override
    public void afficher() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("I'm a cercle, my center is "+ c+", and my radius is "+ r);
        super.afficher();
        System.out.println("------------------------------------------------------------------");
    }

    @Override
    public float calculePerimetre() {
        return (float) (2 * Math.PI * r);
    }

    @Override
    public float calculeSurface() {
        return (float) (Math.PI * Math.pow(r, 2));
    }

}
