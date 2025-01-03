package MenuScreens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu {
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;

    JFrame c;
    JLabel label1,label2;
    JPanel pp;
    JButton btn1,btn2,btn3;
    Font f,f1;

    public Menu(){
        initComponenets();
    }
    public void initComponenets(){
        c = new JFrame("Data Structure and Algorithm Visualizer");
        
        c.setLayout(null);
        c.setBackground(new Color(46,80,119));
        c.setBounds(0,0,WIDTH,HEIGHT);
        c.setLocationRelativeTo(null);                  //Sets the frame to the middle of the screen
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pp = new JPanel();
        pp.setBounds(0,0, WIDTH, HEIGHT);
        pp.setBackground(new Color(46,80,119));
        pp.setLayout(null);


        f=new Font("Futura",Font.BOLD,40);
        f1=new Font("Century Gothic",Font.PLAIN,20);
        label2=new JLabel("AlgoViz", SwingConstants.CENTER);
        label2.setBounds((WIDTH/2)-500,100,1000,50);
        label2.setFont(f);
        label2.setForeground(Color.white);
        label1=new JLabel("Data Structures and Algorithm Visualizer", SwingConstants.CENTER);
        label1.setBounds((WIDTH/2)-500,100,1000,150);
        label1.setFont(f);
        label1.setForeground(Color.white);
        pp.add(label2);
        pp.add(label1);

        btn1=new JButton("Data Structures");
        btn1.setBounds((WIDTH/2)-150,250,300,50);
        btn1.setForeground(Color.black);
        btn1.setBackground(new Color(220,228,201));
        btn1.setFont(f1);
        btn1.setFocusable(false);
        btn1.setBorder(null);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.dispose();
                new DataStructure();
            }
        });
        //When the button is hovered
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (btn1.isEnabled())
                    btn1.setBackground(new Color(220,228,201).darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1.setBackground(new Color(220,228,201));
            }
        });
        pp.add(btn1);

        btn2=new JButton("Algorithms");
        btn2.setBounds((WIDTH/2)-150,325,300,50);
        btn2.setForeground(Color.black);
        btn2.setBackground(new Color(220,228,201));
        btn2.setFont(f1);
        btn2.setFocusable(false);
        btn2.setBorder(null);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.dispose();
                new Algorithms();
            }
        });
        //When the button is hovered
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (btn2.isEnabled())
                    btn2.setBackground(new Color(220,228,201).darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2.setBackground(new Color(220,228,201));
            }
        });
        pp.add(btn2);

        btn3=new JButton("Exit");
        btn3.setBounds((WIDTH/2)-150,400,300,50);
        btn3.setForeground(Color.black);
        btn3.setBackground(new Color(220,228,201));
        btn3.setFont(f1);
        btn3.setFocusable(false);
        btn3.setBorder(null);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //When the button is hovered
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (btn3.isEnabled())
                    btn3.setBackground(new Color(220,228,201).darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3.setBackground(new Color(220,228,201));
            }
        });
        pp.add(btn3);

        pp.setVisible(true);
        c.add(pp);

        c.setVisible(true);

    }
    public static void main(String[] args){
        new Menu();
    }
}