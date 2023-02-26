/**
 * @(#)Level9.java
 * author: Christian Rockwell
 * This class is the ninth level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;

public class Level9 {
    private boolean levelComplete = false;
    private boolean levelFailed = false;
    private final int levelNumber = 9;
    private final int screenWidth = 1757;
    private final int screenHeight = 869;

    public JPanel createLevel9() {
        JPanel level9 = new JPanel();
        level9.add(new JLabel("Level 9: Basic Reaction"), BorderLayout.NORTH);
        level9.add(new JLabel(""), BorderLayout.CENTER);
        return level9;
    }

    public void levelComplete() {
        levelComplete = true;
    }

    public void levelFailed() {
        levelFailed = true;
    }
}
