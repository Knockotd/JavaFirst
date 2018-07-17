package awt;

import java.awt.*;

public class TextfieldTest extends Frame {
	// ������ - �ν��Ͻ��� ���� �� ȣ���ϴ� �޼ҵ�
	public TextfieldTest() {
		// ũ��� ��ġ �� Ÿ��Ʋ ����
		setSize(500, 500);
		setLocation(100, 100);
		setTitle("�α���");

		// �г��� ����
		Panel panel = new Panel();
		Label label = new Label("���̵�");// ���� ����
		TextField txtId = new TextField(20);
		panel.add(label);
		panel.add(txtId);

		Label label1 = new Label("��й�ȣ");
		TextField txtPw = new TextField(20);
		txtPw.setEchoChar('*'); // �ؽ�Ʈ�� �Էµ� �� �������� ���� //(char)97 �̷��� ����ȯ �ص� �ȴ�.
		panel.add(label1);
		panel.add(txtPw);

		// ���� �� �Է��� �� �ִ� �ؽ�Ʈ ���� �����
		TextArea ta = new TextArea(10, 50); // �� ���� �� ��
		panel.add(ta);

		// �г��� �����ӿ� ����
		add(panel);

		// �޴��� �����
		MenuBar menuBar = new MenuBar();
		// �޴� ����
		Menu file = new Menu("����(F)");
		Menu newFile = new Menu("���θ���� >");
		file.add(newFile);
		MenuItem project = new MenuItem("������Ʈ");
		newFile.add(project);
		MenuItem package1 = new MenuItem("��Ű��");
		newFile.add(package1);
		MenuItem class1 = new MenuItem("Ŭ����");
		newFile.add(class1);
		MenuItem openFile = new MenuItem("����");
		file.add(openFile);
		MenuItem saveFile = new MenuItem("����");
		file.add(saveFile);
		MenuItem othersaveFile = new MenuItem("�ٸ��̸����� ����");
		file.add(othersaveFile);

		// �޴� ����
		Menu edit = new Menu("����(E)");
		MenuItem undoTyping = new MenuItem("�������");
		edit.add(undoTyping);
		MenuItem redoTyping = new MenuItem("�ٽý���");
		edit.add(redoTyping);

		// �޴��� �޴� �ٿ� ����
		menuBar.add(file);
		menuBar.add(edit);

		// �޴��ٸ� �����쿡 ��ġ
		setMenuBar(menuBar);

		// ȭ�����
		setVisible(true);
	}
}
