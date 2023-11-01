// Packages & imports
package pokemon.visiotech;

public class Pokedex {

    // Variables & constants
    private Pokemon [] myPokemons;
    private Pokemon [] registeredPokemons;
    private Movement [] registeredMovements;


    // Constructors
    Pokedex() {
        registeredPokemons = new Pokemon[0];
        registeredMovements = new Movement[0];
        myPokemons = new Pokemon[0];
    }


    // Getters
    public Pokemon[] getMyPokemons() {
        return myPokemons;
    }
    public Pokemon[] getRegisteredPokemons() {
        return registeredPokemons;
    }
    public Movement[] getRegisteredMovements() {
        return registeredMovements;
    }


    // Setters
    public void setMyPokemons(Pokemon[] myPokemons) {
        this.myPokemons = myPokemons;
    }
    public void setRegisteredPokemons(Pokemon[] registeredPokemons) {
        this.registeredPokemons = registeredPokemons;
    }
    public void setRegisteredMovements(Movement[] registeredMovements) {
        this.registeredMovements = registeredMovements;
    }

}
