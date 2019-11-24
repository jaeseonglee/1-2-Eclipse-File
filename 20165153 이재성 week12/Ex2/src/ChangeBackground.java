import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {  
	private JButton button1;
    private JButton button2;
    private JPanel panel;
    private JLabel label;
    
    public MyFrame() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("�̺�Ʈ ����");
        panel = new JPanel();
        label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");
        button1 = new JButton("�����");
        button1.addActionListener(new ActionListener() {  //���� Ŭ������ ó��
        	public void actionPerformed(ActionEvent e) {
        		if (e.getSource() == button1) {//�̺�Ʈ�� �߻���Ų ��ü �ĺ�
        			panel.setBackground(Color.YELLOW);
        			label.setText("����� ��ư�� Ŭ���߽��ϴ�.");
        		}
        	}
        });
        panel.add(button1);
        panel.add(label);
        button2 = new JButton("��ũ��");
        button2.addActionListener(new ActionListener() {  //���� Ŭ������ ó��
        	public void actionPerformed(ActionEvent e) {
        		if (e.getSource() == button2) {//�̺�Ʈ�� �߻���Ų ��ü �ĺ�
        			panel.setBackground(Color.PINK);
        			label.setText("��ũ�� ��ư�� Ŭ���߽��ϴ�.");
        		}
      		}
      	});
        panel.add(button2);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
    
}

public class ChangeBackground {
	public static void main(String[] args) {
        MyFrame t = new MyFrame();
	}
}
