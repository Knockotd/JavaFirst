package awt;

import java.awt.*;
import java.util.Random;

public class LayoutEx_1 extends Frame {
public LayoutEx_1(){
	//��ġ&ũ�� ����
	setBounds(200,200,400,400);
	//���� ����
	setTitle("���̾ƿ� ����");
	
	
	Panel panel1 = new Panel();
/*	//panel1�� ���̾ƿ��� ����
	panel1.setLayout(new FlowLayout());

	
	
	//������Ʈ ��ġ
	Button bt1 = null; //����� ���� �ۿ��� �ѹ��� ����� �ݺ��� �ȿ����� ���� ��� �ʱ�ȭ ��ŵ�ϴ�.
	for(int i=0; i<10; i++) {
		
		bt1 = new Button("��ư"+i);
		
		panel1.add(bt1);
		
	}//�ݺ��� ������ bt1�� ������ϴ�. �ݺ��� �ȿ��� ��� ��������� ������� �մϴ�.
	*/
	
	/*panel1.setLayout(new BorderLayout());
	Button btw = new Button("����");
	panel1.add("West", btw);
	Button bte = new Button("����");
	panel1.add("East", bte);
	Button btc = new Button("�߾�");
	panel1.add("Center", btc);
	Button bts = new Button("����");
	panel1.add("South", bts);
	Button btn = new Button("����");
	panel1.add("North", btn);*/
	
	/*Button bt2 = null;
	panel1.setLayout(new GridLayout(2,3,10,10));
	for(int i=0; i<10; i++) {
		bt2 = new Button("��ư"+(i+1));
		panel1.add(bt2);
	}*/
	
	panel1.setLayout(null);
	Label label = new Label("@");
	//��ġ�� ���� �Ź� �����־�� �մϴ�.
	//������Ʈ�� ũ��� ��ġ�� ������� ������ �� �־� �����̴� ���� ���� �� �־�, ������ �Ǳ⵵ �մϴ�.
	label.setBounds(10,10,200,200);
	add(label);
	
	add(panel1);
	/*//ȭ�� ũ�� ������ ���ϵ��� ����
	setResizable(false);
	*/
	
	
	//ȭ�� ���
	setVisible(true);
	//�����带 ���� ������ ����� ���
	Thread thread = new Thread() {
		public void run() {
			while(true) {
				//���� ���̺��� ��ġ�� ��������
				int x = label.getLocation().x;
				int y = label.getLocation().y;
				Random r = new Random();
				//label.setLocation(x+10, y);
				label.setLocation(r.nextInt(400), r.nextInt(400));
				try {
					Thread.sleep(100);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	thread.start();
}
}
