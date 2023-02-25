
 
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
    Dimension minSize = new Dimension(100, 50);
 
    public TestArea(Color color, String text) {
        setBackground(color);
        setOpaque(true);
        setBorder(BorderFactory.createEmptyBorder());
        setText(text);
        if(!text.equals(" ")){
            setSize(150,50);
        }
        else{
            setSize(11, 50);
        }
        
    }
 
    public Dimension getMinimumSize() {
        return minSize;
    }
 
    public Dimension getPreferredSize() {
        return minSize;
    }
}