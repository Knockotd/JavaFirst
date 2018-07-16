package guiEx2;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class GuiEx2 extends Frame {

	public GuiEx2() {

		setTitle("GUI 두번째 프로그램");
		setLocation(100, 100);
		setSize(500, 500);

		Panel p = new Panel();

		Checkbox cb1 = new Checkbox("독서");
		Checkbox cb2 = new Checkbox("프랑스 자수");
		Checkbox cb3 = new Checkbox("음악 감상");
		Checkbox cb4 = new Checkbox("게임");
		Checkbox cb5 = new Checkbox("컬러링북");
		Checkbox cb6 = new Checkbox("그림그리기");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		p.add(cb5);
		p.add(cb6);

		// 라디오 버튼 만들기
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("남자", group, true);
		Checkbox woman = new Checkbox("여자", group, true);

		Choice ch = new Choice();
		ch.add("맥북 프로");
		ch.add("아이패드 프로");
		ch.add("아이폰 x");
		ch.add("선풍기");

		p.add(ch);

		p.add(man);
		p.add(woman);

		// 5개를 보여주고 여러 개를 선택할 수 있도록 해주는 리스트
		List list = new List(5, true);
		list.add("박보검"); // 0
		list.add("박서준"); // 1
		list.add("서강준"); // 2
		list.add("강동원"); // 3
		list.add("조진웅"); // 4
		list.add("유해진"); // 5
		list.add("용준형"); // 6
		list.add("양요섭"); // 7
		list.add("강다니엘"); // 8
		list.add("시우민"); // 9

		// list의 remove(int idx)를 이용하면 idx번재를 지울 수 있습니다.
		// list.remove(0);
		// 첫번째에 있는 c&c++과 5번째에 있는 objective-c를 제거 -> 0번과 4번을 제거
		// 여러개를 지울 때는 항상 뒤에서부터 삭제해야 합니다.
		// bcz.앞에서 지우면 뒤의 인덱스에 영향을 주기 때문입니다.
		// 0을 지우면 원래 4번은 3번이 됩니다.
		list.remove(4);
		list.remove(0);

		p.add(list);

		add(p);
		setVisible(true);

	}

}
