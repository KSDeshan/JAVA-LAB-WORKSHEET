package LW_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1 extends JFrame {

    JTextField nameField, mobileField;
    JTextArea addressArea, outputArea;
    JRadioButton male, female;
    JComboBox dateBox, monthBox, yearBox;
    JCheckBox termsCheck;
    JButton submitBtn, resetBtn;

    public Q1() {

        setTitle("Registration Form");
        setSize(800, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(300, 10, 300, 30);
        add(title);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 60, 120, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 60, 150, 25);
        add(nameField);

        JLabel mobileLabel = new JLabel("Mobile");
        mobileLabel.setBounds(50, 100, 120, 25);
        add(mobileLabel);

        mobileField = new JTextField();
        mobileField.setBounds(150, 100, 150, 25);
        add(mobileField);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(50, 140, 120, 25);
        add(genderLabel);

        male = new JRadioButton("Male");
        male.setBounds(150, 140, 70, 25);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(220, 140, 90, 25);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel dobLabel = new JLabel("DOB");
        dobLabel.setBounds(50, 180, 120, 25);
        add(dobLabel);

        String[] dates = new String[31];
        for (int i = 1; i <= 31; i++) dates[i - 1] = String.valueOf(i);

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun",
                "Jul","Aug","Sep","Oct","Nov","Dec"};

        String[] years = new String[60];
        int y = 1965;
        for (int i = 0; i < 60; i++) years[i] = String.valueOf(y++);

        dateBox = new JComboBox(dates);
        dateBox.setBounds(150, 180, 60, 25);
        add(dateBox);

        monthBox = new JComboBox(months);
        monthBox.setBounds(220, 180, 80, 25);
        add(monthBox);

        yearBox = new JComboBox(years);
        yearBox.setBounds(310, 180, 80, 25);
        add(yearBox);

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(50, 220, 120, 25);
        add(addressLabel);

        addressArea = new JTextArea();
        addressArea.setLineWrap(true);
        addressArea.setBounds(150, 220, 200, 80);
        add(addressArea);

        outputArea = new JTextArea();
        outputArea.setBounds(400, 60, 300, 240);
        outputArea.setEditable(false);
        add(outputArea);

        termsCheck = new JCheckBox("Accept Terms And Conditions");
        termsCheck.setBounds(50, 320, 250, 25);
        add(termsCheck);

        submitBtn = new JButton("Submit");
        submitBtn.setBounds(150, 360, 100, 30);
        add(submitBtn);

        resetBtn = new JButton("Reset");
        resetBtn.setBounds(270, 360, 100, 30);
        add(resetBtn);

        JLabel status = new JLabel("");
        status.setBounds(150, 400, 300, 30);
        add(status);

        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (!termsCheck.isSelected()) {
                    JOptionPane.showMessageDialog(null,
                            "Please accept Terms & Conditions!");
                    return;
                }

                String gender = male.isSelected() ? "Male" : "Female";

                outputArea.setText(
                        "Name : " + nameField.getText() + "\n" + "Mobile : " + mobileField.getText() + "\n" + "Gender : " + gender + "\n" + "DOB : " + dateBox.getSelectedItem() + " "
                                + monthBox.getSelectedItem() + " " + yearBox.getSelectedItem() + "\n" + "Address : " + addressArea.getText()
                );

                status.setText("Registration Successfully..");
            }
        });

        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                mobileField.setText("");
                genderGroup.clearSelection();
                addressArea.setText("");
                termsCheck.setSelected(false);
                outputArea.setText("");
                status.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new Q1().setVisible(true);
    }
}
