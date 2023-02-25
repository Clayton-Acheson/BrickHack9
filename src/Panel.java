/**
 * @(#)Panel.java
 * author: Christian Rockwell
 */

import javax.swing.JSplitPane;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.util.Scanner;
import java.awt.GridLayout;


public class Panel extends JFrame {

    private final Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    public int width = (int) screensize.getWidth(), height = (int) screensize.getHeight();


    public Panel(int rows, int columns) {
        super("Game Name Pending");
        JSplitPane splitPane = new JSplitPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setSize(width, height);
        JPanel adPanel = new JPanel();
        adPanel.setLayout(new GridLayout(rows, columns));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                adPanel.add(GUI.createButton("wow"));
            }
        }

        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setDividerLocation(100);
        splitPane.setTopComponent(titlePanel);
        splitPane.setBottomComponent(adPanel);

        adPanel.setBackground(Color.BLACK);
        titlePanel.setBackground(Color.GRAY);

        add(adPanel, BorderLayout.SOUTH);
        add(titlePanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the number of rows: ");
        //int rows = scanner.nextInt();
        //System.out.println("Enter the number of columns: ");
        //int columns = scanner.nextInt();
        new Panel(10, 10);
    }
}