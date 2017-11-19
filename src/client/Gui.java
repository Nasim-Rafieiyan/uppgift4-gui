package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JFrame implements ActionListener {

    //variables:
    int click = 0;
    Database d = new Database();
    JFrame frame = new JFrame();
    //Frame1:
    JPanel p0 = new JPanel();
    JLabel topLabel = new JLabel("Quizkampen", SwingConstants.CENTER);
    JButton startButton = new JButton("Starta nytt spel");
    JLabel centerLabel = new JLabel("<html>Grupp E-Java17<br>&ensp;&ensp;&ensp;Version:1</html>", SwingConstants.CENTER);
    JLabel bottomLabel = new JLabel("");
    //Frame2:
    JPanel p1 = new JPanel();
    JLabel you = new JLabel("Din poäng", SwingConstants.CENTER);
    JLabel scoreLabel = new JLabel("0 - 0", SwingConstants.CENTER);
    JLabel otherPlayer = new JLabel("Tävlarens poäng", SwingConstants.CENTER);
    JPanel p2 = new JPanel();
    JLabel category = new JLabel("kategori", SwingConstants.CENTER);
    JButton question = new JButton("fråga");
    JPanel p3 = new JPanel();
    JButton alternative1 = new JButton("alternativ 1");
    JButton alternative2 = new JButton("alternativ 2");
    JButton alternative3 = new JButton("alternativ 3");
    JButton alternative4 = new JButton("alternativ 4");

    //SteelBlue: HSB(199,82%,67%) = RGB(31,126,171)
    float h_b = (float) 0.55;  //(199/360=0.55)
    float s_b = (float) 0.82;
    float b_b = (float) 0.67;
    //YellowGreen: HSB(89,70%,76%) = RGB(127,193,58)
    float h_g = (float) 0.25;  //(89/360=0.25)
    float s_g = (float) 0.70;
    float b_g = (float) 0.76;

    public Gui() {
        //addActionListener
        startButton.addActionListener(this);

        p0.setSize(480, 640);
        p0.setOpaque(true);
        add(p0);
        //Layout of p0
        p0.setLayout(new GridBagLayout());
        GridBagConstraints layout1 = new GridBagConstraints();
        layout1.fill = GridBagConstraints.HORIZONTAL;
        layout1.gridx = 0;
        layout1.gridy = 0;
        p0.add(topLabel, layout1);
        layout1.fill = GridBagConstraints.HORIZONTAL;
        layout1.gridx = 0;
        layout1.gridy = 1;
        p0.add(startButton, layout1);
        layout1.fill = GridBagConstraints.HORIZONTAL;
        layout1.gridx = 0;
        layout1.gridy = 2;
        p0.add(centerLabel, layout1);
        layout1.fill = GridBagConstraints.HORIZONTAL;
        layout1.gridx = 0;
        layout1.gridy = 3;
        p0.add(bottomLabel, layout1);
        //to style topLabel
        topLabel.setBackground(Color.getHSBColor(h_b, s_b, b_b));
        topLabel.setOpaque(true);
        topLabel.setForeground(Color.WHITE);
        topLabel.setFont(new Font("Britannic Bold", Font.BOLD, 60));
        topLabel.setPreferredSize(new Dimension(480, 160));
        //to style startButton
        startButton.setFocusPainted(false);
        startButton.setBackground(Color.getHSBColor(h_g, s_g, b_g));
        startButton.setPreferredSize(new Dimension(480, 80));
        startButton.setForeground(Color.WHITE);
        startButton.setFont(new Font("Arial", Font.BOLD, 40));
        //to style centerLabel
        centerLabel.setBackground(Color.getHSBColor(h_b, s_b, b_b));
        centerLabel.setOpaque(true);
        centerLabel.setForeground(Color.WHITE);
        centerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        centerLabel.setPreferredSize(new Dimension(480, 200));
        //to style bottomLabel
        bottomLabel.setBackground(Color.getHSBColor(h_b, s_b, b_b));
        bottomLabel.setOpaque(true);
        bottomLabel.setPreferredSize(new Dimension(480, 200));
        //JFrame
        getContentPane().setBackground(java.awt.Color.getHSBColor(h_b, s_b, b_b));
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

    }

    public void startaFrame2() {
        //addActionListener
        alternative1.addActionListener(this);
        alternative2.addActionListener(this);
        alternative3.addActionListener(this);
        alternative4.addActionListener(this);

        //mainLayout for all panels (p1,p2 and p3)
        setLayout(new GridBagLayout());
        GridBagConstraints mainLayout = new GridBagConstraints();
        mainLayout.fill = GridBagConstraints.HORIZONTAL;
        mainLayout.gridx = 0;
        mainLayout.gridy = 0;
        add(p1, mainLayout);
        mainLayout.fill = GridBagConstraints.HORIZONTAL;
        mainLayout.gridx = 0;
        mainLayout.gridy = 1;
        add(p2, mainLayout);
        mainLayout.fill = GridBagConstraints.HORIZONTAL;
        mainLayout.gridx = 0;
        mainLayout.gridy = 2;
        add(p3, mainLayout);
        //Layout for p1
        p1.setLayout(new GridBagLayout());
        GridBagConstraints L1 = new GridBagConstraints();
        L1.fill = GridBagConstraints.HORIZONTAL;
        L1.gridx = 0;
        L1.gridy = 0;
        p1.add(you, L1);
        L1.fill = GridBagConstraints.HORIZONTAL;
        L1.gridx = 1;
        L1.gridy = 0;
        p1.add(scoreLabel, L1);
        L1.fill = GridBagConstraints.HORIZONTAL;
        L1.gridx = 2;
        L1.gridy = 0;
        p1.add(otherPlayer, L1);
        //to style "you" label
        you.setBackground(Color.getHSBColor(h_b, s_b, b_b));
        you.setOpaque(true);
        you.setForeground(Color.WHITE);
        you.setFont(new Font("Arial", Font.BOLD, 16));
        you.setPreferredSize(new Dimension(160, 80));
        //to style "scoreLabel" label
        scoreLabel.setBackground(Color.getHSBColor(h_g, s_g, b_g));
        scoreLabel.setOpaque(true);
        scoreLabel.setForeground(Color.WHITE);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 60));
        scoreLabel.setPreferredSize(new Dimension(160, 80));
        //to style "otherPlayer" label
        otherPlayer.setBackground(Color.getHSBColor(h_b, s_b, b_b));
        otherPlayer.setOpaque(true);
        otherPlayer.setForeground(Color.WHITE);
        otherPlayer.setFont(new Font("Arial", Font.BOLD, 16));
        otherPlayer.setPreferredSize(new Dimension(160, 80));
        //Layout for p2
        p2.setLayout(new GridBagLayout());
        GridBagConstraints L2 = new GridBagConstraints();
        L2.fill = GridBagConstraints.HORIZONTAL;
        L2.gridx = 0;
        L2.gridy = 0;
        p2.add(category, L2);
        L2.fill = GridBagConstraints.HORIZONTAL;
        L2.gridx = 0;
        L2.gridy = 1;
        p2.add(question, L2);
        //to style "category" label
        category.setBackground(Color.WHITE);
        category.setOpaque(true);
        category.setForeground(Color.getHSBColor(h_b, s_b, b_b));
        category.setFont(new Font("Arial", Font.BOLD, 40));
        category.setPreferredSize(new Dimension(480, 80));
        //to style "question" label
        question.setBackground(Color.LIGHT_GRAY);
        question.setOpaque(true);
        question.setForeground(Color.WHITE);
        question.setFont(new Font("Arial", Font.BOLD, 15));
        question.setPreferredSize(new Dimension(480, 240));
        //Layout for p3
        p3.setLayout(new GridBagLayout());
        GridBagConstraints L3 = new GridBagConstraints();
        L2.fill = GridBagConstraints.HORIZONTAL;
        L2.gridx = 0;
        L2.gridy = 0;
        p3.add(alternative1, L3);
        L3.fill = GridBagConstraints.HORIZONTAL;
        L3.gridx = 1;
        L3.gridy = 0;
        p3.add(alternative2, L3);
        L3.fill = GridBagConstraints.HORIZONTAL;
        L3.gridx = 0;
        L3.gridy = 1;
        p3.add(alternative3, L3);
        L3.fill = GridBagConstraints.HORIZONTAL;
        L3.gridx = 1;
        L3.gridy = 1;
        p3.add(alternative4, L3);
        //to edit alternative1
        alternative1.setFocusPainted(false);
        alternative1.setBackground(Color.DARK_GRAY);
        alternative1.setPreferredSize(new Dimension(240, 120));
        alternative1.setForeground(Color.WHITE);
        alternative1.setFont(new Font("Arial", Font.BOLD, 15));
        //to edit alternative2
        alternative2.setFocusPainted(false);
        alternative2.setBackground(Color.DARK_GRAY);
        alternative2.setPreferredSize(new Dimension(240, 120));
        alternative2.setForeground(Color.WHITE);
        alternative2.setFont(new Font("Arial", Font.BOLD, 15));
        //to edit alternative3
        alternative3.setFocusPainted(false);
        alternative3.setBackground(Color.DARK_GRAY);
        alternative3.setPreferredSize(new Dimension(240, 120));
        alternative3.setForeground(Color.WHITE);
        alternative3.setFont(new Font("Arial", Font.BOLD, 15));
        //to edit alternative4
        alternative4.setFocusPainted(false);
        alternative4.setBackground(Color.DARK_GRAY);
        alternative4.setPreferredSize(new Dimension(240, 120));
        alternative4.setForeground(Color.WHITE);
        alternative4.setFont(new Font("Arial", Font.BOLD, 15));
        //setSize(480, 640);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //If you press the start button
        if (ae.getActionCommand().equals("Starta nytt spel")) {
            p0.invalidate();
            p0.setVisible(false);
            p0.removeAll();
            frame.getContentPane().remove(p0);
            p0 = null;

            startaFrame2();
            scoreLabel.setText("0 - 0");
            category.setText(d.f0[0]);
            question.setText(d.f0[1]);
            alternative1.setText(d.f0[2]);
            alternative2.setText(d.f0[3]);
            alternative3.setText(d.f0[4]);
            alternative4.setText(d.f0[5]);
        }
        //If you press the first alternative
        if (ae.getSource() == alternative1) {
            Database d = new Database();
            if (click % 3 == 0) {
                if (ae.getActionCommand().equals(d.qoa.get(0)[6])) {
                    alternative1.setBackground(Color.getHSBColor(h_g, s_g, b_g));
                } else {
                    alternative1.setBackground(Color.RED);
                }
                new Timer(3000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Database d = new Database();
                        alternative1.setBackground(Color.DARK_GRAY);
                        scoreLabel.setText("1 - 2");
                        category.setText(d.qoa.get(1)[0]);
                        question.setText(d.qoa.get(1)[1]);
                        alternative1.setText(d.qoa.get(1)[2]);
                        alternative2.setText(d.qoa.get(1)[3]);
                        alternative3.setText(d.qoa.get(1)[4]);
                        alternative4.setText(d.qoa.get(1)[5]);

                    }
                }).start();

            }
        }

        //If you press the second alternative
        for (int i = 0; i < d.qoa.size(); i++) {
            if (ae.getSource() == alternative2) {
                Database d = new Database();
                if (ae.getActionCommand().equals(d.qoa.get(0)[6])) {
                    alternative2.setBackground(Color.getHSBColor(h_g, s_g, b_g));
                } else {
                    alternative2.setBackground(Color.RED);
                }
                new Timer(3000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Database d = new Database();
                        alternative2.setBackground(Color.DARK_GRAY);
                        scoreLabel.setText("1 - 2");
                        category.setText(d.qoa.get(1)[0]);
                        question.setText(d.qoa.get(1)[1]);
                        alternative1.setText(d.qoa.get(1)[2]);
                        alternative2.setText(d.qoa.get(1)[3]);
                        alternative3.setText(d.qoa.get(1)[4]);
                        alternative4.setText(d.qoa.get(1)[5]);

                    }
                }).start();
            }
        }
        //If you press the third alternative
        if (ae.getSource() == alternative3) {
            Database d = new Database();
            if (ae.getActionCommand().equals(d.qoa.get(0)[6])) {
                alternative3.setBackground(Color.getHSBColor(h_g, s_g, b_g));
            } else {
                alternative3.setBackground(Color.RED);
            }
            new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Database d = new Database();
                    alternative3.setBackground(Color.DARK_GRAY);
                    scoreLabel.setText("1 - 2");
                    category.setText(d.qoa.get(1)[0]);
                    question.setText(d.qoa.get(1)[1]);
                    alternative1.setText(d.qoa.get(1)[2]);
                    alternative2.setText(d.qoa.get(1)[3]);
                    alternative3.setText(d.qoa.get(1)[4]);
                    alternative4.setText(d.qoa.get(1)[5]);
                }

            }).start();
        }

        //If you press the fourth alternative 
        if (ae.getSource() == alternative4) {
            Database d = new Database();
            if (ae.getActionCommand().equals(d.qoa.get(0)[6])) {
                alternative4.setBackground(Color.getHSBColor(h_g, s_g, b_g));
            } else {
                alternative4.setBackground(Color.RED);
            }
            new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Database d = new Database();
                    alternative4.setBackground(Color.DARK_GRAY);
                    scoreLabel.setText("1 - 2");
                    category.setText(d.qoa.get(1)[0]);
                    question.setText(d.qoa.get(1)[1]);
                    alternative1.setText(d.qoa.get(1)[2]);
                    alternative2.setText(d.qoa.get(1)[3]);
                    alternative3.setText(d.qoa.get(1)[4]);
                    alternative4.setText(d.qoa.get(1)[5]);

                }
            }).start();
        }

    }
}