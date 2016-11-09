package root.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import root.models.TechStack;

/**
 * Created by Neil Bharat Patel on 08/11/2016.
 */
public interface ITechStackRepository extends JpaRepository<TechStack, Integer> {

}
