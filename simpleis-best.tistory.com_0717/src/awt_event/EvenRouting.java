package awt_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenRouting extends Frame {
	public EvenRouting() {
		// ũ������
		setBounds(100, 100, 500, 500);
		// Ÿ��Ʋ
		setTitle("����� �̺�Ʈ");

		// ��ư����
		Button bt1 = new Button("�ѱ���");
		Button bt2 = new Button("����");
		Button bt3 = new Button("����");

		// ���̺� ����
		Label lb1 = new Label();

		// ���� ���� ������Ʋ���� ���� �� �г� ����
		Panel panel = new Panel();
		// �гο� ��ư �߰�
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		add("Center", panel);

		add("South", lb1);

		// �г��� �����쿡 �߰�
		add(panel);

		// �����츦 ȭ�鿡 ���
		setVisible(true);

		
		/////////////////////////////////////////////////////
		
	/*	//ActionEvent�� ó���� �� �ִ� �ν��Ͻ� �����
		ActionListener listener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb1.setText("�ȳ��ϼ���");
			}
			
		};
		//���۳�Ʈ�� �̺�Ʈ�� ó���� �� �ִ� ������ ����
		bt1.addActionListener(listener1);
		
		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lb1.setText("Hello");
			}
			
		};
		bt2.addActionListener(listener2);
		
		ActionListener listener3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		};
		bt3.addActionListener(listener3);
		*/
		
		/////////////////////////////////////////////////
		
		//�̺�Ʈ ����� - �ϳ��� �����ʰ� ���� ������Ʈ��
		//�̺�Ʈ�� ó���ϴ� ��
		
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//�̺�Ʈ�� �߻��� ������Ʈ�� ���ڿ��� ������ �б�
				//�� �޼ҵ��� �Ű����� ActionEvent e�� �̺�Ʈ�� �߻��� ���� �ּҸ� ������ �ִ�.
				//��ȯ�� �� �ִ� �����δ� e.getSource()�� e.getActionCommand()�� �ִ�.
				switch(e.getActionCommand()) {
				case "�ѱ���" :
					lb1.setText("�ȳ��ϼ���");
					break;
				case "����" :
					lb1.setText("Hello");
					break;
				case "����" : 
					System.exit(0);
					break;
				}
			}
			
		};
		//3�� ��ư�� �׼� �̺�Ʈ�� listener�� ��� ó��
		bt1.addActionListener(listener);
		bt2.addActionListener(listener);
		bt3.addActionListener(listener);
		
		
		
		
		
	}
}
