import java.awt.*;
import java.io.*;
class mythread1 extends Thread
{
public void run()
{

int x3;
int y1,y2,y3;
try
{
do
{
y1=hit.b1.getY();
y2=hit.b2.getY();
x3=hit.b3.getX();
y3=hit.b3.getY();
x3=x3+10;
if(y3>80&&hit.f2==1) 
{
y3=y3-8;
}
else
{
hit.f2=0;
}
if(y3<710&&hit.f2==0)
{
y3=y3+8;
}
else
{
hit.f2=1;
}
hit.b3.setBounds(x3,y3,25,25);

if((x3>=1300)&&(y3+25>=y2)&&(y3<=y2+100))
{
mythread2 t2=new mythread2();
t2.start();

break;
}

if(x3>=1340)
{
hit.b3.setBounds(40,y1+40,25,25);
hit.flag1=1;
hit.score1=hit.score1+1;
hit.l1.setText("Score 1="+hit.score1);
break;
}
Thread.sleep(30);
}while(x3!=1350);

}
catch(Exception e)
{
}
}

}
