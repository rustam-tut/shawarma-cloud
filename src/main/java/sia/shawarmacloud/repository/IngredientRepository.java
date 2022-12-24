package sia.shawarmacloud.repository;

import org.springframework.data.repository.CrudRepository;
import sia.shawarmacloud.entity.Ingredient;


public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
