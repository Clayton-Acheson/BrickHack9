/**
 * @(#)Level1.java
 * author: Christian Rockwell
 * This class is the first level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;
import Windows.Panel;
import Events.TestArea;


public class Level1 extends JPanel {

    private boolean levelComplete = false;
    private ImageIcon background;
    private JLabel backgroundLabel;

    private boolean levelFailed = false;
    private final int levelNumber = 1;
    private final int screenWidth = 1757;
    private final int screenHeight = 869;

    public JPanel createLevel1() {
        JPanel level1 = new JPanel();
        background = new ImageIcon(this.getClass().getResource("XP.jpg"));
        backgroundLabel = new JLabel(background);
        //backgroundLabel.setSize(Panel.);
        level1.add(backgroundLabel, BorderLayout.CENTER);
        level1.add(new JLabel("Level 1: Basic Reaction"), BorderLayout.NORTH);
        return level1;
    }
    public JPanel Introduction(){
        JPanel Intro = new JPanel();
        Intro.setSize(screenWidth,screenHeight);
        Intro.setLayout(new GridBagLayout());
        Intro.setLayout(new GridLayout(4,1));

        TestArea Title = new TestArea(new Color(142,184,212), "Level 1");
        Title.setFont(new Font("Impact",Font.PLAIN, 30));
        Title.setSize(screenWidth,(screenHeight/4));
        Intro.add(Title);
       
        TestArea Desc = new TestArea(new Color(142,184,212), "Be careful when closing your tabs");
        Desc.setFont(new Font("Impact",Font.PLAIN, 14));
        Desc.setSize(screenWidth,(screenHeight/4));
        Intro.add(Desc);
        
        TestArea Fill1 = new TestArea(new Color(142,184,212), " ");
        Fill1.setSize(screenWidth,(screenHeight/4));
        Intro.add(Fill1);

        TestArea Fill2 = new TestArea(new Color(142,184,212), " ");
        Fill2.setSize(screenWidth,(screenHeight/4));
        Intro.add(Fill2);

        return Intro;
    }

    public void levelComplete() {
        levelComplete = true;
    }

    public void levelFailed() {
        levelFailed = true;
    }
}
