package A;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	public MyFrame() {
		this.setSize(300,200); //윈도우 크기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel(); //패널 컴포넌트 생성
		button = new JButton("버튼을 누르시오");  //button 객체 생성
		label = new JLabel("아직 버튼을 눌려지지 안았습니다"); //label 객체 생성
		button.addActionListener(this); // 버튼 클릭 이벤트에 대한 리스너 등록
		panel.add(button); // 패널에 버튼 추가, 창에 버튼이 출력됨
		panel.add(label); // 패널에 레이블 추가, 창에 레이블이 출력됨
		this.add(panel); // 프레임에 패널 추가
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) { // 이벤트 처리 내용
		if (e.getSource() ==button) {
			label.setText("마침내 버튼이 눌러졌습니다.");
		}
	}
}


