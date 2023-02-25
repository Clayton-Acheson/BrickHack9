/**
 * PopUp.java
 * Creates the grid layout for the PopUp designed in the big grid that is the game
 * @author @Clayton-Acheson
 */

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import javax.swing.event.MouseInputAdapter;


public class PopUp extends JFrame {

    private final MouseInputAdapter mouseInputAdapter = new MouseInputAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            super.mouseEntered(e);
        }
    };

    private final Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    private static Color Maroon = new Color(120,13,24);
    private static Color Tan = new Color(217,208,182);
    private static Color DarkTan = new Color(143,126, 76);
    GridBagConstraints gbc = new GridBagConstraints(); 
    private TestArea b1,b2, b3, b4;
    private TestArea t1,t2,t3;
    

    public JButton createClose(GridBagConstraints gbc){        //Create the Close Button
        JButton Close = new JButton("  X  ");
            gbc.gridx = 4;
            gbc.gridy = 0;
            Close.setForeground(Color.WHITE);
            Close.setBackground(Color.RED);
            Close.setOpaque(true);
            Close.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    Close.setBackground(Maroon);
                    Close.setForeground(Color.WHITE);
                }
    
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    Close.setBackground(Color.RED);
                    Close.setForeground(Color.WHITE);
                }
                public void mousePressed(java.awt.event.MouseEvent evt) {}
                public void mouseReleased(java.awt.event.MouseEvent evt) {}
            });
            Border emptyBorder = BorderFactory.createEmptyBorder();
            Close.setBorder(emptyBorder);
        return Close;
    }

    public JTextField createWarning(String warningText, GridBagConstraints gbc){
        JTextField Warning = new JTextField(warningText);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
            Warning.setForeground(Color.BLACK);
            Warning.setBackground(Tan);
            Warning.setVisible(true);
        return Warning;
    }

    public JButton CreateOp1(GridBagConstraints gbc){
        JButton Op1 = new JButton("Option 1");
        gbc.gridx = 1;
        gbc.gridy = 2;
        Op1.setForeground(Color.BLACK);
        Op1.setBackground(Tan);
        Op1.setOpaque(true);
        Op1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Op1.setBackground(DarkTan);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Op1.setBackground(Tan);
                Op1.setForeground(Color.BLACK);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {}
            public void mouseReleased(java.awt.event.MouseEvent evt) {}
        });
        Op1.setSize(10,10);
        Border emptyBorder = BorderFactory.createEmptyBorder();
            Op1.setBorder(emptyBorder);
        return Op1;
    }

    public JButton CreateOp2(GridBagConstraints gbc){
        JButton Op2 = new JButton("Option 2");
        gbc.gridx = 3;
        gbc.gridy = 2;
        Op2.setForeground(Color.BLACK);
        Op2.setBackground(Tan);
        Op2.setOpaque(true);
        Op2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Op2.setBackground(DarkTan);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Op2.setBackground(Tan);
                Op2.setForeground(Color.BLACK);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {}
            public void mouseReleased(java.awt.event.MouseEvent evt) {}
        });
        Border emptyBorder = BorderFactory.createEmptyBorder();
        Op2.setBorder(emptyBorder);
        Op2.setSize(10,10);
        return Op2;
    }

    public int width = (int) screensize.getWidth(), height = (int) screensize.getHeight();
    

    public PopUp (String warningText){
        setLayout(new GridBagLayout());
        
        b1 = new TestArea(Color.BLUE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(b1,gbc);
        
        b2 = new TestArea(Color.BLUE);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(b2, gbc);

        b3 = new TestArea(Color.BLUE);
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(b3, gbc);

        add(createClose(gbc),gbc);
        add(createWarning("You clicked on the wrong thing me boyo",gbc));
        
        t1 = new TestArea(Tan);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(t1, gbc);
    
        add(CreateOp1(gbc),gbc);
        
        t2 = new TestArea(Tan);
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(t2, gbc);

        add(CreateOp2(gbc),gbc);
        
        t3 = new TestArea(Tan);
        gbc.gridx = 4;
        gbc.gridy = 2;
        add(t3, gbc);

        setVisible(true);
    }

    public static void main(String[] args) {
    PopUp P = new PopUp("You dun fucked up");
    JFrame jf = new JFrame();
    jf.setTitle("POPUP BITCHES");
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(300,120);
    jf.setVisible(true);
    jf.add(P);
    }
}
