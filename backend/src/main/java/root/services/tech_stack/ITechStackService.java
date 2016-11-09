package root.services.tech_stack;

import root.models.TechStack;

import java.util.List;

/**
 * Created by Neil Bharat Patel on 08/11/2016.
 */
public interface ITechStackService {
    List<TechStack> findAllTechStacks();
}
