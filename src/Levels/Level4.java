/**
 * @(#)Level4.java
 * author: Christian Rockwell
 * This class is the fourth level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;

public class Level4 {
    private boolean levelComplete = false;
    private boolean levelFailed = false;
    private final int levelNumber = 4;
    private final int screenWidth = 1757;
    private final int screenHeight = 869;

    public JPanel createLevel4() {
        JPanel level4 = new JPanel();
        level4.add(new JLabel("Level 4: Basic Reaction"), BorderLayout.NORTH);
        level4.add(new JLabel(""), BorderLayout.CENTER);
        return level4;
    }

    public void levelComplete() {
        levelComplete = true;
    }

    public void levelFailed() {
        levelFailed = true;
    }
}
