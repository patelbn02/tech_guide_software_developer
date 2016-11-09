package root.services.tech_stack;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import root.models.TechStack;
import root.repositories.ITechStackRepository;
import root.test_data.TestData;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TeckStackServiceTests {

    @Mock
    private ITechStackRepository iTechStackRepository;

    private ITechStackService iTechStackService;

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        iTechStackService = new TechStackService(iTechStackRepository);
    }

    private TechStack PreSetTachStack() {
        TestData testData = new TestData();
        TechStack techStack = testData.PreSetTechStack();
        return techStack;
    }

    private List<TechStack> StubRepositoryToReturnListOfTechStacksOnFindAll() {
        List<TechStack> techStackList = new ArrayList<>();
        TechStack techStack = PreSetTachStack();
        techStackList.add(techStack);
        when(iTechStackRepository.findAll()).thenReturn(techStackList);
        return techStackList;
    }

    @Test
    public void Test_FindAllTechStacks_ReturnsListOfAllTechStacks_WhenFindAllTechStacksIsCalled() {
        // Arrange
        final List<TechStack> savedTecbStacks = StubRepositoryToReturnListOfTechStacksOnFindAll();

        // Act
        final List<TechStack> returnedTechStacks = iTechStackService.findAllTechStacks();

        // Assert
        assertEquals(savedTecbStacks, returnedTechStacks);
    }

    @Test
    public void test_FindAllTechStacks_CallsTheITechStackRepository_WhenFindAllTechStacksIsCalled() {
        // Arrange
        final List<TechStack> savedTeckStacks = StubRepositoryToReturnListOfTechStacksOnFindAll();

        // Act
        final List<TechStack> returnedTechStacks = iTechStackService.findAllTechStacks();

        // Assert
        verify(iTechStackRepository, times(1)).findAll();
    }
}