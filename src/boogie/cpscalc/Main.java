package boogie.cpscalc;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main implements Elements{

    public Main(){
        JFrame frame = new JFrame();

        clicker.setBounds(135,100,160,90);
        heading.setBounds(135,0, 180,50);

        frame.add(clicker);
        frame.add(heading);
        frame.setTitle("CPS Calculator");
        frame.setResizable(false);
        frame.setSize(450,450);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
	    new Main();
    }
}
