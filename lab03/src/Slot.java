

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

public class Slot extends JPanel {
    private boolean state;
    JButton button;
    Slot(int xCord,int yCord){  
        
        super(new BorderLayout());
        Boolean state = false; 
        setLayout (null);    
        button = new JButton("Try");
        button.setPreferredSize(new Dimension(100, 100));
        button.setLocation(xCord, yCord);
        //add(button, BorderLayout.CENTER);
        MyEvent Trig=new MyEvent(this);
        button.addActionListener(Trig);
    }
    private void setPlayer(){        
       // this.button.setText(TicToc.currentPlayer+"");
      //  TicToc.currentPlayer=(TicToc.currentPlayer==1)?1:2;
    }
    public void changeState(){
        this.state=!this.state;
        this.setPlayer();
    }
    
}
