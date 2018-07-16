package guiEx2;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class GuiEx2 extends Frame {

	public GuiEx2() {

		setTitle("GUI �ι�° ���α׷�");
		setLocation(100, 100);
		setSize(500, 500);

		Panel p = new Panel();

		Checkbox cb1 = new Checkbox("����");
		Checkbox cb2 = new Checkbox("������ �ڼ�");
		Checkbox cb3 = new Checkbox("���� ����");
		Checkbox cb4 = new Checkbox("����");
		Checkbox cb5 = new Checkbox("�÷�����");
		Checkbox cb6 = new Checkbox("�׸��׸���");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		p.add(cb5);
		p.add(cb6);

		// ���� ��ư �����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("����", group, true);
		Checkbox woman = new Checkbox("����", group, true);

		Choice ch = new Choice();
		ch.add("�ƺ� ����");
		ch.add("�����е� ����");
		ch.add("������ x");
		ch.add("��ǳ��");

		p.add(ch);

		p.add(man);
		p.add(woman);

		// 5���� �����ְ� ���� ���� ������ �� �ֵ��� ���ִ� ����Ʈ
		List list = new List(5, true);
		list.add("�ں���"); // 0
		list.add("�ڼ���"); // 1
		list.add("������"); // 2
		list.add("������"); // 3
		list.add("������"); // 4
		list.add("������"); // 5
		list.add("������"); // 6
		list.add("��伷"); // 7
		list.add("���ٴϿ�"); // 8
		list.add("�ÿ��"); // 9

		// list�� remove(int idx)�� �̿��ϸ� idx���縦 ���� �� �ֽ��ϴ�.
		// list.remove(0);
		// ù��°�� �ִ� c&c++�� 5��°�� �ִ� objective-c�� ���� -> 0���� 4���� ����
		// �������� ���� ���� �׻� �ڿ������� �����ؾ� �մϴ�.
		// bcz.�տ��� ����� ���� �ε����� ������ �ֱ� �����Դϴ�.
		// 0�� ����� ���� 4���� 3���� �˴ϴ�.
		list.remove(4);
		list.remove(0);

		p.add(list);

		add(p);
		setVisible(true);

	}

}
