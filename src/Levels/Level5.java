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
    private final int levelNumber = 5;

    public JPanel createLevel5() {
        JPanel level5 = new JPanel();
        level5.add(new JLabel("Level 5: Basic Reaction"), BorderLayout.NORTH);
        level5.add(new JLabel(""), BorderLayout.CENTER);
        return level5;
    }

    public void levelComplete() {
        levelComplete = true;
    }
}