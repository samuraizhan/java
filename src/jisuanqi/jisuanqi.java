package jisuanqi;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class jisuanqi implements ItemListener{
    private JFrame f;
    private JRadioButton r1,r2,r3,r4;
    private JTextField txt1,txt2;
    private JButton ok;
    private JLabel l;
    public jisuanqi(){
        this.f = new JFrame("Calculate");
        this.f.setBounds(0, 0, 500, 400);
        this.f.setVisible(true);

        Container c = this.f.getContentPane();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setLayout(new GridLayout(1,4));
        r1 = new JRadioButton("+");
        r2 = new JRadioButton("-");
        r3 = new JRadioButton("*");
        r4 = new JRadioButton("/");
        JComboBox box = new JComboBox();
        box.addItem("+");box.addItem("-");box.addItem("*");box.addItem("/");


        p1.add(r1);p1.add(r2);p1.add(r3);p1.add(r4);
        ButtonGroup group = new ButtonGroup();
        group.add(r1);group.add(r2);group.add(r3);group.add(r4);

        p2.setLayout(new GridLayout(1,2));
        txt1 = new JTextField();
        txt2 = new JTextField();
        p2.add(txt1);p2.add(txt2);

        p3.setLayout(new GridLayout(1,2));
        ok = new JButton("ok");
        l = new JLabel();
        p3.add(ok);p3.add(l);

        c.add(p1,BorderLayout.NORTH);
        c.add(p2,BorderLayout.CENTER);
        c.add(p3,BorderLayout.SOUTH);


        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        r4.addItemListener(this);
        box.addItemListener(this);

        this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        String s1 = this.txt1.getText();
        String s2 = this.txt2.getText();
        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);
        JRadioButton r = (JRadioButton)e.getSource();
        double result;
        if(r == r1){
            result = n1 + n2;
        }
        else if(r == r2){
            result = n1 - n2;
        }
        else if(r == r3){
            result = n1 * n2;
        }
        else{
            result = n1 / n2;
        }
        this.l.setText("" + result);
    }
}
