package awt_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event extends Frame {
	public Event() {
		//ũ������
		setBounds(100,100,500,500);
		//Ÿ��Ʋ
		setTitle("�̺�Ʈ ó��");
		//��ư����
		Button bt1 = new Button("�����ư");
		//���� ���� ������Ʋ���� ���� �� �г� ����
		Panel panel = new Panel();
		//�гο� ��ư �߰�
		panel.add(bt1);
		//�г��� �����쿡 �߰�
		add(panel);
		
		
		setVisible(true);
		
		//��ư�� ���� �� �̺�Ʈ ó���� ActionListener �������̽��� ó���մϴ�.
		ActionListener listener1 = new ActionListener() {
			//�������̽��� new�� �ٷ� �ν��Ͻ��� ���� �� �����ϴ�.
			//�׷��� listener1�� �����մϴ�.
			@Override
			public void actionPerformed(ActionEvent e) {
				//���α׷� ����
				System.exit(0);
			}
			
		};
		//��ư�� �����ʸ� ����
		bt1.addActionListener(listener1);
		//bt1�� ActionEvent�� �߻��ϸ� listener1�� �޼ҵ带 ȣ���Ѵ�.
	}
}
