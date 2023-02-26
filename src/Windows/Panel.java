/**
 * @(#)Panel.java
 * Creates the main panel for the game. This is the panel that will hold all the other panels
 * author: Christian Rockwell
 */

package Windows;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Levels.*;
import Windows.Temporary;
import Levels.*;

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
        cardPanel.add(GUI.createButton("swag"), "swag");
        cardPanel.add(new Temporary(), "XP.jpg");
        titlePanel.add(GUI.createLabel(" Virus Fighter 19XX"), BorderLayout.CENTER);
        titlePanel.setBackground(new Color(75, 97, 209));

        JButton levelButtons = new JButton("pass");

        System.out.println(width);
        System.out.println(height);

        levelButtons.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
                System.out.println(cardPanel.getSize());
                System.out.println(cardPanel.getHeight());
                System.out.println(cardPanel.getWidth());
            }
        });

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