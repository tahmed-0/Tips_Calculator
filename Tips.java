import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tips {


    JFrame frame = new JFrame("Tips");
    JLabel baseLabel = new JLabel("Base");
    JLabel percentageLabel = new JLabel("%");
    JLabel tipLabel = new JLabel("Tips:");
    JLabel totalLabel = new JLabel("Total:");

    JTextField baseField = new JTextField();
    JTextField percentageField = new JTextField();

    JLabel tLabel = new JLabel();
    JLabel pLabel = new JLabel();

    JButton enter = new JButton("Enter");
    JButton clear = new JButton("Clear");


    public Tips() {


            createLayouts();
            createWindow();
            createAction();

    }

    public void createWindow() {
        frame.setSize(630, 350);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(68, 142, 173));
        frame.setVisible(true);
    }

    public void createLayouts() {
        baseLabel.setBounds(164, 66, 34,17);
        percentageLabel.setBounds(164, 108, 36, 18);
        baseField.setBounds(223, 62, 196, 25);
        percentageField.setBounds(223, 104,196, 25);
        enter.setBounds(242, 146, 69, 15);
        clear.setBounds(331, 146, 69, 15);
        tipLabel.setBounds(214, 203, 49, 15);
        totalLabel.setBounds(214, 238, 36, 18);
        tLabel.setBounds(274, 203, 105, 11);
        pLabel.setBounds(274, 238, 105, 11);

        frame.add(baseLabel);
        frame.add(percentageLabel);
        frame.add(baseField);
        frame.add(percentageField);
        frame.add(enter);
        frame.add(clear);
        frame.add(tipLabel);
        frame.add(totalLabel);
        frame.add(tLabel);
        frame.add(pLabel);
    }

    public void createAction() {
        enter.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                double beforeText = Integer.parseInt(baseField.getText());
                double getTextPercentage = Integer.parseInt(percentageField.getText());

                System.out.println(beforeText);
                System.out.println(getTextPercentage);
                double convertPercentage = getTextPercentage / 100;
                double getTips = beforeText * convertPercentage;
                double total = beforeText + getTips;

                tLabel.setText(String.valueOf(total));
                pLabel.setText(String.valueOf(getTips));
            }
        });


        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                baseField.setText("");
                percentageField.setText("");
                tLabel.setText("");
                pLabel.setText("");
            }
        });
    }


}
