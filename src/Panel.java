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


        setSize(width, height - (height/20));
        setLocationRelativeTo(null);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setSize(width, height/2);

        JPanel cardPanel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);
        cardPanel.add(GUI.createButton("Card 1"), "Card 1");
        cardPanel.add(GUI.createButton("Card 2"), "Card 2");


        titlePanel.add(GUI.createLabel("Virus Fighter 19XX"), BorderLayout.CENTER);
        cardPanel.setBackground(Color.BLACK);
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
        add(cardPanel, BorderLayout.CENTER);
        add(levelPanel, BorderLayout.WEST);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Panel();
    }
}