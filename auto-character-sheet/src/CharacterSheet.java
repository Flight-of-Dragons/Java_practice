public class CharacterSheet {

    private String characterName;
    private int Strength;

    public CharacterSheet(String name) {
        setCharacterName(name);
    }

    public void setCharacterName(String name) {
        this.characterName = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getStrength() { return Strength; }

    public void setStrength(int str) { this.Strength = str; }
}
