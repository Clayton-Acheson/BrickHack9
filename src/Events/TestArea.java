package Events;

 import javax.swing.*;
 import java.awt.Dimension;
 import java.awt.Color;
 import java.awt.Graphics;
  
 public class TestArea extends JLabel {
  
     public TestArea(Color color, String text) {
         setBackground(color);
         setOpaque(true);
         setBorder(BorderFactory.createEmptyBorder());
         setText(text);
     }
 }
