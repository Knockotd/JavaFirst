package awt;

import java.awt.*;

public class TextfieldTest extends Frame {
	// 생성자 - 인스턴스를 만들 때 호출하는 메소드
	public TextfieldTest() {
		// 크기와 위치 및 타이틀 설정
		setSize(500, 500);
		setLocation(100, 100);
		setTitle("로그인");

		// 패널을 생성
		Panel panel = new Panel();
		Label label = new Label("아이디");// 글자 부착
		TextField txtId = new TextField(20);
		panel.add(label);
		panel.add(txtId);

		Label label1 = new Label("비밀번호");
		TextField txtPw = new TextField(20);
		txtPw.setEchoChar('*'); // 텍스트가 입력될 때 보여지는 형태 //(char)97 이렇게 형변환 해도 된다.
		panel.add(label1);
		panel.add(txtPw);

		// 여러 줄 입력할 수 있는 텍스트 영역 만들기
		TextArea ta = new TextArea(10, 50); // 행 수와 열 수
		panel.add(ta);

		// 패널을 프레임에 부착
		add(panel);

		// 메뉴바 만들기
		MenuBar menuBar = new MenuBar();
		// 메뉴 생성
		Menu file = new Menu("파일(F)");
		Menu newFile = new Menu("새로만들기 >");
		file.add(newFile);
		MenuItem project = new MenuItem("프로젝트");
		newFile.add(project);
		MenuItem package1 = new MenuItem("패키지");
		newFile.add(package1);
		MenuItem class1 = new MenuItem("클래스");
		newFile.add(class1);
		MenuItem openFile = new MenuItem("열기");
		file.add(openFile);
		MenuItem saveFile = new MenuItem("저장");
		file.add(saveFile);
		MenuItem othersaveFile = new MenuItem("다른이름으로 저장");
		file.add(othersaveFile);

		// 메뉴 생성
		Menu edit = new Menu("편집(E)");
		MenuItem undoTyping = new MenuItem("실행취소");
		edit.add(undoTyping);
		MenuItem redoTyping = new MenuItem("다시실행");
		edit.add(redoTyping);

		// 메뉴를 메뉴 바에 부착
		menuBar.add(file);
		menuBar.add(edit);

		// 메뉴바를 윈도우에 배치
		setMenuBar(menuBar);

		// 화면출력
		setVisible(true);
	}
}
