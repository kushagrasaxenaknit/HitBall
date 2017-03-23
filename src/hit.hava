import java.awt.*;
import java.awt.event.*;
class hit  implements ActionListener,WindowListener,KeyListener
{
static int f2=1;
 static Frame f;
static Button b1,b2,b3;
Panel p;
static Label l1,l2,l3;
static int score1,score2;
static int time,flag1=0,flag2=1;

hit()
{


score1=0;
score2=0;
time=59;
f=new Frame("Play Hard || Go Home");
f.setLayout(null);
b1=new Button(" ");
p=new Panel();
b2=new Button("0");
b3=new Button("Hit");
l1=new Label("Score 1=0");
l2=new Label("Score 2=0");
l3=new Label("Time=59");
p.setBounds(10,30,1350,50);
l1.setBounds(10,30,100,50);
l2.setBounds(1250,30,100,50);
l3.setBounds(700,30,100,50);
b1.setBounds(10,350,30,100);
b2.setBounds(1310,350,30,100);
b3.setBounds(1285,390,25,25);
b1.setBackground(new Color(173,233,181));
b2.setBackground(new Color(181,219,215));
b3.setBackground(new Color(248,177,135));
p.setBackground(new Color(181,219,215));
l1.setBackground(new Color(201,201,146));
l2.setBackground(new Color(201,201,146));
l3.setBackground(new Color(201,201,146));
l1.setFont(new Font("Arial",1,20));
l2.setFont(new Font("Arial",1,20));
l3.setFont(new Font("Arial",1,20));
b1.setFont(new Font("Arial",1,20));
b2.setFont(new Font("Arial",1,20));
b3.setFont(new Font("Arial",1,20));

f.addWindowListener(this);
f.addKeyListener(this);
f.add(b1);
f.add(b2);
f.setBackground(new Color(201,200,200));
f.add(p);
f.add(b3);
p.add(l1);
p.add(l2);
p.add(l3);
f.setFocusable(true);


b3.addKeyListener(this);
b2.addKeyListener(this);
b1.addKeyListener(this);

f.setSize(1350,730);
f.setVisible(true);
mythread3 t3=new mythread3();
t3.start();
}

public static void main(String ar[])
{
start s=new start();
}
public void actionPerformed(ActionEvent e)
{
Button b =(Button)e.getSource();


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
public void keyPressed(KeyEvent e)
{
int a=e.getKeyCode();
int y1=b1.getY();
int y2=b2.getY();
int y3=b3.getY();
if(a==38&&y2>80)
{
y2=y2-15;

b2.setBounds(1310,y2,30,100);
if(flag2==1)
{

b3.setBounds(1285,y2+40,25,25);
}

}
if(a==40&&y2<630)
{
y2=y2+15;

b2.setBounds(1310,y2,30,100);
if(flag2==1)
{

b3.setBounds(1285,y2+40,25,25);
}
}


if(a==75&&y1>80)
{
y1=y1-15;

b1.setBounds(10,y1,30,100);
if(flag1==1)
{

b3.setBounds(40,y1+40,25,25);
}
}
if(a==77&&y1<630)
{
y1=y1+15;

b1.setBounds(10,y1,30,100);
if(flag1==1)
{
y3=y3+10;
b3.setBounds(40,y1+40,25,25);
}
}

if(a==96&&flag2==1)
{
flag2=0;
mythread2 t2=new mythread2();
t2.start();

}

if(a==32&&flag1==1)
{
flag1=0;
mythread1 t1=new mythread1();
t1.start();

}


}
public void keyReleased(KeyEvent e)
{

}
public void keyTyped(KeyEvent e)
{

}

}
