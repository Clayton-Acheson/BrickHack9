/**
 * @(#) TitleScreen.java
 * author: Christian Rockwell
 * This class is the title screen of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;
import Windows.GUI;

public class TitleScreen extends JPanel{
        private final int levelNumber = 0;
        private final int screenWidth = 1757;
    private final int screenHeight = 869;

        public JPanel createTitleScreen() {
            JPanel titleScreen = new JPanel();
            titleScreen.add(GUI.createLabel("Welcome to the game"), BorderLayout.NORTH);
            titleScreen.setVisible(true);
            return titleScreen;
        }
}
