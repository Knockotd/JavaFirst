package awt;

import java.awt.*;
import java.util.Random;

public class LayoutEx_1 extends Frame {
public LayoutEx_1(){
	//위치&크기 설정
	setBounds(200,200,400,400);
	//제목 설정
	setTitle("레이아웃 연습");
	
	
	Panel panel1 = new Panel();
/*	//panel1의 레이아웃을 설정
	panel1.setLayout(new FlowLayout());

	
	
	//컴포넌트 배치
	Button bt1 = null; //만드는 것은 밖에서 한번만 만들고 반복문 안에서의 값을 계속 초기화 시킵니다.
	for(int i=0; i<10; i++) {
		
		bt1 = new Button("버튼"+i);
		
		panel1.add(bt1);
		
	}//반복문 끝에서 bt1이 사라집니다. 반복문 안에서 계속 만들어졌다 사라졌다 합니다.
	*/
	
	/*panel1.setLayout(new BorderLayout());
	Button btw = new Button("서쪽");
	panel1.add("West", btw);
	Button bte = new Button("동쪽");
	panel1.add("East", bte);
	Button btc = new Button("중앙");
	panel1.add("Center", btc);
	Button bts = new Button("남쪽");
	panel1.add("South", bts);
	Button btn = new Button("북쪽");
	panel1.add("North", btn);*/
	
	/*Button bt2 = null;
	panel1.setLayout(new GridLayout(2,3,10,10));
	for(int i=0; i<10; i++) {
		bt2 = new Button("버튼"+(i+1));
		panel1.add(bt2);
	}*/
	
	panel1.setLayout(null);
	Label label = new Label("@");
	//위치를 직접 매번 정해주어야 합니다.
	//컴포넌트의 크기와 위치를 마음대로 변경할 수 있어 움직이는 것을 만들 수 있어, 장점이 되기도 합니다.
	label.setBounds(10,10,200,200);
	add(label);
	
	add(panel1);
	/*//화면 크기 조절을 못하도록 설정
	setResizable(false);
	*/
	
	
	//화면 출력
	setVisible(true);
	//스레드를 가장 빠르게 만드는 방법
	Thread thread = new Thread() {
		public void run() {
			while(true) {
				//현재 레이블의 위치를 가져오기
				int x = label.getLocation().x;
				int y = label.getLocation().y;
				Random r = new Random();
				//label.setLocation(x+10, y);
				label.setLocation(r.nextInt(400), r.nextInt(400));
				try {
					Thread.sleep(100);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	thread.start();
}
}
