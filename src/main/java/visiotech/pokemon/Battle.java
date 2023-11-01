// Packages & imports
package visiotech.pokemon;

public class Battle {

    // Variables & constants
    private int turn;
    private Trainer player;
    private Trainer opponent;


    // Constructors
    Battle(Trainer player, Trainer opponent) {
        turn = 0;
        this.player = player;
        this.opponent = opponent;
    }


    // Getters
    public int getTurn() { return turn; }
    public Trainer getPlayer() {
        return player;
    }
    public Trainer getOpponent() {
        return opponent;
    }


    // Setters
    public void setTurn(int turn) { this.turn = turn; }

}
