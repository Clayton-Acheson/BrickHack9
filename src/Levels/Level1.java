/**
 * @(#)Level1.java
 * author: Christian Rockwell
 * This class is the first level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;
import Windows.Panel;


public class Level1 extends JPanel {

    private boolean levelComplete = false;
    private ImageIcon background;
    private JLabel backgroundLabel;

    private boolean levelFailed = false;
    private final int levelNumber = 1;
    private final int screenWidth = 1757;
    private final int screenHeight = 869;

    public JPanel createLevel1() {
        JPanel level1 = new JPanel();
        background = new ImageIcon(this.getClass().getResource("XP.jpg"));
        backgroundLabel = new JLabel(background);
        //backgroundLabel.setSize(Panel.);
        level1.add(backgroundLabel, BorderLayout.CENTER);
        level1.add(new JLabel("Level 1: Basic Reaction"), BorderLayout.NORTH);
        return level1;
    }

    public void levelComplete() {
        levelComplete = true;
    }

    public void levelFailed() {
        levelFailed = true;
    }
}
