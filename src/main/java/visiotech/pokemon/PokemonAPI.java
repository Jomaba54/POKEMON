// Packages & imports
package visiotech.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/pokemon")
public class PokemonAPI {

    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping
    public List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }

    @PostMapping
    public Pokemon addPokemon(@RequestBody Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @GetMapping("/{id}")
    public Pokemon getPokemonById(@PathVariable Long id) {
        return pokemonRepository.findById(id).orElse(null);
    }
    @PutMapping("/{id}")
    public Pokemon updatePokemon(@PathVariable Long id, @RequestBody Pokemon pokemon) {
        if (pokemonRepository.existsById(id)) {
            return pokemonRepository.save(pokemon);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePokemon(@PathVariable Long id) {
        pokemonRepository.deleteById(id);
    }

}
