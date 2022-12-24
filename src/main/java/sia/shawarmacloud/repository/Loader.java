package sia.shawarmacloud.repository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sia.shawarmacloud.entity.Ingredient;

import static sia.shawarmacloud.entity.Ingredient.Type;

@Component
public class Loader {

    @Bean
    public ApplicationRunner dataLoader(IngredientRepository repo) {
        return args -> {
            repo.save( new Ingredient("CLSH", "Cheese Lavash", Type.LAVASH));
            repo.save( new Ingredient("ULSH", "Lavash",  Type.LAVASH));
            repo.save(  new Ingredient("GRBF", "Ground Beef",  Type.PROTEIN));
            repo.save(  new Ingredient("LAMB", "Lamb Meet",  Type.PROTEIN));
            repo.save(  new Ingredient("CCMR", "Cucumber",  Type.VEGGIES));
            repo.save(  new Ingredient("TMTS", "Tomatoes",  Type.VEGGIES));
            repo.save(  new Ingredient("LETC", "Lettuce",  Type.VEGGIES));
            repo.save(  new Ingredient("CHED", "Cheddar",  Type.CHEESE));
            repo.save(  new Ingredient("ADYG", "Adyghe Cheese",  Type.CHEESE));
            repo.save(  new Ingredient("MYNS", "Mayonnaise",  Type.SAUCE));
            repo.save(  new Ingredient("HCHL", "Hot Chili Sauce",  Type.SAUCE));
        };
    }
}
