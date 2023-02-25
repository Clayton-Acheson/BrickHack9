/**
 * @(#)Level1.java
 * author: Christian Rockwell
 * This class is the first level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;

public class Level1 {

    private boolean levelComplete = false;
    private final int levelNumber = 1;

    public JPanel createLevel1() {
        JPanel level1 = new JPanel();
        level1.add(new JLabel("Level 1: Basic Reaction"), BorderLayout.NORTH);
        level1.add(new JLabel(""), BorderLayout.CENTER);
        return level1;
    }

    public void levelComplete() {
        levelComplete = true;
    }
}
