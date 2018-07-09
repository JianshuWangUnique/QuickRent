package quickRent.variableRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import quickRent.variable.Tag;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag,Integer> {
    public List<Tag> findByRoom(Integer room);
}
