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
        this.setTitle("이벤트 예제");
        panel = new JPanel();
        label = new JLabel("아직 버튼을 눌려지지 않았습니다");
        button1 = new JButton("노란색");
        button1.addActionListener(new ActionListener() {  //무명 클래스로 처리
        	public void actionPerformed(ActionEvent e) {
        		if (e.getSource() == button1) {//이벤트를 발생시킨 객체 식별
        			panel.setBackground(Color.YELLOW);
        			label.setText("노란색 버튼을 클릭했습니다.");
        		}
        	}
        });
        panel.add(button1);
        panel.add(label);
        button2 = new JButton("핑크색");
        button2.addActionListener(new ActionListener() {  //무명 클래스로 처리
        	public void actionPerformed(ActionEvent e) {
        		if (e.getSource() == button2) {//이벤트를 발생시킨 객체 식별
        			panel.setBackground(Color.PINK);
        			label.setText("핑크색 버튼을 클릭했습니다.");
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
