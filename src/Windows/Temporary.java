package Windows;

import javax.swing.*;
public class Temporary extends JPanel{

    private JFrame frame;
    private ImageIcon background;
    private JLabel myLabel;

    public Temporary() {
        background = new ImageIcon(this.getClass().getResource("XP.jpg"));
        myLabel = new JLabel(background);
        myLabel.setSize(background.getIconWidth(), background.getIconHeight());

        frame = new JFrame();
        frame.add(myLabel);
        frame.setSize(background.getIconWidth(), background.getIconHeight());

    }

    public void addLabel(JButton button) {
        frame.add(button);
    }

    public static void main(String[] args) {
        Temporary temp = new Temporary();
        temp.frame.setVisible(true);
    }
}
