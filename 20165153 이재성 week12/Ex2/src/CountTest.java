import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Count extends JFrame{
	private JButton button;
	private JLabel label;
	private int count = 0;
	public Count() {
		this.setSize(300, 200);  //������ ũ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ����");
		JPanel panel = new JPanel();	//�г� ������Ʈ ����	
		button = new JButton("��ư�� Ŭ���ϸ� 1�� �����մϴ�.");  //button ��ü ����
		label = new JLabel();  //lable ��ü ����
		button.addActionListener( e ->  
			{label.setText("Ŭ�� Ƚ��: "+ ++count);
		});  //��ư Ŭ�� �̺�Ʈ�� ���� �̺�Ʈ ������ ���
		panel.add(button);  //�гο� ��ư �߰�, â�� ��ư�� ��µ� 
		panel.add(label);    //�гο� ���̺� �߰�, â�� ���̺��� ��µ�
		this.add(panel);  //�����ӿ� �г� �߰�		
		this.setVisible(true);
	}

}

public class CountTest {
	public static void main(String[] args) {
		Count c = new Count();
	}
}
