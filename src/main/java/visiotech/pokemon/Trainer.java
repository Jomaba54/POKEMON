// Packages & imports
package visiotech.pokemon;


public class Trainer extends PokemonAPI {

    // Variables & constants
    private String name;


    // Constructors
    private Trainer(String name) {
        this.name = name;
    }


    // Getters
    public String getName() { return name; }


    // Setters
    public void setName(String name) {
        this.name = name;
    }

}
