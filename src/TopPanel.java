/**
 * TopPanel.java
 * This class is the top panel of the GUI. It contains a title text field.
 * @author Christian Rockwell
 */

import javax.swing.*;
import java.awt.*;

public class TopPanel {
    private final JPanel panel = new JPanel();

    public TopPanel() {
        panel.setLayout(new FlowLayout());
        JLabel title = new JLabel("Game Name Pending");
        panel.add(title);
    }

    public JPanel getPanel() {
        return panel;
    }
}
