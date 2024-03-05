import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{

    JButton register, next, exit;
    JTextField jtname, jtpassword;

    Login(String regName, String regPassword){
        getContentPane().setForeground(Color.WHITE);
        setLayout(null);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/Examination.jpg"));
        JLabel image = new JLabel(icon);
        image.setBounds(10,0, 500, 500);
        add(image);

        JLabel heading = new JLabel("Login");
        heading.setBounds(825, 0, 700, 300);
        heading.setFont(new Font("Serif", Font.BOLD, 40));
        heading.setForeground(new Color(4, 55, 242));
        add(heading);

        JLabel name = new JLabel("Enter your name:");
        name.setBounds(600, 100, 700, 300);
        name.setFont(new Font("Serif", Font.BOLD, 15));
        name.setForeground(Color.BLUE);
        add(name);

        jtname = new JTextField();
        jtname.setBounds(750, 240, 300, 25);
        jtname.setFont(new Font("Serif", Font.BOLD, 20));
        add(jtname);

        JLabel password = new JLabel("Enter your password:");
        password.setBounds(600, 160, 700, 300);
        password.setFont(new Font("Serif", Font.BOLD, 15));
        password.setForeground(Color.BLUE);
        add(password);

        jtpassword = new JTextField();
        jtpassword.setBounds(750, 300, 300, 25);
        jtpassword.setFont(new Font("Serif", Font.BOLD, 20));
        add(jtpassword);

        register = new JButton("Register");
        register.setBounds(700, 400, 100, 30);
        register.setBackground(new Color(4, 55, 242));
        register.setForeground(Color.WHITE);
        register.addActionListener(this);
        add(register);


        next = new JButton("Next");
        next.setBounds(815, 400, 100, 30);
        next.setBackground(new Color(4, 55, 242));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        exit = new JButton("Exit");
        exit.setBounds(925, 400, 100, 30);
        exit.setBackground(new Color(4, 55, 242));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        setSize(1200, 500);
        setLocation(450, 200);
        setVisible(true);
    }

    Login(){
        getContentPane().setForeground(Color.WHITE);
        setLayout(null);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/Examination.jpg"));
        JLabel image = new JLabel(icon);
        image.setBounds(10,0, 500, 500);
        add(image);

        JLabel heading = new JLabel("Login");
        heading.setBounds(825, 0, 700, 300);
        heading.setFont(new Font("Serif", Font.BOLD, 40));
        heading.setForeground(new Color(4, 55, 242));
        add(heading);

        JLabel name = new JLabel("Enter your name:");
        name.setBounds(600, 100, 700, 300);
        name.setFont(new Font("Serif", Font.BOLD, 15));
        name.setForeground(Color.BLUE);
        add(name);

        jtname = new JTextField();
        jtname.setBounds(750, 240, 300, 25);
        jtname.setFont(new Font("Serif", Font.BOLD, 20));
        add(jtname);

        JLabel password = new JLabel("Enter your password:");
        password.setBounds(600, 160, 700, 300);
        password.setFont(new Font("Serif", Font.BOLD, 15));
        password.setForeground(Color.BLUE);
        add(password);

        jtpassword = new JTextField();
        jtpassword.setBounds(750, 300, 300, 25);
        jtpassword.setFont(new Font("Serif", Font.BOLD, 20));
        add(jtpassword);

        next = new JButton("Next");
        next.setBounds(815, 400, 100, 30);
        next.setBackground(new Color(4, 55, 242));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        exit = new JButton("Exit");
        exit.setBounds(925, 400, 100, 30);
        exit.setBackground(new Color(4, 55, 242));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        setSize(1200, 500);
        setLocation(450, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == next){
            String name = jtname.getText();
            setVisible(false);
            new Profile(name);
        }else if(e.getSource() == exit){
            setVisible(false);
        }else if(e.getSource() == register){
            setVisible(false);
            new Register();
        }
    }
    public static void main(String[] args){
        new Login();
    }
}