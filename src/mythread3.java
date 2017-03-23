import java.io.*;
import java.awt.*;
import javax.swing.*;
class mythread3 extends Thread
{

public void run()
{int i;


try
{
while(hit.time!=-1)
{
hit.l3.setText("Time="+hit.time);
hit.time=hit.time-1;


Thread.sleep(1600);
}

if(hit.score1>hit.score2)
{
JOptionPane.showMessageDialog(hit.f,"PLAYER 1 IS WINNER");
}
else if(hit.score1<hit.score2)
JOptionPane.showMessageDialog(hit.f,"PLAYER 2 IS WINNER");
else
JOptionPane.showMessageDialog(hit.f,"GOT TIE");

hit.f.dispose();
again ag=new again();

}
catch(Exception e)
{
}


}

}
