package LW_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1 extends JFrame {

    JTextField suName, suEmail, siEmail;
    JPasswordField suPass, siPass;
    JRadioButton male, female;
    JCheckBox notRobot;
    JComboBox dayBox, monthBox, yearBox;
    JButton signUpBtn, signInBtn;

    public Q1() {

        setTitle("Registration Form");
        setSize(420, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel title = new JLabel("Sign Up");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setForeground(Color.BLUE);     // CHANGED
        title.setBounds(160, 10, 200, 30);
        add(title);

        JLabel nameLbl = new JLabel("Name");
        nameLbl.setBounds(40, 60, 100, 25);
        add(nameLbl);

        suName = new JTextField();
        suName.setBounds(150, 60, 200, 25);
        add(suName);

        JLabel emailLbl = new JLabel("Email");
        emailLbl.setBounds(40, 100, 100, 25);
        add(emailLbl);

        suEmail = new JTextField();
        suEmail.setBounds(150, 100, 200, 25);
        add(suEmail);

        JLabel genderLbl = new JLabel("Gender");
        genderLbl.setBounds(40, 140, 100, 25);
        add(genderLbl);

        male = new JRadioButton("Male");
        male.setBounds(150, 140, 70, 25);
        female = new JRadioButton("Female");
        female.setBounds(230, 140, 80, 25);
        add(male);
        add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JLabel bdayLbl = new JLabel("Birthday");
        bdayLbl.setBounds(40, 180, 100, 25);
        add(bdayLbl);

        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) days[i - 1] = String.valueOf(i);

        String[] months = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};

        String[] years = new String[60];
        int y = 1965;
        for (int i = 0; i < 60; i++) years[i] = String.valueOf(y++);

        dayBox = new JComboBox(days);
        dayBox.setBounds(150, 180, 60, 25);
        add(dayBox);

        monthBox = new JComboBox(months);
        monthBox.setBounds(220, 180, 100, 25);
        add(monthBox);

        yearBox = new JComboBox(years);
        yearBox.setBounds(330, 180, 60, 25);
        add(yearBox);

        JLabel passLbl = new JLabel("Password");
        passLbl.setBounds(40, 220, 100, 25);
        add(passLbl);

        suPass = new JPasswordField();
        suPass.setBounds(150, 220, 200, 25);
        add(suPass);

        notRobot = new JCheckBox("I am not a robot.");
        notRobot.setBounds(40, 260, 200, 25);
        add(notRobot);

        signUpBtn = new JButton("Sign Up");
        signUpBtn.setBounds(40, 300, 310, 35);
        signUpBtn.setBackground(Color.BLUE);
        signUpBtn.setForeground(Color.WHITE);
        add(signUpBtn);

        JLabel siTitle = new JLabel("Sign In");
        siTitle.setFont(new Font("Arial", Font.BOLD, 20));
        siTitle.setForeground(Color.BLUE);    // CHANGED
        siTitle.setBounds(160, 360, 200, 30);
        add(siTitle);

        JLabel siEmailLbl = new JLabel("Email");
        siEmailLbl.setBounds(40, 410, 100, 25);
        add(siEmailLbl);

        siEmail = new JTextField();
        siEmail.setBounds(150, 410, 200, 25);
        add(siEmail);

        JLabel siPassLbl = new JLabel("Password");
        siPassLbl.setBounds(40, 450, 100, 25);
        add(siPassLbl);

        siPass = new JPasswordField();
        siPass.setBounds(150, 450, 200, 25);
        add(siPass);

        signInBtn = new JButton("Sign In");
        signInBtn.setBounds(40, 490, 310, 35);
        signInBtn.setBackground(Color.BLUE);
        signInBtn.setForeground(Color.WHITE);
        add(signInBtn);

        signUpBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (!notRobot.isSelected()) {
                    JOptionPane.showMessageDialog(null,
                            "Please confirm that you are not a robot");
                    return;
                }

                JOptionPane.showMessageDialog(null,
                        "Sign Up Successfully");
            }
        });

        signInBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String email = siEmail.getText();
                String pass = new String(siPass.getPassword());

                if (email.isEmpty() || pass.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Sign In Unsuccessfully");
                    return;
                }

                JOptionPane.showMessageDialog(null,
                        "Sign In Successfully");
            }
        });
    }

    public static void main(String[] args) {
        new Q1().setVisible(true);
    }
}
