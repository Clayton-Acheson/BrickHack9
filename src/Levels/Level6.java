/**
 * @(#)Level6.java
 * author: Christian Rockwell
 * This class is the sixth level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;

public class Level6 {
    private boolean levelComplete = false;
    private boolean levelFailed = false;
    private final int levelNumber = 6;
    private final int screenWidth = 1757;
    private final int screenHeight = 869;

    public JPanel createLevel6() {
        JPanel level6 = new JPanel();
        level6.add(new JLabel("Level 6: Basic Reaction"), BorderLayout.NORTH);
        level6.add(new JLabel(""), BorderLayout.CENTER);
        return level6;
    }

    public void levelComplete() {
        levelComplete = true;
    }

    public void levelFailed() {
        levelFailed = true;
    }
}
