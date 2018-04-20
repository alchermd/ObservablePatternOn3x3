package _3x3scoringapp;

public class Game implements Observer {
    private final int WINNING_SCORE = 21;
    Team homeTeam;
    Team awayTeam;
    
    public Game() {
        homeTeam = new Team("HOME");
        awayTeam = new Team("AWAY");
    }
    
    /**
     * Putting that shiny Observer pattern to use.
     * Should this be moved to the constructor?
     * 
     */
    public void start() {
        homeTeam.addObserver(this);
        awayTeam.addObserver(this);
        
        // This is also where I bind UI elements.
    }


    /**
     * With a proper GUI, this method hooks up with UI
     * elements and updates them on special events such
     * as a team going penalty or a team winning the match.
     * 
     * @param name
     * @param score
     * @param fouls 
     */
    @Override
    public void update(String name, int score, int fouls) {
        if (score >= WINNING_SCORE) {
            System.out.printf("%s wins with a score of %d\n", name, score);
        } else if (fouls >= 5) {
            System.out.printf("%s is in penalty with %d fouls\n", name, fouls);
        }
    }
    
    // The code below kinda smells coz of the repetition.
    // Any cleaner way to do this?
    
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
