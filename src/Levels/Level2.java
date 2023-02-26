/**
 * @(#)Level2.java
 * author: Christian Rockwell
 * This class is the second level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;

public class Level2 {

    private boolean levelComplete = false;
    private boolean levelFailed = false;
    private final int levelNumber = 2;

    public JPanel createLevel2() {
        JPanel level2 = new JPanel();
        level2.add(new JLabel("Level 2: Basic Reaction"), BorderLayout.NORTH);
        level2.add(new JLabel(""), BorderLayout.CENTER);
        return level2;
    }

    public void levelComplete() {
        levelComplete = true;
    }

    public void levelFailed() {
        levelFailed = true;
    }
}
