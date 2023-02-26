/**
 * @(#)Panel.java
 * Creates the main panel for the game. This is the panel that will hold all the other panels
 * author: Christian Rockwell
 */

package Windows;

import Levels.*;
import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JButton levelButtons = new JButton("pass");
        levelButtons.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        cardPanel.add(new TitleScreen());
        cardPanel.add(new Level1());
        cardPanel.add(new Level2());
        cardPanel.add(new Level3());
        cardPanel.add(new Level4());
        cardPanel.add(new Level5());
        cardPanel.add(new Level6());
        cardPanel.add(new Level7());
        cardPanel.add(new Level8());
        cardPanel.add(new Level9());
        cardPanel.add(new Level10());


        titlePanel.add(GUI.createLabel(" Virus Fighter 19XX"), BorderLayout.CENTER);
        titlePanel.setBackground(new Color(75, 97, 209));

        System.out.println(width);
        System.out.println(height);

        titlePanel.add(levelButtons, BorderLayout.SOUTH);




        JPanel levelPanel = new JPanel();
        levelPanel.setBackground(new Color(75, 97, 209));
        levelPanel.setLayout(new GridLayout(11, 1));
        JTextField[] levelFields = new JTextField[10];
        levelPanel.add(GUI.createLevelLabel("   Levels: "));
        for (int i = 0; i < 10; i++) {
            levelFields[i] = GUI.createTextField("                                         " + String.valueOf((i + 1)));
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