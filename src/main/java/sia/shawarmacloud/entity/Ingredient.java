package sia.shawarmacloud.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
public class Ingredient {
    @Id
    private String id;
    private String name;
    private Type type;

    public enum Type {
        LAVASH, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
