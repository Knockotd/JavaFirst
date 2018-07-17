package awt_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event extends Frame {
	public Event() {
		//크기조정
		setBounds(100,100,500,500);
		//타이틀
		setTitle("이벤트 처리");
		//버튼생성
		Button bt1 = new Button("종료버튼");
		//여러 개의 컴포넌틀들을 묶어 줄 패널 생성
		Panel panel = new Panel();
		//패널에 버튼 추가
		panel.add(bt1);
		//패널을 윈도우에 추가
		add(panel);
		
		
		setVisible(true);
		
		//버튼을 누를 때 이벤트 처리는 ActionListener 인터페이스가 처리합니다.
		ActionListener listener1 = new ActionListener() {
			//인터페이스는 new로 바로 인스턴스를 만들 수 없습니다.
			//그래서 listener1에 저장합니다.
			@Override
			public void actionPerformed(ActionEvent e) {
				//프로그램 종료
				System.exit(0);
			}
			
		};
		//버튼과 리스너를 연결
		bt1.addActionListener(listener1);
		//bt1에 ActionEvent가 발생하면 listener1의 메소드를 호출한다.
	}
}
