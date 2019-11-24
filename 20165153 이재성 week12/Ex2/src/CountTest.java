import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Count extends JFrame{
	private JButton button;
	private JLabel label;
	private int count = 0;
	public Count() {
		this.setSize(300, 200);  //윈도우 크기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트예제");
		JPanel panel = new JPanel();	//패널 컴포넌트 생성	
		button = new JButton("버튼을 클릭하면 1씩 증가합니다.");  //button 객체 생성
		label = new JLabel();  //lable 객체 생성
		button.addActionListener( e ->  
			{label.setText("클릭 횟수: "+ ++count);
		});  //버튼 클릭 이벤트에 대한 이벤트 리스너 등록
		panel.add(button);  //패널에 버튼 추가, 창에 버튼이 출력됨 
		panel.add(label);    //패널에 레이블 추가, 창에 레이블이 출력됨
		this.add(panel);  //프레임에 패널 추가		
		this.setVisible(true);
	}

}

public class CountTest {
	public static void main(String[] args) {
		Count c = new Count();
	}
}
