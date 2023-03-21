import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CalcuProgram extends JFrame implements ActionListener{
    JFrame f = new JFrame("Calculator");

    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();
    JTextField tf3 = new JTextField();
    JTextField tf4;

    JLabel l1 = new JLabel("1st Number: ");
    JLabel l2 = new JLabel("2nd Number: ");
    JLabel l3 = new JLabel("Ans: ");

    JPanel textPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JPanel ansPanel = new JPanel();

    int n1=0,n2=0,ans=0;
    String oper = new String();

    JButton b1,b2,b3,b4,ansButton;

    public void settextPanel(){
        l1.setBounds(20,0,120,20);      tf1.setBounds(150, 0, 50, 20);
        l2.setBounds(20,30,120,20);      tf2.setBounds(150, 30, 50, 20);
        l3.setBounds(20,70,120,20);      tf3.setBounds(150, 70, 50, 20);

        // tf1.setText("0");   
        tf1.addActionListener(this);
        // tf2.setText("0");   
        tf2.addActionListener(this);
        // tf3.setText("0");   
        tf3.addActionListener(this);
        tf4 = new JTextField();
        tf4.setBounds(20,100,200,20);
        tf4.addActionListener(this);

        textPanel.add(l1);  textPanel.add(l2);  textPanel.add(l3);
        textPanel.add(tf1); textPanel.add(tf2); textPanel.add(tf3); textPanel.add(tf4);
        textPanel.setLayout(null);
        textPanel.setVisible(true);
    }
    public void setButtonPanel(){
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("%");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        // ansButton = new Button("ans");
        
        // buttonPanel.add(ansButton);

        buttonPanel.setLayout(new GridLayout(2,2));
        buttonPanel.add(b1);buttonPanel.add(b2);buttonPanel.add(b3);buttonPanel.add(b4);
        buttonPanel.setVisible(true);
    }

    public void setAnsPanel(){
        ansButton = new JButton("=");
        ansButton.setBounds(0,0,100,20);
        ansButton.addActionListener(this);

        ansPanel.add(ansButton);
        ansPanel.setLayout(new GridLayout());
        ansPanel.setVisible(true);
    }
    

    CalcuProgram(){
        settextPanel();
        setButtonPanel();
        setAnsPanel();
        buttonPanel.setBounds(240,10,100,50);
        textPanel.setBounds(10,10, 220, 150);
        ansPanel.setBounds(240, 80, 100, 20);
        f.add(textPanel);
        f.add(buttonPanel);
        f.add(ansPanel);
        f.setSize(400,200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        try{

            n1 = Integer.parseInt(tf1.getText());
            n2 = Integer.parseInt(tf2.getText());

            if(s.equals("+"))
                oper = "+";
            else if(s.equals("-"))
                oper = "-";
            else if(s.equals("*"))
                oper = "*";
            else if(s.equals("%"))
                oper = "%";

            
            if(s.equals("=")){
                
            
                switch(oper){
                    case "+":
                        ans = n1+n2;
                        break;
                    case "-":
                        ans = n1-n2;    
                        break;
                    case "*":
                        ans = n1*n2;
                        break;
                    case "%":
                        ans = n1%n2;
                        break;
                    default:
                        tf4.setText("invalid");
                        break;
                }
                tf3.setText(ans+" ");
                tf4.setText(n1+ " "+ oper+" "+n2 +" = "+ ans);
            }
        }
        catch(Exception ec){
            tf3.setText(" ");
            tf4.setText("Exception: "+ec.getMessage());
        }
        

    }

}

public class Calculator{
    public static void main(String[] args) {
        new CalcuProgram();
    }
}
