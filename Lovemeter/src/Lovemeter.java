import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Lovemeter extends Applet implements ActionListener
{
 Label l,n1,n2,s,t3;
 TextField t1,t2;
 Button c,n;
 public void init()
 {
     l=new Label("WELCOME TO LOVEMETER");
     n1=new Label("ENTER FIRST NAME");
     n2=new Label("ENTER PARTNERS NAME");
     s=new Label("RESULT");
     t1=new TextField();
     t2=new TextField();
     t3=new Label("");
     c=new Button("CHECK");
     n=new Button("NEXT");
     add(l);
     add(n1);add(t1);
     add(n2);add(t2);
     add(s);add(t3);
     setLayout(null);
     resize (500,300);
     l.setBounds(130,50,170,20);
     n1.setBounds(30,100,120,20);
     t1.setBounds(190,100,170,20);
     n2.setBounds(30,140,150,20);
     t2.setBounds(190,140,170,20);
     c.setBounds(130,170,50,20);
     n.setBounds(190,170,50,20);
     s.setBounds(130,210,50,30);
     t3.setBounds(190,210,170,20);
     t3.setBackground(Color.red);
     //setLayout(new GridLayout(3,2));
     setBackground(Color.red);
     add(c);
     add(n);
     c.addActionListener(this);
     n.addActionListener(this);
     
 }
 public void actionPerformed(ActionEvent x)
 {
     if (x.getSource()==c)
     {
         String s1,s2,s3;
         s1=t1.getText();
         s2=t2.getText();
         int r=((int)s1.charAt(2)-(int)s2.charAt(2))*10;
         if(r<0)
         r=-r;
         do
         {
           if(r>100)
              r=r/10;
          }
          while(r>100);
         s3=String.valueOf(r);
         s3+="%";
         t3.setText(s3);
     }
     if(x.getSource()==n)
     {
         t1.setText("");
         t2.setText("");
         t3.setText("");
     }
 }
 
}