package _3x3scoringapp;

/**
 * On hindsight, I think I should have made a 
 * "GameObserver" class that extends the classic 
 * Observer class. That way I don't explicitly 
 * pass the parameters on the update method on 
 * this Observer class.
 * 
 */
public interface Observer {
    public void update(String name, int score, int fouls);
}
