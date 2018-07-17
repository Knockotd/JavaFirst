package awt_event2;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Event_Listener extends Frame {

	public Event_Listener() {
		setBounds(100, 100, 600, 600);
		setTitle("이벤트 핸들링");

		// 체크박스

		// 패널 생성
		Panel pn = new Panel();

		// 체크박스 생성
		Checkbox ckboolean = new Checkbox("boolean");
		Checkbox ckbyte = new Checkbox("byte");
		Checkbox ckshort = new Checkbox("short");
		Checkbox ckchar = new Checkbox("char");
		Checkbox ckint = new Checkbox("int");
		Checkbox cklong = new Checkbox("long");
		Checkbox ckfloat = new Checkbox("float");
		Checkbox ckdouble = new Checkbox("double");

		// 패널에 체크박스 얹기
		pn.add(ckboolean);
		pn.add(ckbyte);
		pn.add(ckshort);
		pn.add(ckchar);
		pn.add(ckint);
		pn.add(cklong);
		pn.add(ckfloat);
		pn.add(ckdouble);

		// 패널 북쪽에 위치
		add("North", pn);

		// 중앙 부, TextArea 배치
		TextArea ta = new TextArea(10, 70);
		add("Center", ta);

		// 하단 부 콤보박스 2개 배치
		// 콤보박스에 배치할 데이터 만들기
		String[] category = { "Programing", "Database", "IDE", "Framework" };
		// 카테고리 개수가 4개이면 {}가 4개
		String[][] content = { { "Java", "JavaScript", "swift" }, { "Oracle", "MySQL", "MongoDB" },
				{ "Eclipse", "Android Studio", "XCode" }, { "Spring", "MyBatis", "Hibernate" } };

		// 초이스
		Choice cbcategory = new Choice();
		for (String imsi : category) {
			cbcategory.add(imsi);
		}

		Choice cbcontent = new Choice();
		for (String imsi : content[0]) {
			cbcontent.add(imsi);
		}

		Button bt1 = new Button("선택");
		Button bt2 = new Button("종료");

		// 패널에 버튼 넣기

		// 패널에 초이스 넣기
		Panel southPanel = new Panel();
		southPanel.add(cbcategory);
		southPanel.add(cbcontent);
		southPanel.add(bt1);
		southPanel.add(bt2);
		add("South", southPanel);

		ItemListener itemHandler1 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// 이벤트가 발생한 인스턴스를 원래의 자료형인
				// Checkbox로 변환
				// 이벤트 처리 메소드에서
				// e.getSource()는 이벤트가 발생한
				// 인스턴스의 주소를 리턴합니다.
				Checkbox cb = (Checkbox) (e.getSource());
				// 체크 박스에 입력된 텍스트 가져오기
				String label = cb.getLabel();
				// 체크 박스 선택 여부 가져오기
				boolean b = cb.getState();
				ta.append(label + "" + b + "로 변경\n");
				ta.append(e.getSource());

			}
		};

		// 체크박스를 눌렀을 때 호출될 인스턴스 설정
		ckboolean.addItemListener(itemHandler1);
		ckbyte.addItemListener(itemHandler1);
		ckshort.addItemListener(itemHandler1);
		ckchar.addItemListener(itemHandler1);
		ckint.addItemListener(itemHandler1);
		cklong.addItemListener(itemHandler1);
		ckfloat.addItemListener(itemHandler1);
		ckdouble.addItemListener(itemHandler1);
		
		// 카테고리 콤보박스의 선택이 변경되었을 때
		// 호출될 메소드를 가진 리스너
		// 아이템리스너가 처리
		ItemListener itemHandler2 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// category의 선택된 행 번호 가져오기
				int row = cbcategory.getSelectedIndex();
				// cbcontent의 내용을 전부 삭제
				cbcontent.removeAll();
				//행번호에 해당하는 세부 내용을 cbcontent에 추가
				for(String temp : content[row]) {
					cbcontent.add(temp);
				}
			}
		};
		// 연결
		cbcategory.addItemListener(itemHandler2);

		ActionListener action1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// category의 선택된 행 번호 가져오기
				int caNum = cbcategory.getSelectedIndex();
				int coNum = cbcontent.getSelectedIndex();
				String categoryText = category[caNum];
				String contentText = content[caNum][coNum];
				ta.setText(categoryText+":"+contentText);
				//append-추가
				//setText-덮어씌우기
			}};
		
		bt1.addActionListener(action1);
		
		
		//종료 버튼을 누르면 프로그램 종료(System.exit(0))
		ActionListener action2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		};
		//연결
		bt2.addActionListener(action2);
		
		setVisible(true);
	}
}
