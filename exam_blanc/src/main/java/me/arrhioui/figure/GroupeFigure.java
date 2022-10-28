package me.arrhioui.figure;

import java.util.ArrayList;
import java.util.List;

public class GroupeFigure extends Figure{

    private List<Figure> childFigures = new ArrayList<>();

    @Override
    public void afficher() {
        afficher(childFigures);
    }

    private void afficher(List<Figure> groupeFigure){
        for (Figure figure: groupeFigure) {
            if(figure instanceof  GroupeFigure)
                afficher(((GroupeFigure) figure).childFigures);
            else
                figure.afficher();
        }
    }

    @Override
    public float calculePerimetre() {
        return calculePerimetre(childFigures);
    }

    public float calculePerimetre(List<Figure> groupeFigure) {
        float perimetre = 0;
        for (Figure figure: groupeFigure) {
            if(figure instanceof  GroupeFigure)
                afficher(((GroupeFigure) figure).childFigures);
            else
                perimetre += figure.calculePerimetre();
        }
        return perimetre;
    }

    @Override
    public float calculeSurface() {
        return calculeSurface(childFigures);
    }

    public float calculeSurface(List<Figure> groupeFigure) {
        float surface = 0;
        for (Figure figure: groupeFigure) {
            if(figure instanceof  GroupeFigure)
                afficher(((GroupeFigure) figure).childFigures);
            else
                surface += figure.calculeSurface();
        }
        return surface;
    }

    public void addFigure(Figure figure){
        this.childFigures.add(figure);
    }

    public void removeFigure(Figure figure){
        this.childFigures.remove(figure);
    }


}
