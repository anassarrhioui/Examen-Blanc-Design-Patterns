package me.arrhioui.desin.traiter;

import me.arrhioui.figure.Figure;

import java.util.List;

public class TraiterImpl2 implements Itraiter {
    @Override
    public void traiter(List<Figure> figures) {
        System.out.println("Algorithm 2 for processing the design");
        System.out.println("figures.size() = " + figures.size());
    }
}
