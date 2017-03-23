import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.*;
class start implements ActionListener
{
Frame f;
JButton b1;
  JLabel lbl;
start()
{


f=new Frame("HAVE FUN");

b1=new JButton("CLICK TO PLAY");

 lbl=new JLabel();
b1.addActionListener(this);
b1.setFont(new Font("Arial",1,20));


f.setLayout(new FlowLayout());
lbl.setBounds(10,60,840,470);
f.add(b1);
try
{
 BufferedImage img=ImageIO.read(new File("/E:/android/games/hit ball/instructions.jpg"));
        ImageIcon icon=new ImageIcon(img);
      
      
        lbl.setIcon(icon);

        f.add(lbl);
}
catch(Exception ee)
{
}
f.setBackground(new Color(201,200,200));
f.setSize(840,500);
f.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
hit fg=new hit();
f.dispose();
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