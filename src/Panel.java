/**
 * @(#)Panel.java
 * author: Christian Rockwell
 */

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import javax.swing.event.MouseInputAdapter;

public class Panel extends JFrame {

    private final MouseInputAdapter mouseInputAdapter = new MouseInputAdapter() {
        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            super.mousePressed(e);
        }
    };
    private final Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    private final JButton button = new JButton("swag");
    public int width = (int) screensize.getWidth(), height = (int) screensize.getHeight();


    public Panel(int rows, int columns) {
        super("Game Name Pending");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(rows, columns));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new TopPanel().getPanel());
        panel.add(GUI.createLabel("This is a label wow"));
        panel.add(GUI.createButton("swag"));
        panel.add(new TopPanel().getPanel(), BorderLayout.LINE_START);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        GUI.createLabel("swag");
        panel.add(button);
        return panel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();
        Panel panel = new Panel(rows, columns);
    }
}