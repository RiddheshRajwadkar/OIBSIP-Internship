import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile extends JFrame implements ActionListener{
    JTextField newNameField;
    JPasswordField newPasswordField, confirmPasswordField;
    JButton editNameButton, editPasswordButton, startExamButton;
    String name;
    String password;

    Profile(String name){
        this.name = name;
        getContentPane().setForeground(Color.WHITE);
        setLayout(null);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/Profile.jpg"));
        JLabel image = new JLabel(icon);
        image.setBounds(10,50, 350, 350);
        add(image);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Profile");
        heading.setBounds(550, -50, 700, 300);
        heading.setFont(new Font("Serif", Font.BOLD, 40));
        heading.setForeground(new Color(4, 55, 242));
        add(heading);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(440, 150, 80, 30);
        nameLabel.setFont(new Font("Serif", Font.BOLD, 20));
        add(nameLabel);

        JLabel passwordLabel = new JLabel("Enter New Password:");
        passwordLabel.setBounds(440, 200, 200, 30);
        passwordLabel.setFont(new Font("Serif", Font.BOLD, 20));
        add(passwordLabel);

        JLabel confirmLabel = new JLabel("Confirm Password:");
        confirmLabel.setBounds(440, 250, 200, 30);
        confirmLabel.setFont(new Font("Serif", Font.BOLD, 20));
        add(confirmLabel);

        newNameField = new JTextField(name);
        newNameField.setBounds(630, 150, 200, 30);
        newNameField.setFont(new Font("Serif", Font.PLAIN, 16));
        add(newNameField);

        newPasswordField = new JPasswordField(password);
        newPasswordField.setBounds(630, 200, 200, 30);
        newPasswordField.setFont(new Font("Serif", Font.PLAIN, 16));
        add(newPasswordField);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(630, 250, 200, 30);
        confirmPasswordField.setFont(new Font("Serif", Font.PLAIN, 16));
        add(confirmPasswordField);

        editNameButton = new JButton("Update Name");
        editNameButton.setBounds(480, 400, 200, 40);
        editNameButton.setBackground(new Color(4, 55, 242));
        editNameButton.setForeground(Color.WHITE);
        editNameButton.addActionListener(this);
        add(editNameButton);

        editPasswordButton = new JButton("Update Password");
        editPasswordButton.setBounds(690, 400, 200, 40);
        editPasswordButton.setBackground(new Color(4, 55, 242));
        editPasswordButton.setForeground(Color.WHITE);
        editPasswordButton.addActionListener(this);
        add(editPasswordButton);

        startExamButton = new JButton("Start Examination");
        startExamButton.setBounds(900, 400, 200, 40);
        startExamButton.setBackground(new Color(4, 55, 242));
        startExamButton.setForeground(Color.WHITE);
        startExamButton.addActionListener(this);
        add(startExamButton);

        setSize(1200, 500);
        setLocation(450, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == editNameButton) {
            String newName = newNameField.getText();
            if (!newName.isEmpty()) {
                this.name = newName;
                JOptionPane.showMessageDialog(this, "Name updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a new name.");
            }
        } else if (ae.getSource() == editPasswordButton) {
            String newPassword = new String(newPasswordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());
            if (!newPassword.isEmpty() && !confirmPassword.isEmpty()) {
                if (newPassword.equals(confirmPassword)) {
                    // Handle password update here
                    JOptionPane.showMessageDialog(this, "Password updated successfully!");
                    newPasswordField.setText("");
                    confirmPasswordField.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Passwords do not match.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please enter new password and confirm password.");
            }
        } else if (ae.getSource() == startExamButton) {
            setVisible(false);
            // Assuming Examination class exists
            new Examination(name);
        }
    }

    public static void main(String[] args) {
        new Profile("User");
    }
}
