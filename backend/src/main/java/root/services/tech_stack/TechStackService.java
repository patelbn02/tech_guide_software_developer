package root.services.tech_stack;

import org.springframework.stereotype.Service;
import root.models.TechStack;
import root.repositories.ITechStackRepository;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Neil Bharat Patel on 08/11/2016.
 */
@Service
public class TechStackService implements ITechStackService{
    private ITechStackRepository iTechStackRepository;

    @Inject
    public TechStackService(ITechStackRepository newITechStackRepository) {
        iTechStackRepository = newITechStackRepository;
    }

    public List<TechStack> findAllTechStacks() {
        return iTechStackRepository.findAll();
    }
}
