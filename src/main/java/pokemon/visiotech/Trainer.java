// Packages & imports
package pokemon.visiotech;

public class Trainer {

    // Variables & constants
    private String name;
    private Pokemon [] equipedPokemons;
    private final Pokedex pokedex;


    // Constructors
    Trainer(String name) {
        this.name = name;
        equipedPokemons = new Pokemon[0];
        pokedex = new Pokedex();
    }


    // Getters
    public String getName() { return name; }
    public Pokemon[] getEquipedPokemons() {
        return equipedPokemons;
    }
    public Pokedex getPokedex() {
        return pokedex;
    }


    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setEquipedPokemons(Pokemon[] equipedPokemons) {
        this.equipedPokemons = equipedPokemons;
    }

}
