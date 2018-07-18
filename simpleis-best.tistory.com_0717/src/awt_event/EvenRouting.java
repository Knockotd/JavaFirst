package awt_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenRouting extends Frame {
	public EvenRouting() {
		// 크기조정
		setBounds(100, 100, 500, 500);
		// 타이틀
		setTitle("라웃팅 이벤트");

		// 버튼생성
		Button bt1 = new Button("한국어");
		Button bt2 = new Button("영어");
		Button bt3 = new Button("종료");

		// 레이블 생성
		Label lb1 = new Label();

		// 여러 개의 컴포넌틀들을 묶어 줄 패널 생성
		Panel panel = new Panel();
		// 패널에 버튼 추가
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		add("Center", panel);

		add("South", lb1);

		// 패널을 윈도우에 추가
		add(panel);

		// 윈도우를 화면에 출력
		setVisible(true);

		
		/////////////////////////////////////////////////////
		
	/*	//ActionEvent를 처리할 수 있는 인스턴스 만들기
		ActionListener listener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb1.setText("안녕하세요");
			}
			
		};
		//컴퍼넌트와 이벤트를 처리할 수 있는 리스너 연결
		bt1.addActionListener(listener1);
		
		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb1.setText("Hello");
			}
			
		};
		bt2.addActionListener(listener2);
		
		ActionListener listener3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		};
		bt3.addActionListener(listener3);
		*/
		
		/////////////////////////////////////////////////
		
		//이벤트 라우팅 - 하나의 리스너가 여러 컴포넌트의
		//이벤트를 처리하는 것
		
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//이벤트가 발생한 컴포넌트의 문자열을 가지고 분기
				//이 메소드의 매개변수 ActionEvent e가 이벤트가 발생한 곳의 주소를 가지고 있다.
				//소환할 수 있는 것으로는 e.getSource()와 e.getActionCommand()가 있다.
				switch(e.getActionCommand()) {
				case "한국어" :
					lb1.setText("안녕하세요");
					break;
				case "영어" :
					lb1.setText("Hello");
					break;
				case "종료" : 
					System.exit(0);
					break;
				}
			}
			
		};
		//3개 버튼의 액션 이벤트를 listener가 모두 처리
		bt1.addActionListener(listener);
		bt2.addActionListener(listener);
		bt3.addActionListener(listener);
		
		
		
		
		
	}
}
