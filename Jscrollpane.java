import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
public class ScrollPaneDemo extends JApplet  
{
  public void init()  
  {
    Container cp = getContentPane();
    // cp.setLayout( new BorderLayout()) ; not needed as container default is BorderLayout
	
    JPanel jp = new JPanel( ) ;
    jp.setLayout( new GridLayout( 20, 20 ) ) ;
		
    for(int i = 0 ; i < 20 ; i++)
       for( int j = 0 ; j < 20 ; j + +  )   
	  jp.add(new JButton("Button " + j));

    int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED ;
    int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED ;

    JScrollPane js = new JScrollPane( jp, v, h ) ;
    cp.add(js, BorderLayout.CENTER) ;
  }  
}   
