/**
 * @(#)Level1.java
 * author: Christian Rockwell
 * This class is the first level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;

public class Level1 extends JPanel {

    private boolean levelComplete = false;
    private boolean levelFailed = false;
    private final int levelNumber = 1;
    private final int screenWidth = 1757;
    private final int screenHeight = 869;

    public JPanel createLevel1() {
        JPanel level1 = new JPanel();
        Image background = Toolkit.getDefaultToolkit().createImage("XP.jpg");
        level1.add(new JLabel("Level 1: Basic Reaction"), BorderLayout.NORTH);
        level1.add(new JLabel(""), BorderLayout.CENTER);
        return level1;
    }

    public void paint(Graphics g) {

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("p3.gif");
        g.drawImage(i, 120,100,this);

    }

    public void levelComplete() {
        levelComplete = true;
    }

    public void levelFailed() {
        levelFailed = true;
    }
}
