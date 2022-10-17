import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAndSignup extends JFrame {
    public LoginAndSignup() {
        super("로그인 / 회원가입");    // 타이틀
        JPanel jPanel = new JPanel();
        JButton btn1 = new JButton("로그인");
        JButton btn2 = new JButton("회원가입");
        setSize(300, 200);  // 창 크기 설정
        jPanel.add(btn1);
        jPanel.add(btn2);
        add(jPanel);

        Dimension frameSize = getSize();

        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        // 화면 중앙에 띄우기
        setLocation((windowSize.width - frameSize.width) / 2, (windowSize.height - frameSize.height) / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        // 로그인 버튼 누르면 로그인 창으로 이동
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                setVisible(false);  // 창 안 보이게 하기
            }
        });

        // 회원가입 버튼 누르면 회원가입 창으로 이동
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SignUp();
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        new LoginAndSignup();
    }
}
