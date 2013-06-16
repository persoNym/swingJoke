/*
 *@name                   Victoria C
 *@description            Message box swing simulator
 *@last revised           2/21/13
 */
package swing;

import javax.swing.*;
import java.awt.*;

public class Swing extends JApplet{

    public static void main(String[] args) {
       swinging();
      
    }
    
    private static void swinging () {
    
       JFrame frame = new JFrame("Java Joke");
       frame.setLocationRelativeTo(null);
       frame.setSize(500,200);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JPanel panel = new JPanel(new GridBagLayout());
       frame.getContentPane().add(panel,BorderLayout.CENTER);//controls layout of the panels
       GridBagConstraints c = new GridBagConstraints(); //also controls the packing of the label into one pane
       c.insets = new Insets(10,10,10,10); //controls spacing
       
       JLabel label0 = new JLabel("Victoria Abadua Croffie");
       label0.setForeground(Color.green);
       label0.setFont(new Font("Monospaced", Font.PLAIN, 14));
       c.gridx = 0; c.gridy = 0;
       panel.add(label0, c);
       
       JLabel label1 = new JLabel("Why do so many Java programmers wear glasses?");
       label1.setForeground(Color.red);
       label1.setFont(new Font("Serif", Font.BOLD, 12));
       c.gridx = 0; c.gridy = 1; //orientation of the layout
       panel.add(label1, c);
       
       JLabel label2 = new JLabel("Because they don't C#");
       label2.setFont(new Font("SanSerif", Font.ITALIC, 12));
       label2.setForeground(Color.blue);
       c.gridx = 0; c.gridy = 2;
       panel.add(label2, c);
       
       JLabel label3 = new JLabel("Victoria A. Croffie");
       label3.setForeground(Color.cyan);
       label3.setFont(new Font("TimesNewRoman", Font.PLAIN, 10));
       c.gridx = 0; c.gridy = 3;
       panel.add(label3, c);
}
      
}
