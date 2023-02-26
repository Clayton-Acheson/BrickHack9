/**
 * @(#)Level10.java
 * author: Christian Rockwell
 * This class is the tenth level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;

public class Level10 {
    private boolean levelComplete = false;
    private boolean levelFailed = false;
    private final int levelNumber = 10;
    private final int screenWidth = 1757;
    private final int screenHeight = 869;

    public JPanel createLevel10() {
        JPanel level10 = new JPanel();
        level10.add(new JLabel("Level 10: Basic Reaction"), BorderLayout.NORTH);
        level10.add(new JLabel(""), BorderLayout.CENTER);
        return level10;
    }

    public void levelComplete() {
        levelComplete = true;
    }

    public void levelFailed() {
        levelFailed = true;
    }
}
