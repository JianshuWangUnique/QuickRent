package quickRent.variableRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import quickRent.variable.Collection;

public interface CollectionRepository extends JpaRepository<Collection,Integer> {
}
