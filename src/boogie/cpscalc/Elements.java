package boogie.cpscalc;

import javax.swing.*;
import java.awt.*;

public interface Elements {

    JLabel heading = new JLabel("Clicks Per Second Calculator",null,SwingConstants.CENTER);
    JButton clicker = new JButton(Main.clicktext);
    JLabel clicks = new JLabel(Integer.toString(Main.clickscount),null,SwingConstants.CENTER);
    JComboBox choice = new JComboBox(Main.durations);

}
