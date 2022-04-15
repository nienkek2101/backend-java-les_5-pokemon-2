import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {
    private String name;
    private List<Pokemon> pokemons = new ArrayList<>();
    private FirePokemon charizard = new FirePokemon("Charizard", 76, 150, "firenougats", "GRRRRRRR");
    private WaterPokemon blastoise = new WaterPokemon("Blastoise", 80, 130, "pokeflakes", "Blaaaaaaaastooooooiiiiisss");
    private GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 135, "pokeleaves", "Veeeenasaur");
    private GrassPokemon ditto = new GrassPokemon("Ditto", 60, 140, "everyting", "Ditttooo ditttooo");
    private ElectricPokemon raichu = new ElectricPokemon("Raichu", 80, 160, "boerenkool", "Raichuuuuu");
    private WaterPokemon gyarados = new WaterPokemon("Gyarados", 90,180, "pokeflakes", "Gyaaaaaarrradoooooos");


    public PokemonTrainer(String name) { this.name = name; }


    // Getters
    public String getName() {
        return name;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public List<Pokemon> getPokemons() { return pokemons; }

    public void setPokemons(List<Pokemon> pokemons) { this.pokemons = pokemons; }



    // Methodes


}
