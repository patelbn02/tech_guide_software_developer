package root.models;

import org.junit.Assert;
import org.junit.Test;

public class TechStackTests {
    @Test
    public void Test_SetId_SetObjectIdToOneAsAnInteger_WhenSetIdIsCalled() {
        // Arrange
        TechStack techStack = new TechStack();
        Integer expectedId = 1;

        // Act
        techStack.setId(1);

        // Arrange
        Assert.assertEquals(expectedId, techStack.getId());
    }

    @Test
    public void Test_GetId_ReturnsIdOfOneAsAnInteger_WhenGetIdIsCalled() {
        // Arrange
        TechStack techStack = new TechStack();
        Integer expectedId = 1;
        techStack.setId(1);

        // Act
        Integer actualId = techStack.getId();

        // Arrange
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void Test_SetTitle_SetObjectTitleToJavaAsAString_WhenSetTitleIsCalled() {
        // Arrange
        TechStack techStack = new TechStack();
        String expectedTitle = "Java";

        // Act
        techStack.setTitle("Java");

        // Arrange
        Assert.assertEquals(expectedTitle, techStack.getTitle());
    }

    @Test
    public void Test_GetTitle_ReturnsTitleOfJavaAsAString_WhenGetTitleIsCalled() {
        // Arrange
        TechStack techStack = new TechStack();
        String expectedTitle = "Java";
        techStack.setTitle("Java");

        // Act
        String actualTitle = techStack.getTitle();

        // Arrange
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
