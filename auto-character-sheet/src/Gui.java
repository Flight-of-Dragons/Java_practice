import javax.swing.*;

/**
 * Created by jeremybarrass on 28/03/2017.
 */
public class Gui {
    private JTextArea name;

    public void DisplaySheet() {
        name = new JTextArea(6, 20);
    }

    public void SetName(String _name) {
        this.name.setText(_name);
    }

    public String ViewName() {
        return this.name.getText();
    }
}
