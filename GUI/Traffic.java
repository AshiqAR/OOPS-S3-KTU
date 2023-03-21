import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class TrafficSignal implements ActionListener{
    JFrame f;
    JRadioButton r1,r2,r3;
    JLabel l,l1;
    JPanel p1,p2,p3,p31,p32,p33;

    TrafficSignal(){
        f = new JFrame("Traffic Light");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setP1();
        setP2();
        setP3();
        p1.setBounds(20,10,200,40);
        p2.setBounds(10,60,300,20);
        p3.setBounds(30,90,100,30);
       

        f.add(p1);
        f.add(p2);
        f.add(p3);

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void setP3(){
        p3 = new JPanel();
        p3.setSize(150,30);
        p31 = new JPanel();
        p32 = new JPanel();
        p33 = new JPanel();

        p31.setSize(50,30);
        p32.setSize(50,30);
        p33.setSize(50,30);
        p3.add(p31);
        p3.add(p32);
        p3.add(p33);
        
        p3.setLayout(new GridLayout(1,3));
        p3.setVisible(true);
    }

    public void setP1(){
        p1 = new JPanel();
        l = new JLabel("Traffic Signal");
        l.setBounds(20,5,100,20);
        p1.add(l);
        p1.setSize(200,30);
        p1.setLayout(null);
        p1.setVisible(true);
    }

    public void setP2(){
        p2 = new JPanel();
        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Green");
        r3 = new JRadioButton("Yellow");
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);bg.add(r2);bg.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        
        p2.setSize(200,50);
        p2.add(r1);p2.add(r2);
        p2.add(r3);
        
        p2.setLayout(new GridLayout(1,3));
        p2.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if(r1.isSelected()){
            p31.setBackground(Color.red);
            p32.setBackground(Color.white);
            p33.setBackground(Color.white);
        }
        else if(r2.isSelected()){
            p31.setBackground(Color.white);
            p32.setBackground(Color.green);
            p33.setBackground(Color.white);
        }
        else if(r3.isSelected()){
            p31.setBackground(Color.white);
            p32.setBackground(Color.white);
            p33.setBackground(Color.yellow);
        }
    }
}

public class Traffic{
    public static void main(String[] args) {
        new TrafficSignal();
    }
}
