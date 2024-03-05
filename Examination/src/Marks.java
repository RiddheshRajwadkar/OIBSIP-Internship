import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Marks extends JFrame implements ActionListener{
    Marks(String name, int Marks) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel();
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblMarks = new JLabel("Your Marks is " + Marks);
        lblMarks.setBounds(350, 200, 300, 30);
        lblMarks.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblMarks);

        JButton exit = new JButton("Logout");
        exit.setBounds(500, 270, 120, 30);
        exit.setBackground(new Color(4, 55, 242));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Marks("User", 0);
    }
}
