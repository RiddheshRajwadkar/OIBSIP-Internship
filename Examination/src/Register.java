import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame implements ActionListener{
    JButton next;
    JTextField jtname, jtpassword, jtconfirm;
    String regName, regPassword;
    
    Register(){
        getContentPane().setForeground(Color.WHITE);
        setLayout(null);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/Registration.jpg"));
        JLabel image = new JLabel(icon);
        image.setBounds(10,0, 500, 500);
        add(image);

        JLabel heading = new JLabel("Registration");
        heading.setBounds(750, 0, 700, 300);
        heading.setFont(new Font("Serif", Font.BOLD, 40));
        heading.setForeground(new Color(4, 55, 242));
        add(heading);

        JLabel name = new JLabel("Enter your name:");
        name.setBounds(600, 100, 700, 300);
        name.setFont(new Font("Serif", Font.BOLD, 15));
        name.setForeground(Color.BLUE);
        add(name);

        jtname = new JTextField();
        jtname.setBounds(760, 240, 300, 25);
        jtname.setFont(new Font("Serif", Font.BOLD, 20));
        add(jtname);

        JLabel password = new JLabel("Enter your password:");
        password.setBounds(600, 150, 700, 300);
        password.setFont(new Font("Serif", Font.BOLD, 15));
        password.setForeground(Color.BLUE);
        add(password);

        jtpassword = new JTextField();
        jtpassword.setBounds(760, 290, 300, 25);
        jtpassword.setFont(new Font("Serif", Font.BOLD, 20));
        add(jtpassword);

        JLabel confirmpass = new JLabel("Confirm your password:");
        confirmpass.setBounds(600, 200, 700, 300);
        confirmpass.setFont(new Font("Serif", Font.BOLD, 15));
        confirmpass.setForeground(Color.BLUE);
        add(confirmpass);

        jtconfirm = new JTextField();
        jtconfirm.setBounds(760, 340, 300, 25);
        jtconfirm.setFont(new Font("Serif", Font.BOLD, 20));
        add(jtconfirm);

        next = new JButton("Next");
        next.setBounds(815, 400, 100, 30);
        next.setBackground(new Color(4, 55, 242));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        setSize(1200, 500);
        setLocation(450, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == next){
            regName = jtname.getText();
            regPassword = jtpassword.getText();
            setVisible(false);
            new Login(regName, regPassword);
        }
    }
    public static void main(String[] args) {
        new Register();
    }
}
