import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(800,100);
        window.setTitle("Basic GUI Homework");
        window.setLocation(100, 100);
        window.setLayout(new FlowLayout());
        JTextField tf1 = new JTextField(20);
        JTextField tf2 = new JTextField(20);
        JButton button = new JButton("Add the numbers");
        JLabel label1 = new JLabel("     ");
        JLabel label2 = new JLabel("Please enter a number into each of the text fields");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    label1.setText(String.valueOf(num1 + num2));
                    label2.setText("Please enter a number into each of the text fields");
                } catch (NumberFormatException ex) {
                    label2.setText("Please only enter numbers into the text fields");
                }
            }
        });
        window.add(tf1);
        window.add(tf2);
        window.add(button);
        window.add(label1);
        window.add(label2);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}