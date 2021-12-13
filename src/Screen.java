import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Screen extends JFrame {

    public static void main(String []args) throws IOException {
        JFrame frame = new JFrame();

        JLabel label1 = new JLabel("Username");
        JLabel label2 = new JLabel("Password");
        label1.setBounds(230, 200, 100, 30);
        label1.setSize(80, 30);
        JLabel label = new JLabel("Quản lý giải đấu");
        label.setBounds(300, 50, 100, 50);

        label2.setSize(80, 30);
        label2.setBounds(230, 250, 100, 30);

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JButton button = new JButton("Đăng nhập");
        textField1.setSize(20, 100);
        textField2.setSize(20, 100);
        textField1.setBounds(300, 200, 200, 30);
        textField2.setBounds(300, 250, 200, 30);
        button.setSize(100, 40);
        button.setBounds(350, 300, 100,50);

        try {
            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("unnamed1.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.add(label);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(button);
        frame.add(label1);
        frame.add(label2);
        frame.setTitle("Quản lý giải đấu");
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
