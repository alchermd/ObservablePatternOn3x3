package _3x3scoringapp;

import java.util.ArrayList;

/**
 *
 * @author alchermd
 */
public interface Observable {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
