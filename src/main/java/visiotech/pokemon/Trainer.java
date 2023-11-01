// Packages & imports
package pokemon.visiotech;
import java.util.ArrayList;

public class Trainer {

    // Variables & constants
    private String name;
    private ArrayList<Pokemon> equipedPokemons;
    private final Pokedex pokedex;


    // Constructors
    Trainer(String name) {
        this.name = name;
        equipedPokemons = new ArrayList<Pokemon>();
        pokedex = new Pokedex();
    }


    // Getters
    public String getName() { return name; }
    public ArrayList<Pokemon> getEquipedPokemons() {
        return equipedPokemons;
    }
    public Pokedex getPokedex() {
        return pokedex;
    }


    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setEquipedPokemons(ArrayList<Pokemon> equipedPokemons) {
        this.equipedPokemons = equipedPokemons;
    }

}
