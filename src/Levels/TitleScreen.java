/**
 * @(#) TitleScreen.java
 * author: Christian Rockwell
 * This class is the title screen of the game.
 */

package Levels;

import javax.swing.*;
import java.awt.*;
import Windows.GUI;

public class TitleScreen {
        private final int levelNumber = 0;

        public JPanel createTitleScreen() {
            JPanel titleScreen = new JPanel();
            titleScreen.add(GUI.createLabel("Welcome to the game"), BorderLayout.NORTH);
            titleScreen.add(new JLabel(""), BorderLayout.CENTER);
            return titleScreen;
        }
}
