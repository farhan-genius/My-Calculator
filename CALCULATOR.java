
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CALCULATOR extends JFrame implements ActionListener {
    JFrame frame ;
    Container c ;
    JTextField t ;

    String s,s1="", s2="",first="",second="";
    JButton b1 ;
    JButton b2 ;
    JButton b3 ;
    JButton b4 ;
    JButton b5 ;
    JButton b6 ;
    JButton b7 ;
    JButton b8 ;
    JButton b9 ;
    JButton b10 ;
    JButton b11 ;
    JButton b12 ;
    JButton b13 ;
    JButton b14 ;
    JButton b15 ;
    JButton b16 ;

    Double result;

    CALCULATOR(){
        frame = new JFrame("Simple Calculator");

        c = new Container();

        c = frame.getContentPane();
        c.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));

        t = new JTextField();
        // t.setBounds(0, 0, 300, 1000);
        t.setFont(new Font("calibri", Font.BOLD, 30));
        t.setSize(100, 300);
        JLabel l  = new JLabel("My Simple Calculator");

        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("C");
        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("/");
        b9 = new JButton("7");
        b10 = new JButton("8");
        b11 = new JButton("9");
        b12 = new JButton("*");
        b13 = new JButton(".");
        b14 = new JButton("-");
        b15 = new JButton("+");
        b16 = new JButton("=");
        

        b1.addActionListener(this); 
        b2.addActionListener(this); 
        b3.addActionListener(this); 
        b4.addActionListener(this); 
        b5.addActionListener(this); 
        b6.addActionListener(this); 
        b7.addActionListener(this); 
        b8.addActionListener(this); 
        b9.addActionListener(this); 
        b10.addActionListener(this); 
        b11.addActionListener(this); 
        b12.addActionListener(this); 
        b13.addActionListener(this); 
        b14.addActionListener(this); 
        b15.addActionListener(this); 
        b16.addActionListener(this); 

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);
        

        c.add(t,BorderLayout.NORTH );
        c.add(panel,BorderLayout.CENTER);
        c.add(l,BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        panel.setVisible(true);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) 
    {
    s = e.getActionCommand();
    if(e.getSource() == b1)
        {
            s1 += s;
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b2)
        {
            s1 += s;
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b3)
        {
            s1 += s;
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b4)
        {
            s1 = s = s2 = first = second = "";
            t.setText(s1);
        }
        else if(e.getSource() == b5)
        {
            s1 += s;
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b6)
        {
            s1 += s;
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b7)
        {
            s1 += s;
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b8)
        {
            first =  s1;
            s2 = s;
            s1 = "";
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b9)
        {
            s1 += s;
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b10)
        {
            s1 += s;
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b11)
        {
            s1 += s;
            t.setText(first + s2 + s1);
        }
        
        else if(e.getSource() == b12)
        {
         
            first =  s1;
            s2 = s;
            s1 = "";
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b13)
        {
            s1 += s;
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b14)
        {
            
            first =  s1;
            s2 = s;
            s1 = "";
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b15)
        {
            
            first =  s1;
            s2 = s;
            s1 = "";
            t.setText(first + s2 + s1);
        }
        else if(e.getSource() == b16)
        {
            second = s1;
            if( s2 == "+" )
            {
                result = Double.parseDouble(first) + Double.parseDouble(second);
                t.setText("" + result);
                s1 = s = s2 = first = second = "";
            }
            else if( s2 == "-" )
            {
                result = Double.parseDouble(first) - Double.parseDouble(second);
                t.setText("" + result);
                s1 = s = s2 = first = second = "";
            }
            else if( s2 == "*" )
            {
                result = Double.parseDouble(first) * Double.parseDouble(second);
                t.setText("" + result);
                s1 = s = s2 = first = second = "";
                
            }
            else if( s2 == "/" )
            {
                result = Double.parseDouble(first) / Double.parseDouble(second);
                t.setText("" + result);
                s1 = s = s2 = first = second = "";
            }
        }
    }
}

