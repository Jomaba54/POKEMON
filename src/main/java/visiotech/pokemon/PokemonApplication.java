package visiotech.pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);
    }
//		attackTest();


//	public static int getRandom()
//	{
//		Random random = new Random();
//		return random.nextInt(85, 100);
//	}
//	public static double getDamage(Pokemon attacking, Movement movement, Pokemon defending)
//	{
//		int level = attacking.getLevel();
//		int power = movement.getMovementPower();
//		int rand = getRandom();
//		double attack = movement.isSpecial() ? attacking.getSpecialAttackPoints() : attacking.getAttackPoints();
//		double defense = movement.isSpecial() ? defending.getSpecialDefensePoints() : defending.getDefensePoints();
//		double effect = movement.getEffectiveness(defending.getType().getNumber());
//
//		return ((((2*level/5+2)*attack*power/defense)/50)*effect*rand/100);
//	}
//
//	public static void attackTest()
//	{
//		int rand = getRandom();
//
//		ArrayList<Movement> testMovementSet1 = new ArrayList<Movement>();
//		Movement testMovement1 = new Movement("testMovement1", 5, true, Type.ELECTRICO);
//		testMovementSet1.add(testMovement1);
//
//		Pokemon testPokemon1 = new Pokemon(1, "testPokemon1", Type.ELECTRICO, 20.0, 10.0,
//				10.0, 5.0, 5.0, 2.0, testMovementSet1);
//		Pokemon testPokemon2 = new Pokemon(1, "testPokemon2", Type.TIERRA, 20.0, 10.0,
//				10.0, 5.0, 5.0, 2.0, testMovementSet1);
//
//		double dps = getDamage(testPokemon1, testMovement1, testPokemon2);
//		System.out.println("Damage done: " + dps);
//	}
}
