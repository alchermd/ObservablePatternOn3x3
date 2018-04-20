package _3x3scoringapp;

public class Game implements Observer {
    private final int WINNING_SCORE = 21;
    Team homeTeam;
    Team awayTeam;
    
    public Game() {
        homeTeam = new Team("HOME");
        awayTeam = new Team("AWAY");
    }
    
    public void start() {
        // Let's put that shiny new design pattern to use!
        homeTeam.addObserver(this);
        awayTeam.addObserver(this);
        
        // This is where I bind UI elements.
    }


    @Override
    public void update(String name, int score, int fouls) {
        if (score >= WINNING_SCORE) {
            System.out.printf("%s wins with a score of %d\n", name, score);
        } else if (fouls >= 5) {
            System.out.printf("%s is in penalty with %d fouls\n", name, fouls);
        }
    }
    
    public void awayScoreInside() {
        awayTeam.scoreInside();
        // Update UI
    }
    
    public void awayScoreOutside() {
        awayTeam.scoreOutside();
        // Update UI
    }
    
    public void awayScoreFreeThrow() {
        awayTeam.scoreFreeThrow();
        // Update UI
    }
    
    public void homeScoreInside() {
        homeTeam.scoreInside();
        // Update UI
    }
    
    public void homeScoreOutside() {
        homeTeam.scoreOutside();
        // Update UI
    }
    
    public void homeScoreFreeThrow() {
        homeTeam.scoreFreeThrow();
        // Update UI
    }
    
    public void awayCommitFoul() {
        awayTeam.commitFoul();
    }
    
    public void homeCommitFoul() {
        homeTeam.commitFoul();
    }
}
