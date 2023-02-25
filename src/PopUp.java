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
    private TestArea m1,m2,m3,m4,m5;
    

    public JButton createClose(GridBagConstraints gbc){        //Create the Close Button
        JButton Close = new JButton("  X  ");
            gbc.gridx = 4;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
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
            Close.setSize(50,50);
        return Close;
    }

    public JButton CreateMsg(String warningmsg){
        JButton Msg = new JButton(warningmsg);
        gbc.gridx = 0;
        gbc.gridy = 1;
        Msg.setForeground(Color.BLACK);
        Msg.setBackground(Tan);
        Msg.setOpaque(true);
        Msg.setSize(50,100);
        Border emptyBorder = BorderFactory.createEmptyBorder();
            Msg.setBorder(emptyBorder);
        return Msg;
    }

    public JButton CreateOp1(String choice, GridBagConstraints gbc){
        JButton Op1 = new JButton(choice);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
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
        Op1.setSize(50,50);
        Border emptyBorder = BorderFactory.createEmptyBorder();
            Op1.setBorder(emptyBorder);
        return Op1;
    }

    public JButton CreateOp2(String choice2, GridBagConstraints gbc){
        JButton Op2 = new JButton(choice2);
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
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
        Op2.setSize(50,50);
        return Op2;
    }

    public int width = (int) screensize.getWidth(), height = (int) screensize.getHeight();
    

    public PopUp (String warning, String optionA, String optionB){
        super("Error Testing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);
        setLayout(new GridBagLayout());
        
        b1 = new TestArea(Color.BLUE, "Bitches");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(b1,gbc);
        
        b2 = new TestArea(Color.BLUE, " ");
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(b2, gbc);

        b3 = new TestArea(Color.BLUE, " ");
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(b3, gbc);

        b4 = new TestArea(Color.BLUE, " ");
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(b4, gbc);

        add(createClose(gbc),gbc);

        m1 = new TestArea(Tan, " ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(m1, gbc);

        m2 = new TestArea(Tan, "    ");
        gbc.gridx = 1; 
        gbc.gridy = 1;
        add(m2, gbc);

        m3 = new TestArea(Tan, warning);
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(m3, gbc);

        m4 = new TestArea(Tan, " ");
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(m4, gbc);

        m5 = new TestArea(Tan, " ");
        gbc.gridx = 4;
        gbc.gridy = 1;
        add(m5, gbc);
        
        //add(CreateMsg(warningText),gbc);
        
        t1 = new TestArea(Tan, " ");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(t1, gbc);
    
        add(CreateOp1(optionA,gbc),gbc);
        
        t2 = new TestArea(Tan, " ");
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(t2, gbc);

        add(CreateOp2(optionB, gbc),gbc);

        t3 = new TestArea(Tan, " ");
        gbc.gridx = 4;
        gbc.gridy = 3;
        add(t3, gbc);

        setVisible(true);
    }

    public static void main(String[] args) {
     new PopUp("You dun fucked up", "Suffer", "Cope");
    }
}
