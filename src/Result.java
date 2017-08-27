import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Result extends JPanel implements ActionListener {
	JFrame result;
	JButton b;
	Result(String s){
		result = new JFrame("Game Result");
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(3, 1));
        p2.setPreferredSize(new Dimension(200, 100));
        JLabel score=new JLabel(s);
        score.setHorizontalAlignment(0);
        b = new JButton("New Game");
        JButton c = new JButton("Exit");
        b.addActionListener(this);
        c.addActionListener(this);
        b.setBackground(Color.darkGray);
        b.setForeground(Color.WHITE);
        c.setBackground(Color.darkGray);
        c.setForeground(Color.WHITE);
        p2.add(score);
        p2.add(b);
        p2.add(c);
        result.add(p2);
        result.pack();
        result.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
        System.out.println("winner is here");
        result.dispose();
        if(e.getSource()==b){
        	Board newBoard = new Board(3);
        	//newBoard=null;
        }
    }
}
