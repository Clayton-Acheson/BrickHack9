
 
/*
 * BlankArea.java is used by:
 *    MouseEventDemo.java.
 *    MouseMotionEventDemo.java
 */

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
 
public class TestArea extends JLabel {
    Dimension minSize = new Dimension(50, 50);
 
    public TestArea(Color color, String text) {
        setBackground(color);
        setOpaque(true);
        setBorder(BorderFactory.createEmptyBorder());
        setText(text);
        
    }
 
    public Dimension getMinimumSize() {
        return minSize;
    }
 
    public Dimension getPreferredSize() {
        return minSize;
    }
}