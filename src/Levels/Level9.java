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
    private final int levelNumber = 9;

    public JPanel createLevel9() {
        JPanel level9 = new JPanel();
        level9.add(new JLabel("Level 9: Basic Reaction"), BorderLayout.NORTH);
        level9.add(new JLabel(""), BorderLayout.CENTER);
        return level9;
    }

    public void levelComplete() {
        levelComplete = true;
    }
}