
/**
 * This is the main controller for my game. This will be where majority of the signals come from.
 * Like the core of the game hence the name.
 * 
 * PHASE 2 - ITRW212 MAJOR ASSIGNMENT
 * 
 * @author (Esmari Swart - 27798607) 
 * @version (03/04/2018)
 */
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
public class tCore extends JFrame
{   
    public tCore () 
    {
        setTitle("Scribble");
        setSize(1200,900);
        setResizable(false);

        MenuGUI menu = new MenuGUI();
        OptionsGUI options = new OptionsGUI();
        
        add(menu);
        menu.getOptions().addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e){
                    getContentPane().remove(menu);
                    //panel.revalidate();
                    //panel.paintImmediately(0,0,1200,900);
                    getContentPane().add(options);
                    invalidate();
                    validate();
                }
            });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main (String [] args)
    {
        new tCore();

        //menu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        //menu.setSize(1200, 900 ); // set frame size
        //menu.setVisible( true );

        //just to link screens for now
        //         PlayGUI play = new PlayGUI();
        //         play.setVisible( false );
        // OptionsGUI options = new OptionsGUI();
        // options.setVisible( false );
        //         ExitGUI exit = new ExitGUI();
        //         exit.setVisible( false );
        //         SoundGUI sound = new SoundGUI();
        //         sound.setVisible( false );
        //         ScoresGUI scores = new ScoresGUI();
        //         scores.setVisible( false );
        //         GameOverGUI gameover = new GameOverGUI();
        //         gameover.setVisible( false );
    }
}
