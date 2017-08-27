import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JPanel implements ActionListener{
	private JFrame f2;
	private int[][] board;
    private int dim;
    public int currentPlayer;
    public boolean matchDrawn;
    public int tickCount=0;
    Board(int dimx){
    	this.currentPlayer=1;
    	this.matchDrawn=false;
    	this.dim=dimx;
    	this.board = new int[dim][dim];
    	for(int r = 0; r < dim; r++){
            for(int c = 0; c < dim; c++){
            	this.board[r][c]=dim*r+c+3;
            }
        }
    	f2 = new JFrame("TicTacToc");
        JPanel p2 = new JPanel();
        p2.setPreferredSize(new Dimension(400, 400)); 
        p2.setLayout(new GridLayout(dim, dim));
        for(int r = 0; r < dim; r++){
            for(int c = 0; c < dim; c++){
                JButton button= new JButton();   //ChangingButton(r, c, board);
                button.addActionListener(this);
                p2.add(button);
            }
        }
        f2.add(p2);
        f2.pack();
        f2.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        //  fModel[fX][fY] = b.currentPlayer;                
        JButton b=(JButton)(e.getSource());
        b.setEnabled(false);
        this.board[b.getBounds().y/133][b.getBounds().x/133]=this.currentPlayer;
        this.tickCount++;
        System.out.println(b.getBounds().y/133+" "+b.getBounds().x/133);
          this.updateNameFromModel(b);
      }
    private void updateNameFromModel(JButton b) {
    	
        b.setText(""+this.currentPlayer);
        if(this.currentPlayer==1)b.setBackground(Color.BLUE);
        else b.setBackground(Color.RED);
        if(this.tickCount==this.dim*this.dim){
    		this.matchDrawn=true;
    		String s="It is a draw !";
        	f2.dispose();
        	Result game=new Result(s);
   
    	}
        if(Check.checkWinner(this.dim, this.dim, this.board)){
        	String s="player: "+this.currentPlayer+" wins";
        	f2.dispose();
        	Result game=new Result(s);
       }
        this.currentPlayer=(this.currentPlayer==1)?2:1;
        
    }
}
