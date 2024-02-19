package org.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainUI extends JFrame {
    public MainUI(){
        super();
        setTitle("Swing Jokes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setResizable(false);
        getContentPane().add(new MainPanel());
        setLocationRelativeTo(null);
        setVisible(true);
    }
    class MainPanel extends JPanel{
        public MainPanel(){
            super(true);
            JButton btngetJokes = new JButton("Get Jokes");
            btngetJokes.setMaximumSize(getMaximumSize());
            JLabel lbljokes = new JLabel("");
            lbljokes.setPreferredSize(new Dimension(300,300));
            add(lbljokes,BorderLayout.CENTER);
            add(btngetJokes,BorderLayout.SOUTH);
        }
        
    }
    public static void main(String[] args){
        new MainUI();
    }
}
