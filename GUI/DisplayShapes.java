// Java program that allows the user to draw lines, rectangles and ovals.

import java.awt.*;
import javax.swing.JFrame;

public class DisplayShapes extends Canvas{
    public void paint(Graphics g){
        setBackground(Color.green);
        g.setColor(Color.red);
        g.fillRect(40, 40, 150, 60);
        g.setColor(Color.yellow);
        g.fillOval(60, 150, 40, 60);

        g.setColor(Color.black);
        g.drawLine(10, 10, 400, 300);
        g.drawLine(500, 30, 20, 450);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        DisplayShapes obj = new DisplayShapes();
        f.add(obj);
        f.setSize(600,600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}