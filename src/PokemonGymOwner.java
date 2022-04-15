import java.util.Arrays;
import java.util.List;

public class PokemonGymOwner {
    private PokemonTrainer brock = new PokemonTrainer("Brock");
    private FirePokemon charizard = new FirePokemon("Charizard", 76, 150, "firenougats", "GRRRRRRR");
    private WaterPokemon blastoise = new WaterPokemon("Blastoise", 80, 130, "pokeflakes", "Blaaaaaaaastooooooiiiiisss");
    private GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 135, "pokeleaves", "Veeeenasaur");
    private GrassPokemon ditto = new GrassPokemon("Ditto", 60, 140, "everyting", "Ditttooo ditttooo");
    private ElectricPokemon raichu = new ElectricPokemon("Raichu", 80, 160, "boerenkool", "Raichuuuuu");
    private WaterPokemon gyarados = new WaterPokemon("Gyarados", 90,180, "pokeflakes", "Gyaaaaaarrradoooooos");

    public PokemonGymOwner() {
    }

    public PokemonTrainer getBrock() {
        return brock;
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

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }
}
