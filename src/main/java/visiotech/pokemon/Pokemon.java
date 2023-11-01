// Packages & imports
package pokemon.visiotech;

import java.util.ArrayList;

public class Pokemon {

    // Constants & variables
    private int level;
    private String name;
    private Type type; // It isn't made final because it could be changed in future with evolution
    private double currentHP;
    private double totalHP;
    private double attackPoints;
    private double specialAttackPoints;
    private double defensePoints;
    private double specialDefensePoints;
    private double velocityPoints;
    private ArrayList<Movement> movements;

    private final int MAX_MOVEMENTS = 4;


    // Constructors
    Pokemon(int level, String name, Type type, double totalHP, double attackPoints, double specialAttackPoints, double defensePoints, double specialDefensePoints, double velocityPoints, ArrayList<Movement> movements)
    {
        this.level = level;
        this.name = name;
        this.type = type;
        this.currentHP = totalHP;
        this.totalHP = totalHP;
        this.attackPoints = attackPoints;
        this.specialAttackPoints = specialAttackPoints;
        this.defensePoints = defensePoints;
        this.specialDefensePoints = specialDefensePoints;
        this.velocityPoints = velocityPoints;
        this.movements = movements;
    }


    // Getters
    public int getLevel() {
        return level;
    }
    public String getName() {
        return name;
    }
    public Type getType() { return type; }
    public double getCurrentHP() {
        return currentHP;
    }
    public double getTotalHP() { return totalHP; }
    public double getAttackPoints() { return attackPoints; }
    public double getSpecialAttackPoints() { return specialAttackPoints; }
    public double getDefensePoints() { return defensePoints; }
    public double getSpecialDefensePoints() { return specialDefensePoints; }
    public double getVelocityPoints() { return velocityPoints; }
    public int getMaxMovements() {
        return MAX_MOVEMENTS;
    }
    public ArrayList<Movement> getMovements() { return movements; }


    // Setters (Some of them are implemented because in future could be changed with level up)
    public void setLevel(int level) {
        this.level = level;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(Type type) { this.type = type; }
    public void setCurrentHP(double currentHP) { this.currentHP = currentHP; }
    public void setTotalHP(double totalHP) {
        this.totalHP = totalHP;
    }
    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }
    public void setSpecialAttackPoints(double specialAttackPoints) {
        this.specialAttackPoints = specialAttackPoints;
    }
    public void setDefensePoints(double defensePoints) {
        this.defensePoints = defensePoints;
    }
    public void setSpecialDefensePoints(double specialDefensePoints) { this.specialDefensePoints = specialDefensePoints; }
    public void setVelocityPoints(double velocityPoints) {
        this.velocityPoints = velocityPoints;
    }
    public void setMovements(ArrayList<Movement> movements) {
        this.movements = movements;
    }

}
