package quickRent.variableRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import quickRent.variable.CardPossess;

public interface CardPossessRepository extends JpaRepository<CardPossess,Integer> {
}
