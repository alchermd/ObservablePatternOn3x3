package _3x3scoringapp;

public class _3x3ScoringApp {

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        
        // For demonstration purposes only.
        // With a UI to work with, these methods
        // are bound to UI events.
        
        for (int i = 0; i < 5; i++) {
            game.awayCommitFoul();
        }
        
        for (int i = 0; i < 21; i++) {
            game.homeScoreInside();
        }
        
    }
    
}
