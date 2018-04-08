
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
import javax.swing.JOptionPane;
import javax.swing.AbstractAction;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;

public class MenuGUI extends JPanel 
{   
    customButton play = new customButton("Play");
    customButton exit = new customButton("Exit");
    customButton options = new customButton("Options");
    
    public MenuGUI()
    {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(Box.createVerticalStrut(450));
        //play
        play.setAlignmentX(CENTER_ALIGNMENT);
        add(play);
        add(Box.createVerticalStrut(50));
        //options
        options.setAlignmentX(CENTER_ALIGNMENT);    
        add(options);
       
        add(Box.createVerticalStrut(50));
        //exit
        exit.setAlignmentX(CENTER_ALIGNMENT);
        add(exit);
        exit.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            });
        add(Box.createVerticalGlue());

        try{
            //E:\Documents\NWU\2018\ITRW212\MAJOR PROJECT\Phase 2\SCRIBBLE_27798607_PHASE2\bin\image\audio
            URL url = MenuGUI.class.getResource("Jim_Yosef__Lights_NCS_Release.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(url);
            Clip music = AudioSystem.getClip();
            music.open(audio);
            music.loop(-1);
        }
        catch(Exception ex)
        { 
            JOptionPane.showMessageDialog(null,"Audio did not load, CHECK ISSUE AND THEN DELETE THIS CODE - KTHANX"); 
        }

    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(new ImageIcon(MenuGUI.class.getResource("main.png")).getImage(), 0 ,0 ,1200 ,900 , this);

    }

    public customButton getPlay()
    {
        return play;
    }

    public customButton getExit()
    {
        return exit;
    }
    
    public customButton getOptions()
    {
        return options;
    }
}

