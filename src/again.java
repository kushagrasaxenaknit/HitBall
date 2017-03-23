import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class again implements ActionListener,WindowListener
{
Frame f;
JButton b1,b2;

again()

{
f=new Frame("DECIDE SOON....");

b1=new JButton("Play Again");
b2=new JButton("Exit");

b1.addActionListener(this);
b2.addActionListener(this);
b1.setFont(new Font("Arial",1,20));
b2.setFont(new Font("Arial",1,20));
f.setBackground(new Color(201,200,200));
f.setLayout(new FlowLayout());
f.add(b1);
f.add(b2);

f.addWindowListener(this);

f.setSize(300,100);
f.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
JButton b =(JButton)e.getSource();

if(b==b1)
{
hit fg=new hit();
}

if(b==b2)
{
System.exit(0);
}

}
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
public void windowClosed(WindowEvent e)
{

}
public void windowOpened(WindowEvent e)
{


}
public void windowIconified(WindowEvent e)
{

}
public void windowDeiconified(WindowEvent e)
{

}

public void windowActivated(WindowEvent e)
{

}
public void windowDeactivated(WindowEvent e)
{

}



}
