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
		setTitle("�̺�Ʈ �ڵ鸵");

		// üũ�ڽ�

		// �г� ����
		Panel pn = new Panel();

		// üũ�ڽ� ����
		Checkbox ckboolean = new Checkbox("boolean");
		Checkbox ckbyte = new Checkbox("byte");
		Checkbox ckshort = new Checkbox("short");
		Checkbox ckchar = new Checkbox("char");
		Checkbox ckint = new Checkbox("int");
		Checkbox cklong = new Checkbox("long");
		Checkbox ckfloat = new Checkbox("float");
		Checkbox ckdouble = new Checkbox("double");

		// �гο� üũ�ڽ� ���
		pn.add(ckboolean);
		pn.add(ckbyte);
		pn.add(ckshort);
		pn.add(ckchar);
		pn.add(ckint);
		pn.add(cklong);
		pn.add(ckfloat);
		pn.add(ckdouble);

		// �г� ���ʿ� ��ġ
		add("North", pn);

		// �߾� ��, TextArea ��ġ
		TextArea ta = new TextArea(10, 70);
		add("Center", ta);

		// �ϴ� �� �޺��ڽ� 2�� ��ġ
		// �޺��ڽ��� ��ġ�� ������ �����
		String[] category = { "Programing", "Database", "IDE", "Framework" };
		// ī�װ� ������ 4���̸� {}�� 4��
		String[][] content = { { "Java", "JavaScript", "swift" }, { "Oracle", "MySQL", "MongoDB" },
				{ "Eclipse", "Android Studio", "XCode" }, { "Spring", "MyBatis", "Hibernate" } };

		// ���̽�
		Choice cbcategory = new Choice();
		for (String imsi : category) {
			cbcategory.add(imsi);
		}

		Choice cbcontent = new Choice();
		for (String imsi : content[0]) {
			cbcontent.add(imsi);
		}

		Button bt1 = new Button("����");
		Button bt2 = new Button("����");

		// �гο� ��ư �ֱ�

		// �гο� ���̽� �ֱ�
		Panel southPanel = new Panel();
		southPanel.add(cbcategory);
		southPanel.add(cbcontent);
		southPanel.add(bt1);
		southPanel.add(bt2);
		add("South", southPanel);

		ItemListener itemHandler1 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// �̺�Ʈ�� �߻��� �ν��Ͻ��� ������ �ڷ�����
				// Checkbox�� ��ȯ
				// �̺�Ʈ ó�� �޼ҵ忡��
				// e.getSource()�� �̺�Ʈ�� �߻���
				// �ν��Ͻ��� �ּҸ� �����մϴ�.
				Checkbox cb = (Checkbox) (e.getSource());
				// üũ �ڽ��� �Էµ� �ؽ�Ʈ ��������
				String label = cb.getLabel();
				// üũ �ڽ� ���� ���� ��������
				boolean b = cb.getState();
				ta.append(label + "" + b + "�� ����\n");
				ta.append(e.getSource());

			}
		};

		// üũ�ڽ��� ������ �� ȣ��� �ν��Ͻ� ����
		ckboolean.addItemListener(itemHandler1);
		ckbyte.addItemListener(itemHandler1);
		ckshort.addItemListener(itemHandler1);
		ckchar.addItemListener(itemHandler1);
		ckint.addItemListener(itemHandler1);
		cklong.addItemListener(itemHandler1);
		ckfloat.addItemListener(itemHandler1);
		ckdouble.addItemListener(itemHandler1);
		
		// ī�װ� �޺��ڽ��� ������ ����Ǿ��� ��
		// ȣ��� �޼ҵ带 ���� ������
		// �����۸����ʰ� ó��
		ItemListener itemHandler2 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// category�� ���õ� �� ��ȣ ��������
				int row = cbcategory.getSelectedIndex();
				// cbcontent�� ������ ���� ����
				cbcontent.removeAll();
				//���ȣ�� �ش��ϴ� ���� ������ cbcontent�� �߰�
				for(String temp : content[row]) {
					cbcontent.add(temp);
				}
			}
		};
		// ����
		cbcategory.addItemListener(itemHandler2);

		ActionListener action1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// category�� ���õ� �� ��ȣ ��������
				int caNum = cbcategory.getSelectedIndex();
				int coNum = cbcontent.getSelectedIndex();
				String categoryText = category[caNum];
				String contentText = content[caNum][coNum];
				ta.setText(categoryText+":"+contentText);
				//append-�߰�
				//setText-������
			}};
		
		bt1.addActionListener(action1);
		
		
		//���� ��ư�� ������ ���α׷� ����(System.exit(0))
		ActionListener action2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		};
		//����
		bt2.addActionListener(action2);
		
		setVisible(true);
	}
}
