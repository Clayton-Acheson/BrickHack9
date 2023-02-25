/**
 * @(#)Panel.java
 * author: Christian Rockwell
 */

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

public class Panel extends JFrame {
    private final Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    public int width = (int) screensize.getWidth(), height = (int) screensize.getHeight();

    public Panel() {
        super("Virus Fighter 199X");

<<<<<<< Updated upstream

        setSize(width, height - (height/20));
=======
    public Panel(int rows, int columns) {
        super("Game Name Pending");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
>>>>>>> Stashed changes
        setLocationRelativeTo(null);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setSize(width, height/2);

        JPanel adPanel = new JPanel();
        adPanel.setLayout(new CardLayout());
        /*adPanel.setLayout(new GridLayout(rows, (int) (columns*(.6))));
        for (int i = 0; i < rows*(.3); i++) {
            for (int j = 0; j < columns; j++) {
                adPanel.add(GUI.createButton("ad placeholder"));
            }
<<<<<<< Updated upstream
        } */

        titlePanel.add(GUI.createLabel("Virus Fighter 19XX"), BorderLayout.CENTER);
=======
        }
>>>>>>> Stashed changes
        adPanel.setBackground(Color.BLACK);
        titlePanel.setBackground(Color.GRAY);

        JPanel levelPanel = new JPanel();
        levelPanel.setLayout(new GridLayout(11, 1));
        JTextField[] levelFields = new JTextField[10];
        levelPanel.add(GUI.createLabel("Levels: "));
        for (int i = 0; i < 10; i++) {
            levelFields[i] = GUI.createTextField(String.valueOf((i + 1)));
            levelFields[i].setEditable(false);
            levelPanel.add(levelFields[i]);
        }

        add(titlePanel, BorderLayout.NORTH);
        add(adPanel, BorderLayout.CENTER);
        add(levelPanel, BorderLayout.WEST);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Panel();
    }
}