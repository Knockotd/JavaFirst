package awt;

import java.awt.*;

public class CommonsDialog extends Frame {
	//������ - �ν��Ͻ��� ������ �� ȣ���ϴ� �޼ҵ�
public CommonsDialog() {
	//��ġ�� ũ�⸦ ����(���� �ΰ��� ��ġ, ���� �ΰ��� ũ��)
	setBounds(200, 200, 600, 600);
	//���� ����
	setTitle("���� ��ȭ ����");
	
	//���� ��ȭ���� �����
	//FileDialog�� ������ �� ù��° �Ű������� Dialog �� Frame�� �ּ��ε� ������ ���� this�� �����ظ� �˴ϴ�.
	FileDialog filedialog = new FileDialog(this, "���� ��ȭ����");
	//���丮 ����
	filedialog.setDirectory("C:\\Users\\503-26\\Desktop");
	//���� ��ȭ���ڸ� ȭ�鿡 ���
	filedialog.setVisible(true);
	
	//������ ���� ��� ��������
	String filepath = filedialog.getDirectory() + filedialog.getFile();
	
	Label label = new Label(filepath);
	add(label);
	
	//ȭ�� ���
	setVisible(true);
}
}
