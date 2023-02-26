/**
 * @(#)Level5.java
 * author: Christian Rockwell
 * This class is the fifth level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;

public class Level5 {

    private boolean levelComplete = false;
    private boolean levelFailed = false;
    private final int levelNumber = 5;
    private final int screenWidth = 1757;
    private final int screenHeight = 869;

    public JPanel createLevel5() {
        JPanel level5 = new JPanel();
        level5.add(new JLabel("Level 5: Basic Reaction"), BorderLayout.NORTH);
        level5.add(new JLabel(""), BorderLayout.CENTER);
        return level5;
    }

    public void levelComplete() {
        levelComplete = true;
    }

    public void levelFailed() {
        levelFailed = true;
    }
}
