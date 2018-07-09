package quickRent.variableRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import quickRent.variable.Collection;

import java.util.List;

public interface CollectionRepository extends JpaRepository<Collection,Integer> {

    public List<Collection> findByUser(Integer user);
}
