package quickRent.variableController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import quickRent.variableRepository.CardPossessRepository;
import quickRent.variable.CardPossess;

@RestController
public class CardPossessController {

    @Autowired
    private CardPossessRepository cardPossessRepository;

}
