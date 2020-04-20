package boogie.cpscalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements Elements{

    static String clicktext = "Start";
    static int clickscount = 0;
    static String durations[] = {"5","3","10","30"};

    public Main(){
        JFrame frame = new JFrame();

        clicker.setBounds(135,65,180,90);
        heading.setBounds(50,0, 350,50);
        clicks.setBounds(100,150,250,90);
        choice.setBounds(150,220,150,30);

        heading.setFont(new java.awt.Font("Arial", Font.BOLD,22));
        clicker.setFont(new java.awt.Font("Arial", Font.BOLD,24));
        clicks.setFont(new java.awt.Font("Arial", Font.BOLD,30));
        choice.setFont(new java.awt.Font("Arial", Font.BOLD,18));

        frame.add(clicks);
        frame.add(choice);
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
                if(clicker.getText()=="Start"){
                    clicker.setText("Click Here!!");
                    clickscount++;
                    clicks.setText(Integer.toString(clickscount));
                    new java.util.Timer().schedule(
                            new java.util.TimerTask() {
                                @Override
                                public void run() {
                                    double cps = Integer.parseInt(clicks.getText()) / (getTimeDuration()/1000.0);
                                    String type = "You are a " + getcpsClass(cps);
                                    String message = "Your cps is " + cps;
                                    infoBox(message,type);

                                    clickscount=0;
                                    clicks.setText(Integer.toString(clickscount));
                                    clicker.setText("Start");
                                }
                            },
                            getTimeDuration()
                    );
                }
                else if(clicker.getText()=="Click Here!!"){
                    clickscount++;
                    clicks.setText(Integer.toString(clickscount));
                }
            }
        });
    }

    public static void main(String[] args) {
	    new Main();
    }

    public void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public int getTimeDuration(){
        String current = (String)choice.getSelectedItem();
        int current_int = Integer.parseInt(current);
        current_int *=1000;

        return current_int;
    }
    public String getcpsClass(double cps){

        String cpsclass = "";
        if(cps < 6) cpsclass = "Turtle";
        else if(cps < 10) cpsclass = "Llama";
        else cpsclass = "Cheetah";

        return cpsclass;
    }
}
