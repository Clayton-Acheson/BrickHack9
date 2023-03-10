/**
 * @(#)Level5.java
 * author: Christian Rockwell
 * This class is the fifth level of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;
import Events.TestArea;

public class Level5 extends JPanel{

    private boolean levelComplete = false;
    private boolean levelFailed = false;
    private final int levelNumber = 5;
    private final int screenWidth = 1757;
    private final int screenHeight = 869;
    JPanel Intro = Introduction();

    public Level5() {
        JPanel Level5 = new JPanel();
        Level5.add(Intro);
        Intro.setOpaque(true);
        Intro.setLocation(screenWidth/2,screenHeight);
        Intro.setVisible(true);
    }

    public JPanel Introduction(){
        JPanel Intro = new JPanel();
        Intro.setSize(screenWidth,screenHeight);
        Intro.setLayout(new GridBagLayout());
        Intro.setLayout(new GridLayout(4,0));

        TestArea Title = new TestArea(new Color(142,184,212), "                                                                Level 5");
        Title.setFont(new Font("Impact",Font.PLAIN, 60));
        Title.setSize(screenWidth/2,(screenHeight/4));
        Intro.add(Title);
       
        TestArea Desc = new TestArea(new Color(142,184,212), "                                                   Be careful when closing your tabs");
        Desc.setFont(new Font("Impact",Font.PLAIN, 52));
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
