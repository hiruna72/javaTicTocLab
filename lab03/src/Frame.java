

/**
 *
 * @author e14302
 */
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JPanel{
    private Slot [] TickButtos= new Slot[9];
    Frame(){
        for(int i=0;i<9;i++){
            this.TickButtos[i]=new Slot(i%9,i%9);
        }
    }
}
