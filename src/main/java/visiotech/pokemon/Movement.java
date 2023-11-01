// Packages & imports
package visiotech.pokemon;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

@Entity
public class Movement {

    // Variables & constants
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int power;
    private Type type;
    private boolean special;
//    private final int uses;


    // Constructors
    public Movement(String name, int power, boolean special, Type type) {
        this.name = name;
        this.power = power;
        this.type = type;
        this.special = special;
    }
    public Movement() {

    }


    // Getters
    public int getMovementPower() {
        return power;
    }
    public String getMovementName() {
        return name;
    }
    public Type getType() {
        return type;
    }
    public boolean isSpecial() {
        return special;
    }

}
