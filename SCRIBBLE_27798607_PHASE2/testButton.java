
/**
 * this is just a testing class i use to test the customButton class and to figure out the best way to display 
 * the items. This class is NOT needed for the program to run. So doubt there are marks to be found here.
 * 
 * PHASE 2 - ITRW212 MAJOR ASSIGNMENT
 * 
 * @author (Esmari Swart - 27798607) 
 * @version (03/04/2018)
 */

import java.awt.Component;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.net.URL;

public class testButton extends JFrame 
{    
    //private customPanel contentPane;
    //     public testButton(){
    //         JPanel panel = new JPanel();
    //         setTitle("Testing button");
    // 
    //         setSize(640,480);
    //         setResizable(false);
    // 
    //         panel.setBackground(java.awt.Color.DARK_GRAY);
    //         customButton play = new customButton("Play");
    //         panel.add(play);
    //         add(panel);
    // 
    //         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //         setLocationRelativeTo(null);
    //         setVisible(true);
    //     }     

    public static void main(String[]args) 
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
            {
                public void run() 
                {
                    createAndShowGUI();
                }
            }
        );
    }

    private static void createAndShowGUI() {
        //Create and set up the window.SCRIBBLE_27798607_PHASE2/back.png
        JFrame frame = new JFrame("PLEASE LET THIS WORK XD");

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        
        //Display the window.
       // frame.setContentPane(contentPane);
        frame.pack();
      //  frame.setLocationByPlatform(true);
        frame.setSize(600,400);
        frame.setResizable(false);

        frame.setVisible(true);
    }

    private static void addAButton(String text, Container container) {
        customButton play = new customButton(text);
        play.setAlignmentX(Component.CENTER_ALIGNMENT);

        container.add(play);
    }

    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        addAButton("Button 1", pane);
        addAButton("Button 2", pane);
        addAButton("Button 3", pane);

        addAButton("Long-Named Button 4", pane);
        addAButton("5", pane);
    }
}
