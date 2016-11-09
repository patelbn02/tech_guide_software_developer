package root.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import root.models.TechStack;
import root.services.tech_stack.ITechStackService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Neil Bharat Patel on 08/11/2016.
 */
@RestController
public class TechStackController {

    private final ITechStackService iTechStackService;

    @Inject
    public TechStackController(final ITechStackService newITechStackService) {
        iTechStackService = newITechStackService;
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET, value = "/tech_stacks/", produces = "application/json")
    public List<TechStack> getAllTechStacks() {
        return iTechStackService.findAllTechStacks();
    }

}
