package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.PopupMenu;

public class Ex_1 extends Frame {
public Ex_1() {
	setBounds(200, 300, 600, 600);
	setTitle("Ex_1 프로그램");
	
	
	//filedialog 객체를 생성해서 화면서 출력하고 선택한 파일 경로를 레이블에 출력
	FileDialog fD = new FileDialog(this, "파일경로");

	fD.setDirectory("C:\\Users\\503-26\\Desktop\\");
	fD.setVisible(true);
	String msg = fD.getDirectory() + fD.getFile();
	
	Label line1 = new Label(msg);
	add(line1);
	

	setVisible(true);
}
}
