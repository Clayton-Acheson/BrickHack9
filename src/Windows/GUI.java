/**
 * @(#)GUI.java
 * author: Christian Rockwell
 * This class is the main Windows.GUI class. It contains all the methods for creating the Windows.GUI elements.
 */

package Windows;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class GUI {

    public static String font = "Impact Bold";
    public static String fontLevels = "Impact";
    public static int fontSmall = 16;
    public static int subheaderSize = 32;
    public static int fontLarge = 72;
    public static Color backgroundColor = Color.WHITE;
    public static Color foregroundColor = Color.BLACK;
    public static Color buttonColor = Color.LIGHT_GRAY;
    public static Color buttonTextColor = Color.BLACK;
    public static Color buttonHoverColor = Color.GRAY;
    public static Color buttonHoverTextColor = Color.WHITE;
    public static Color buttonPressedColor = Color.DARK_GRAY;
    public static Color buttonPressedTextColor = Color.WHITE;
    public static Font buttonFont = new Font(font, Font.PLAIN, fontSmall);
    public static Font levelFont = new Font(fontLevels, Font.PLAIN, fontSmall);
    public static Font titleFont = new Font(font, Font.BOLD, fontLarge);
    public static Font subheaderFont = new Font(font, Font.BOLD, subheaderSize);

    public static JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(titleFont);
        label.setForeground(Color.WHITE);
        return label;
    }

    public static JLabel createLevelLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(subheaderFont);
        label.setForeground(Color.WHITE);
        return label;
    }

    public static JTextField createTextField(String text) {
        JTextField textField = new JTextField(text);
        textField.setFont(levelFont);
        textField.setBackground(Color.LIGHT_GRAY);
        textField.setEditable(false);
        return textField;
    }

    public static JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(buttonFont);
        button.setForeground(buttonTextColor);
        button.setBackground(buttonColor);
        button.setOpaque(true);
        button.setBorderPainted(true);
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(buttonHoverColor);
                button.setForeground(buttonHoverTextColor);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(buttonColor);
                button.setForeground(buttonTextColor);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                button.setBackground(buttonPressedColor);
                button.setForeground(buttonPressedTextColor);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button.setBackground(buttonHoverColor);
                button.setForeground(buttonHoverTextColor);
            }
        });
        return button;
    }


}
