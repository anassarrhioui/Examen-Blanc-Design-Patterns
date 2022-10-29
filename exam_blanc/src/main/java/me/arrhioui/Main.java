package me.arrhioui;

import me.arrhioui.desin.Desin;
import me.arrhioui.desin.traiter.Itraiter;
import me.arrhioui.desin.traiter.TraiterImpl1;
import me.arrhioui.desin.traiter.TraiterImpl2;
import me.arrhioui.figure.*;
import me.arrhioui.observer.ParametrageObservable;

import java.io.IOException;

public class Main {

    public static Itraiter algo1 = new TraiterImpl1();
    public static Itraiter algo2 = new TraiterImpl2();
    public static void main(String[] args) throws IOException {
        ParametrageObservable parametrage = new ParametrageObservable();
        Desin desin = new Desin();

        Figure cercle = new Cercle(new Point(), 10);
        cercle.afficher();


        Figure rectangle = new Rectangle(new Point(), 10, 10);
        rectangle.afficher();

        Figure groupe = new GroupeFigure();
        Figure rectangle2 = new Rectangle(new Point(), 20, 10);
        Figure rectangle3 = new Rectangle(new Point(), 30, 10);

        Figure groupe2 = new GroupeFigure();
        Figure rectangle22 = new Rectangle(new Point(), 20, 10);
        Figure rectangle33 = new Rectangle(new Point(), 30, 10);
        ((GroupeFigure)groupe2).addFigure(rectangle22);
        ((GroupeFigure)groupe2).addFigure(rectangle33);

        ((GroupeFigure)groupe).addFigure(rectangle2);
        ((GroupeFigure)groupe).addFigure(rectangle3);
        ((GroupeFigure)groupe).addFigure(groupe2);

        groupe.afficher();
        System.out.println("Per"+groupe2.calculePerimetre());

        parametrage.addFigure(cercle);
        parametrage.addFigure(rectangle);

        parametrage.setCouleurConteur("Rose");

        desin.addFigure(cercle);
        desin.addFigure(rectangle);
        desin.addFigure(groupe);
        desin.addFigure(groupe2);
        desin.traiter();
        desin.setItraiter(algo2);
        desin.traiter();

        cercle.afficher();
        rectangle.afficher();

        desin.serialiser("ser.dat");
    }
}