package root.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import root.models.TechStack;
import root.services.tech_stack.ITechStackService;
import root.test_data.TestData;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TechStackControllerTests {
    @Mock
    private ITechStackService iTechStackService;

    private TechStackController techStackController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        techStackController = new TechStackController(iTechStackService);
    }

    private TechStack PreSetTechStack() {
        TestData testData = new TestData();
        TechStack techStack = testData.PreSetTechStack();
        return techStack;
    }

    private List<TechStack> StubServiceToReturnListOfTechStacksOnFindAllTechStacks() {
        List<TechStack> techStackList = new ArrayList<TechStack>();
        TechStack techStack = PreSetTechStack();
        techStackList.add(techStack);
        when(iTechStackService.findAllTechStacks()).thenReturn(techStackList);
        return techStackList;
    }

    @Test
    public void test_GetAllTechStacks_ReturnsListOfAllTechStacks_WhenGetAllTechStackIsCalled() {
        // Arrange
        final List<TechStack> savedTechStacks = StubServiceToReturnListOfTechStacksOnFindAllTechStacks();

        // Act
        final List<TechStack> returnedTechStacks = techStackController.getAllTechStacks();

        // Assert
        assertEquals(savedTechStacks, returnedTechStacks);
    }

    @Test
    public void test_GetAllTechStacks_CallsTheITechStackService_WhenGetAllTechStacksIsCalled() {
        // Arrange
        final List<TechStack> savedTechStacks = StubServiceToReturnListOfTechStacksOnFindAllTechStacks();

        // Act
        final List<TechStack> returnedTechStacks = techStackController.getAllTechStacks();

        // Assert
        verify(iTechStackService, times(1)).findAllTechStacks();
    }
}