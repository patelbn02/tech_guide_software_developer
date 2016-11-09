package root.test_data;

import root.models.TechStack;

import java.util.List;

public class TestData {
    public TechStack PreSetTechStack() {
        TechStack techStack = new TechStack();
        techStack.setId(1);
        techStack.setTitle("Java");
        return techStack;
    }

}
