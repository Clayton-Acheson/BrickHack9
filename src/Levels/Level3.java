/**
 * @(#)Level3.java
 * author: Christian Rockwell
 * This class is the third level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;

public class Level3 {

    private boolean levelComplete = false;
    private boolean levelFailed = false;
    private final int levelNumber = 3;
    private final int screenWidth = 1757;
    private final int screenHeight = 869;

    public JPanel createLevel3() {
        JPanel level3 = new JPanel();
        level3.add(new JLabel("Level 3: Basic Reaction"), BorderLayout.NORTH);
        level3.add(new JLabel(""), BorderLayout.CENTER);
        return level3;
    }

    public void levelComplete() {
        levelComplete = true;
    }

    public void levelFailed() {
        levelFailed = true;
    }
}
