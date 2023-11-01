// Packages & imports
package visiotech.pokemon;
import java.util.ArrayList;

public class Pokedex_test {

    // Variables & constants
    private ArrayList<Pokemon> myPokemons;
    private ArrayList<Pokemon> registeredPokemons;
    private ArrayList<Movement> registeredMovements;


    // Constructors
    Pokedex_test() {
        myPokemons = new ArrayList<Pokemon>();
        registeredPokemons = new ArrayList<Pokemon>();
        registeredMovements = new ArrayList<Movement>();
    }


    // Getters
    public ArrayList<Pokemon> getMyPokemons() {
        return myPokemons;
    }
    public ArrayList<Pokemon> getRegisteredPokemons() {
        return registeredPokemons;
    }
    public ArrayList<Movement> getRegisteredMovements() {
        return registeredMovements;
    }


    // Setters
    public void setMyPokemons(ArrayList<Pokemon> myPokemons) {
        this.myPokemons = myPokemons;
    }
    public void setRegisteredPokemons(ArrayList<Pokemon> registeredPokemons) { this.registeredPokemons = registeredPokemons; }
    public void setRegisteredMovements(ArrayList<Movement> registeredMovements) { this.registeredMovements = registeredMovements; }

}
