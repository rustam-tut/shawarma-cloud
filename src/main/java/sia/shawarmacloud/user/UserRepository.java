package sia.shawarmacloud.user;

import org.springframework.data.repository.CrudRepository;
import sia.shawarmacloud.user.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
