package A;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	public MyFrame() {
		this.setSize(300,200); //������ ũ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		JPanel panel = new JPanel(); //�г� ������Ʈ ����
		button = new JButton("��ư�� �����ÿ�");  //button ��ü ����
		label = new JLabel("���� ��ư�� �������� �Ⱦҽ��ϴ�"); //label ��ü ����
		button.addActionListener(this); // ��ư Ŭ�� �̺�Ʈ�� ���� ������ ���
		panel.add(button); // �гο� ��ư �߰�, â�� ��ư�� ��µ�
		panel.add(label); // �гο� ���̺� �߰�, â�� ���̺��� ��µ�
		this.add(panel); // �����ӿ� �г� �߰�
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) { // �̺�Ʈ ó�� ����
		if (e.getSource() ==button) {
			label.setText("��ħ�� ��ư�� ���������ϴ�.");
		}
	}
}


