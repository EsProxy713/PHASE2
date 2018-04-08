
/**
 * This is my custom button class. For all my custom graphics. I decided to use a single button design and then
 * create objects out of it for the sake of my own sanity and time management.
 * PHASE 2 - ITRW212 MAJOR ASSIGNMENT
 * 
 * @author (Esmari Swart - 27798607) 
 * @version (03/04/2018)
 */
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class customButton extends JButton implements MouseListener
{
    
    Dimension size = new Dimension(222,60);

    boolean hover=false;
    boolean click=false;

    String text = "";

    public customButton(String text)
    {
        setVisible(true);
        setFocusable(true);
        setContentAreaFilled(false);
        setBorderPainted(false);

        
        
        this.text=text;
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        if(click) {
            //g.setColor(Color.WHITE);
           // g.fillRect(14, 10, 300, 150);
        }

       // g.setColor(new Color(54 , 147 , hover ? 0 : 204));

        //g.fillRect(0, 0, 250, 4); //top
       // g.fillRect(0, 80, 250, 4); //bottom
       // g.fillRect(5, 0, 4, 80); //left
        //g.fillRect(243, 0, 4, 80); //right
        
        g.setColor(new Color(79, 129, 189));
        g.fillRect(0, 0, 214, 52); //over
        g.setColor(new Color(hover ? 146 : 255 , hover ? 177 : 255 , hover ? 214 : 255));
        g.fillRect(3, 3, 207, 46); // inside 
        
        g.setColor(new Color(hover ? 255 : 79 , hover ? 255 :129, hover ?255  :189 ));
        
        g.setFont(Font.decode("Brush Script MT-BOLD-22"));
        
        FontMetrics metrics = g.getFontMetrics();
        
        int width = metrics.stringWidth(text);
        
        g.drawString(text, 108 - width /2, 32);
    }

    @Override
    public Dimension getPreferredSize()
    {
        return size;
    }

    @Override
    public Dimension getMaximumSize()
    {
        return size;
    }

    @Override
    public Dimension getMinimumSize()
    {
        return size;
    }
    
    public void setButtonText(String text)
    {
        this.text = text;      
    }

    public String getButtonText()
    {
        return text;
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        hover = true;
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        hover = false;
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        click = true;
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        click = false;
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

    }
}
