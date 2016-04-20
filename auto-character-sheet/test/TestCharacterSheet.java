import org.junit.Test;
import static org.junit.Assert.*;

public class TestCharacterSheet {
	String name = "Manetherin";
	CharacterSheet manny = new CharacterSheet(name);

	@Test
	public void testCharacterName() {
		System.out.print("Character's name stored: ");
		assertEquals(manny.characterName, name);
	}
}