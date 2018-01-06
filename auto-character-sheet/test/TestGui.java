/**
 * Created by jeremybarrass on 10/11/2016.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestGui {
    String testName = "Manny";
    Gui sheet = new Gui();
    sheet.DisplaySheet();

    sheet.SetName(testName);

    @Test
    public void test_That_It_Displays_The_Character_Name() {
        assertEquals(sheet.name.getText(), testName);
    }
}
