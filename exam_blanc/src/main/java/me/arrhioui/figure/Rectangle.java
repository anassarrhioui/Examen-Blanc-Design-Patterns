package me.arrhioui.figure;

import me.arrhioui.observer.ParametrageObservable;

public class Rectangle extends Figure{
    private Point coin;
    private float h;
    private float l;

    public Rectangle(Point coin, float h, float l) {
        this.coin = coin;
        this.h = h;
        this.l = l;
    }

    @Override
    public void afficher() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("I'm a rectangle, my edge is +"+coin+ ", height " + h + " and my width is " + l);
        super.afficher();
        System.out.println("------------------------------------------------------------------");
    }

    @Override
    public float calculePerimetre() {
        return 2*(h+l);
    }

    @Override
    public float calculeSurface() {
        return l*h;
    }


}
