package boogie.cpscalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements Elements{

    static String clicktext = "Start";
    static int clickscount = 0;

    public Main(){
        JFrame frame = new JFrame();

        clicker.setBounds(135,65,180,90);
        heading.setBounds(50,0, 350,50);
        clicks.setBounds(100,150,250,90);

        heading.setFont(new java.awt.Font("Arial", Font.BOLD,22));
        clicker.setFont(new java.awt.Font("Arial", Font.BOLD,32));
        clicks.setFont(new java.awt.Font("Arial", Font.BOLD,30));

        frame.add(clicks);
        frame.add(clicker);
        frame.add(heading);
        frame.setTitle("CPS Calculator");
        frame.setResizable(false);
        frame.setSize(450,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clicker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
	    new Main();
    }
}
