import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseEv extends JFrame implements MouseListener{
    JTextArea textaAr;

    MouseEv(){
        JPanel p = new JPanel(new FlowLayout());
        textaAr = new JTextArea(30,40);
        p.add(textaAr);
        p.setVisible(true);
        add(p,BorderLayout.CENTER);
        textaAr.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e){
        String s = "Mouse Clicked \n" +"X Cordinate: "+e.getX()+" Y Cordinate "+e.getY();
        textaAr.setText(s);
    }
    public void mouseEntered(MouseEvent e){
        String s = "Mouse Entered \n" +"X Cordinate: "+e.getX()+" Y Cordinate "+e.getY();
        textaAr.setText(s);
    }
    public void mousePressed(MouseEvent e){
        String s = "Mouse Pressed \n" +"X Cordinate: "+e.getX()+" Y Cordinate "+e.getY();
        textaAr.setText(s);
    }
    public void mouseExited(MouseEvent e){
        String s = "Mouse Exited";
        textaAr.setText(s);
    }
    public void mouseReleased(MouseEvent e){
        String s = "Mouse Released \n" +"X Cordinate: "+e.getX()+" Y Cordinate "+e.getY();
        textaAr.setText(s);
    }
}

public class MouseEventHandle {
    public static void main(String[] args) {
        MouseEv mobj = new MouseEv(); 
        mobj.setSize(500,500);
        mobj.setVisible(true);
        mobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
