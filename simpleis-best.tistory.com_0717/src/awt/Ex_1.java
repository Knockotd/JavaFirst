package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.PopupMenu;

public class Ex_1 extends Frame {
public Ex_1() {
	setBounds(200, 300, 600, 600);
	setTitle("Ex_1 ���α׷�");
	
	
	//filedialog ��ü�� �����ؼ� ȭ�鼭 ����ϰ� ������ ���� ��θ� ���̺� ���
	FileDialog fD = new FileDialog(this, "���ϰ��");

	fD.setDirectory("C:\\Users\\503-26\\Desktop\\");
	fD.setVisible(true);
	String msg = fD.getDirectory() + fD.getFile();
	
	Label line1 = new Label(msg);
	add(line1);
	

	setVisible(true);
}
}
