import java.awt.*;
import java.io.*;
class mythread2 extends Thread
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
x3=x3-10;
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

if((x3<=30)&&(y3+25>=y1)&&(y3<=y1+100))
{
mythread1 t1=new mythread1();
t1.start();

break;
}
if(x3<=10)
{
hit.b3.setBounds(1285,y2+40,25,25);
hit.flag2=1;
hit.score2=hit.score2+1;
hit.l2.setText("Score 2="+hit.score2);
break;
}
Thread.sleep(30);
}while(x3!=10);

}
catch(Exception e)
{
}
}

}
