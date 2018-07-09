package quickRent.variableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quickRent.variableRepository.TagRepository;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;


}
