package jisuanqi;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login implements ActionListener{
    private JFrame f;
    private JLabel l1,l2;
    private JTextField username;
    private JPasswordField password;
    private JButton ok,cancel;
    public Login(){
        this.f = new JFrame("please input user and password");
        this.f.setBounds(0, 0, 500, 400);
        this.f.setVisible(true);
        Container c = this.f.getContentPane();
        c.setLayout(new GridLayout(3,2));
        l1 = new JLabel("username:");
        l2 = new JLabel("password:");
        username = new JTextField();
        password = new JPasswordField();
        this.ok = new JButton("ok");
        this.cancel = new JButton("cancel");

        this.cancel.addActionListener(this);
        this.ok.addActionListener(this);

        c.add(l1);
        c.add(username);
        c.add(l2);
        c.add(password);
        c.add(ok);
        c.add(cancel);
        this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JButton  b = (JButton)e.getSource();
        if(b == this.cancel){//初始化
            this.username.setText("");
            this.password.setText("");
        }
        else{
            String user = this.username.getText();
            String pass = this.password.getText();
            if(!(user.equals("111") && pass.equals("111"))){
                JOptionPane.showMessageDialog(b, "error", "error", 0);
            }
            else{
                this.f.dispose();
                jisuanqi cal = new jisuanqi();
            }
        }

    }
}
