/**
 * @(#)Level8.java
 * author: Christian Rockwell
 * This class is the eighth level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;

public class Level8 {
    private boolean levelComplete = false;
    private final int levelNumber = 8;

    public JPanel createLevel8() {
        JPanel level8 = new JPanel();
        level8.add(new JLabel("Level 8: Basic Reaction"), BorderLayout.NORTH);
        level8.add(new JLabel(""), BorderLayout.CENTER);
        return level8;
    }

    public void levelComplete() {
        levelComplete = true;
    }
}
