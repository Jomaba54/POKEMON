// Packages & imports
package visiotech.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/movement")
public class MovementAPI {

    @Autowired
    private MovementRepository movementRepository;

    @GetMapping
    public List<Movement> getAllMovements() {
        return movementRepository.findAll();
    }

    @PostMapping
    public Movement addMovement(@RequestBody Movement movement) {
        return movementRepository.save(movement);
    }

    @GetMapping("/{id}")
    public Movement getMovementById(@PathVariable Long id) {
        return movementRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Movement updateMovement(@PathVariable Long id, @RequestBody Movement movement) {
        if (movementRepository.existsById(id)) {
            return movementRepository.save(movement);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteMovement(@PathVariable Long id) {
        movementRepository.deleteById(id);
    }

}

