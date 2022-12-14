package me.arrhioui.desin;

import me.arrhioui.desin.traiter.Itraiter;
import me.arrhioui.desin.traiter.TraiterImpl1;
import me.arrhioui.figure.Figure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Desin implements Serializable {

    private List<Figure> figures = new ArrayList<>();

    private Itraiter itraiter = new TraiterImpl1();

    public Itraiter getItraiter() {
        return itraiter;
    }

    public void setItraiter(Itraiter itraiter) {
        this.itraiter = itraiter;
    }


    public void traiter(){
        this.itraiter.traiter(this.figures);
    }

    public void addFigure(Figure figure){
        this.figures.add(figure);
    }

    public void removeFigure(Figure figure){
        this.figures.remove(figure);
    }

    public void serialiser(String filePath) throws IOException {
        try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);){
                objectOutputStream.writeObject(this.figures);
            }
        }
    }
}
