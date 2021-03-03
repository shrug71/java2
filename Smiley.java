import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Smile extends Applet
{
    public void paint(Graphics g)
    {
        setBackground(Color.BLACK); 
        g.setColor(Color.YELLOW);
        g.fillOval(30,50,100, 100); 
        g.setColor(Color.BLACK);
        g.fillOval(55,75,10, 10); 
        g.fillOval(95,75,10, 10); 
        g.drawArc(60, 85, 40,40,-30,-120);
    }
    
}

/*
<applet code="Smile.class" width="200" height="200"> </applet> 
*/
