package awt;

import java.awt.*;

public class CommonsDialog extends Frame {
	//생성자 - 인스턴스를 생성할 때 호출하는 메소드
public CommonsDialog() {
	//위치와 크기를 설정(앞의 두개가 위치, 뒤의 두개가 크기)
	setBounds(200, 200, 600, 600);
	//제목 설정
	setTitle("공통 대화 상자");
	
	//파일 대화상자 만들기
	//FileDialog를 생성할 때 첫번째 매개변수가 Dialog 나 Frame의 주소인데 지금의 경우는 this를 대입해면 됩니다.
	FileDialog filedialog = new FileDialog(this, "파일 대화상자");
	//디렉토리 설정
	filedialog.setDirectory("C:\\Users\\503-26\\Desktop");
	//파일 대화상자를 화면에 출력
	filedialog.setVisible(true);
	
	//설정한 파일 경로 가져오기
	String filepath = filedialog.getDirectory() + filedialog.getFile();
	
	Label label = new Label(filepath);
	add(label);
	
	//화면 출력
	setVisible(true);
}
}
