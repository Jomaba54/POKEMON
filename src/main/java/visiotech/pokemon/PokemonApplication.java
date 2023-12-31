package visiotech.pokemon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Random;

@SpringBootApplication
public class PokemonApplication {

    double[][] effectiveness = {
            {0.5, 0.5, 1, 1, 0.5, 1, 0.5, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1},
            {1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 1, 1},
            {0.5, 1, 1, 1, 1, 0.5, 0.5, 0.5, 1, 0.5, 1, 2, 2, 1, 2, 1, 0.5, 0.,5},
            {0.5, 1, 1, 2, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 0, 1, 2},
            {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0, 1, 2, 1, 0.5, 1, 1, 1},
            {2, 0.5, 2, 0.5, 1, 1, 0.5, 1, 2, 1, 1, 2, 1, 0.5, 1, 1, 1, 1},
            {0.5, 1, 1, 2, 1, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 2, 1, 0.5, 1},
            {0.5, 0.5, 1, 2, 1, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 2, 1, 2},
            {2, 1, 0.5, 1, 1, 0, 1, 0.5, 2, 1, 2, 1, 0.5, 2, 2, 1, 0.5, 0.5},
            {0.5, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1},
            {0.5, 2, 0.5, 0.5, 1, 1, 0.5, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 0.5, 0.5},
            {0.5, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1, 0, 1, 2, 1},
            {0.5, 1, 2, 1, 1, 1, 2, 1, 2, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 2},
            {1, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 0.5, 1, 1, 1},
            {2, 1, 0.5, 1, 2, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 2, 0},
            {0, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 1},
            {0.5, 1, 2, 1, 0.5, 1, 1, 1, 1, 2, 1, 2, 1, 0.5, 1, 1, 1, 1}
    };

    ArrayList<Movement> testMovementSet1 = new ArrayList<Movement>();
    ArrayList<Movement> testMovementSet2 = new ArrayList<Movement>();
    Movement testMovement1 = new Movement("Thunderbolt", 90, true, Type.ELECTRICO);
    Movement testMovement2 = new Movement("Accelerock", 40, false, Type.ROCA);
    Movement testMovement3 = new Movement("Armor Cannon", 120, true, Type.FUEGO);
    Movement testMovement4 = new Movement("Bug Bite", 60, false, Type.BICHO);


    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(PokemonAPI pokedex, MovementAPI movedex) {
        return (args) -> {
            testMovementSet1.add(testMovement1);
            testMovementSet1.add(testMovement2);
            testMovementSet2.add(testMovement3);
            testMovementSet2.add(testMovement4);

            Pokemon testPokemon1 = new Pokemon(20, "Pikachu", Type.ELECTRICO, 35.0, 55.0,
                    50.0, 40.0, 50.0, 90.0, testMovementSet1, testMovementSet1);
            Pokemon testPokemon2 = new Pokemon(55, "Dragonite", Type.DRAGON, 91.0, 134.0,
                    100.0, 95.0, 100.0, 80.0, testMovementSet2, testMovementSet2);

            attackTest(testPokemon1, testPokemon2);

//            insertDefaultPokemons(pokedex, testPokemon1, testPokemon2);
//            insertDefaultMovements(movedex);

            System.out.println(pokedex.getAllPokemons());
            System.out.println(movedex.getAllMovements());
        };
    }

    public void attackTest(Pokemon pokemon1, Pokemon pokemon2)
    {
        int rand = getRandom();

        double dps = getDamage(pokemon1, testMovement1, pokemon2);
        System.out.println("Damage done: " + dps);
    }

    public void insertDefaultPokemons(PokemonAPI pokedex, Pokemon pokemon1, Pokemon pokemon2) {
        pokedex.addPokemon(pokemon1);
        pokedex.addPokemon(pokemon2);
    }

    public void insertDefaultMovements(MovementAPI movedex) {
        movedex.addMovement(testMovement1);
        movedex.addMovement(testMovement2);
        movedex.addMovement(testMovement3);
        movedex.addMovement(testMovement4);
    }


    public int getRandom()
    {
        Random random = new Random();
        return random.nextInt(85, 100);
    }

    public double getEffectiveness(int x, int y) {
        return effectiveness[x][y];
    }

	public double getDamage(Pokemon attacking, Movement movement, Pokemon defending)
	{
		int level = attacking.getLevel();
		int power = movement.getMovementPower();
		int rand = getRandom();
		double attack = movement.isSpecial() ? attacking.getSpecialAttackPoints() : attacking.getAttackPoints();
		double defense = movement.isSpecial() ? defending.getSpecialDefensePoints() : defending.getDefensePoints();
		double effect = getEffectiveness(attacking.getType().getNumber(), defending.getType().getNumber());

		return ((((2*level/5+2)*attack*power/defense)/50)*effect*rand/100);
	}

}
