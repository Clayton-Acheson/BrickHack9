-/*
 * Handles Mouse Events for the game
 * Authors : @cgr9496 , @Clayton-Acheson
 */

 import java.awt.GridLayout;
 import java.awt.Color;
 import java.awt.Dimension;
 import java.awt.event.MouseListener;
 import java.awt.event.MouseEvent;
  
 import javax.swing.*;
 
  
 public class MouseClickEvent extends JPanel
         implements MouseListener {
     TestArea TestArea;
     JTextArea textArea;
     static final String NEWLINE = System.getProperty("line.separator");
     
     public static void main(String[] args) {
         /* Use an appropriate Look and Feel */
         try {
             //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
             //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
             UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
         } catch (UnsupportedLookAndFeelException ex) {
             ex.printStackTrace();
         } catch (IllegalAccessException ex) {
             ex.printStackTrace();
         } catch (InstantiationException ex) {
             ex.printStackTrace();
         } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
         }
         /* Turn off metal's use of bold fonts */
         UIManager.put("swing.boldMetal", Boolean.FALSE);
         //Schedule a job for the event dispatch thread:
         //creating and showing this application's GUI.
         javax.swing.SwingUtilities.invokeLater(new Runnable() {
             public void run() {
                 createAndShowGUI();
             }
         });
     }
      
     /**
      * Create the GUI and show it.  For thread safety,
      * this method should be invoked from the
      * event dispatch thread.
      */
     private static void createAndShowGUI() {
         //Create and set up the window.
         JFrame frame = new JFrame("MouseClickTest");  //Creates the new Window and names it
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Determines what to do wit hthe program when the window closes
          
         //Create and set up the content pane.
         JComponent newContentPane = new MouseClickEvent();
         newContentPane.setOpaque(true); //content panes must be opaque
         frame.setContentPane(newContentPane);
          
         //Display the window.
         frame.pack(); //Puts everything into a frame
         frame.setVisible(true); //Opens the window
     }
      
     public MouseClickEvent() {
         super(new GridLayout(0,5)); //Determines layout of the popup
         TestArea = new TestArea(Color.BLUE, " "); //Determines color of test area
         add(TestArea); //Adds the test area to the first col
         textArea = new JTextArea(); //Creates an area for text to be printed
        textArea.setEditable(false); //Asks if the text within the textArea is editable
         JScrollPane scrollPane = new JScrollPane(textArea); //Creates scrollplane where the text is ouput to
         scrollPane.setVerticalScrollBarPolicy(  //Sets the rules of the vertical scroll bar
                 JScrollPane.VERTICAL_SCROLLBAR_NEVER); //Sets if the scroll bar exists or not
         scrollPane.setPreferredSize(new Dimension(75, 150)); //Gives dimensions of the scrollPane
         add(scrollPane); //Adds the ScrollPane to the MouseClickEvent area
          
         //Register for mouse events on blankArea and the panel.
         TestArea.addMouseListener(this); //Creates a mouse listener instance in the testArea
         addMouseListener(this); //Adds a Mouse Listener to the main window that opens with the program
         setPreferredSize(new Dimension(900, 450)); //Sets the size of the TestArea
         setBorder(BorderFactory.createEmptyBorder(15,5,15,5)); //Creates borders for everything
     }
      
     void eventOutput(String eventDescription, MouseEvent e) { //Prints out where the mouse action was detected
         textArea.append(eventDescription + " detected on " //Text that goes to the textArea
                 + e.getComponent().getClass().getName()
                 + "." + NEWLINE);        
         textArea.setCaretPosition(textArea.getDocument().getLength()); //Tells the textArea what line to print at
     }
      
     public void mousePressed(MouseEvent e) { //Determines if the mouse was pressed while within the test area
     }
      
     public void mouseReleased(MouseEvent e) { //Determines when the mouse was released within the test area
     }
      
     public void mouseEntered(MouseEvent e) { //Detects when the mouse enters the area that has a MouseEvent attached 
         eventOutput("Mouse entered", e);
 
     }
      
     public void mouseExited(MouseEvent e) { //Detects when the Mouse exits the area that has a MouseEvent Attached
         eventOutput("Mouse exited", e);
     }
      
     public void mouseClicked(MouseEvent e) {
         eventOutput("Mouse clicked (# of clicks: "
                 + e.getClickCount() + ")", e);
     }
 }
