import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login() {
        super("로그인");   // 타이틀
        JPanel jPanel = new JPanel();

        jPanel.setBackground(Color.darkGray);
        setSize(300, 200);
        add(jPanel);

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        // 화면 중앙에 띄우기
        setLocation((windowSize.width - frameSize.width) / 2, (windowSize.height - frameSize.height) / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}