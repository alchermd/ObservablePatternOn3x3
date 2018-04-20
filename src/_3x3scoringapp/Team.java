package _3x3scoringapp;

import java.util.ArrayList;

public class Team implements Observable {
    private final int INSIDE_GOAL = 1;
    private final int OUTSIDE_GOAL = 2;
    private final int FREE_THROW = 1;
    
    private final ArrayList<Observer> subscribers = new ArrayList<>();
    
    private final String name;
    private int score = 0;
    private int fouls = 0;
    
    public Team(String name) {
        this.name = name;
    }
    
    
    @Override
    public void addObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : subscribers) {
            o.update(name, score, fouls);
        }
    }
    
    // The code below smells as well.
    // notifyObserver() is called 4 times.
    // Any way to clean this up?
    
    public void scoreInside() {
        score += INSIDE_GOAL;
        notifyObserver();
    }
    
    public void scoreOutside() {
        score += OUTSIDE_GOAL;
        notifyObserver();
    }
    
    public void scoreFreeThrow() {
        score += FREE_THROW;
        notifyObserver();
    }
    
    public void commitFoul() {
        fouls++;
        notifyObserver();
    }

}
