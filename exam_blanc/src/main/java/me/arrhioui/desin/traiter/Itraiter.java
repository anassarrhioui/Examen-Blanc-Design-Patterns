package me.arrhioui.desin.traiter;


import me.arrhioui.figure.Figure;

import java.util.List;

@FunctionalInterface
public interface Itraiter {
    void traiter(List<Figure> figures);
}
