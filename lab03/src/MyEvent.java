import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyEvent implements ActionListener {
    private static Slot currentSlot;
    
      

    MyEvent(Slot aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.currentSlot=aThis;
    }
    
    public void actionPerformed(ActionEvent e) {
        this.currentSlot.changeState();
    }
}
