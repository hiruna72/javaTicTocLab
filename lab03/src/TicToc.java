/*
    Tic Toc Game
 */

/**
 *
 * @author e14302
 * 25.08.2017
 */

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;

import javax.swing.Timer; //for timer

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class TicToc extends JPanel {
    public static int currentPlayer=1;
    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        JFrame frame = new JFrame("TIC TOC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new Frame();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    } 
    
    
}
