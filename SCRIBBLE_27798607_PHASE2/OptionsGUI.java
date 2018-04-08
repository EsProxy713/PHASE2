
/**
 * PHASE 2 - ITRW212 MAJOR ASSIGNMENT
 * 
 * @author (Esmari Swart - 27798607) 
 * @version (03/04/2018)
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.Box;
public class OptionsGUI extends JPanel 
{
    public OptionsGUI()
    {   

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(Box.createVerticalStrut(700));
        customButton ee = new customButton("shmeh");
        ee.setAlignmentX(CENTER_ALIGNMENT);
        

        
        add(ee);
        add(Box.createVerticalStrut(50));

    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(new ImageIcon(MenuGUI.class.getResource("back.png")).getImage(), 0 ,0 ,1200 ,900 , this);

    }

}
