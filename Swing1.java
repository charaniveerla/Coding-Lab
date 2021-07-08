import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class Swing1 extends JFrame implements ActionListener
{
JPanel p,apl;
JTextField jtf;
JButton buttons[];
JButton clear;
JButton enter;
//Global Variables for strong reasons.
String originalpswd=new String("1234");
    String pswd=new String();
boolean res;

private Swing1()
    {
//    Create it
p = new JPanel();
jtf= new JTextField("CLOSED");
buttons = new JButton[11];


for(int i =0;i<9;i++)
        {
buttons[i] = new JButton(String.valueOf(i+1));
        }
clear = new JButton("CLEAR");
buttons[9]= new JButton(String.valueOf(0));
enter = new JButton("ENTER");
//Configure it
add(p);
BorderLayout bl= new BorderLayout();
p.setLayout(bl);

p.add("North",jtf);
//        jtf.setBounds(0,0,300,50);
for(int i=0;i<10;i++)
      {
buttons[i].addActionListener(this);
      }
clear.addActionListener(this);
enter.addActionListener(this);

//        Create another panel that will contain 12 buttons
//       Set the layout manager for this panel
apl= new JPanel();
GridLayout gl = new GridLayout(4,3);
apl.setLayout(gl);
//Add window controls to the panel pl
for(int i=0;i<10;i++)
        {
apl.add(buttons[i]);
        }
apl.add(clear);
apl.add(buttons[9]);
apl.add(enter);
//        Add the panel apl to center area of the window
p.add("Center",apl);
        pack();
setSize(250,250);
        setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
public boolean checkPIN(String pin)
    {
if(pin.equals(originalpswd))
        {
return true;
        }
else
{
return  false;
        }
    }
public void unlock()
    {
jtf.setText("OPENED");
pswd="";
    }
public void lock()
    {
jtf.setText("WRONG PIN");
    }

@Override
public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();


// if the value is a number
if ((s.charAt(0) >= '0' &&s.charAt(0) <= '9'))
        {   pswd = pswd + s;
            String temp = "";

for (int i = 0; i<pswd.length(); i++)
                temp += "*";
jtf.setText(temp);

        }
else{
if(s.equals("CLEAR"))
            {
pswd="";
jtf.setText(" ");
            }
else
{
//                Connect to a function for checking the pswd
res= checkPIN(pswd);
if(res)
               {
pswd="";
                   unlock();

               }
else
{
pswd="";
                   lock();
               }
            }

        }

    }

public static  void main(String[] args)
    {
        Swing1 win = new Swing1();
    }
}