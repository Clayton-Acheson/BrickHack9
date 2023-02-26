/**
 * @(#)Level7.java
 * author: Christian Rockwell
 * This class is the seventh level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;

public class Level7 {
    private boolean levelComplete = false;
    private boolean levelFailed = false;
    private final int levelNumber = 7;
    private final int screenWidth = 1757;
    private final int screenHeight = 869;

    public JPanel createLevel7() {
        JPanel level7 = new JPanel();
        level7.add(new JLabel("Level 7: Basic Reaction"), BorderLayout.NORTH);
        level7.add(new JLabel(""), BorderLayout.CENTER);
        return level7;
    }

    public void levelComplete() {
        levelComplete = true;
    }

    public void levelFailed() {
        levelFailed = true;
    }
}
