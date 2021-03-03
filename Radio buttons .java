import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;



public class CheckboxEx1
{
JFrame jf;
Checkbox chk1, chk2, chk3, chk4;

CheckboxEx1()
{
jf= new JFrame("Variants of Checkbox");

//Creating an no-message Checkbox
chk1 = new Checkbox();		

//Creating a pre-selected Checkbox with a message 
chk2 = new Checkbox("Yes",true);

//Creating an unselected Checkbox with a message	
chk3 = new Checkbox("No");	
		

jf.add(chk1);
jf.add(chk2);
jf.add(chk3);

jf.setLayout(new FlowLayout());
jf.setSize(300,120);
jf.setVisible(true);
}

public static void main(String... ar)
{
new CheckboxEx1();
}

}
