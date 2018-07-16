package guiEx1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;

public class GuiEx1 extends Frame {
	// ������

	public GuiEx1() {

		/*
		 * Dialog dialog = new Dialog(this, "��ȭ����"); // dialog.setTitle("��ȭ����");
		 * dialog.setSize(100, 100);
		 */

		this.setBackground(Color.ORANGE);
		setSize(500, 500);
		setLocation(100, 100);
		setTitle("���� ù��° ������ ���α׷�");

		Panel panel1 = new Panel();
		Button button = new Button("��ư");
		// ��ư�� ������ �����ϴ� ������
		// ColorThread th1 = new ColorThread(button); - Ŭ���� ������ ������ ���θ� ���ؼ� ���ܵ�.
		Thread th1 = new Thread() {
			public void run() {
				Color[] colors = { Color.BLACK, Color.blue, Color.CYAN, Color.GREEN };

				int count = 0;
				while (true) {
					try {
						Thread.sleep(500);
						button.setBackground(colors[count % colors.length]);
						count = count + 1;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th1.start();
		Button button1 = new Button("��ư");
		// ��ư�� �ؽ�Ʈ�� �����ϴ� ������
		// TextThread th2 = new TextThread(button1);
		Thread th2 = new Thread() {
			public void run() {
				String[] text = { "��ư", "button", "����", "Ŭ��" };

				int count = 0;
				while (true) {
					try {
						Thread.sleep(500);
						button1.setLabel(text[count % text.length]);
						count = count + 1;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th2.start();

		// add(button); ������ ũ��� �ʹ� ũ�� ���������.

		// ��ư �߰�
		panel1.add(button);
		button.setLabel("Ŭ��");
		/*
		 * button.setBackground(Color.DARK_GRAY); button.setForeground(Color.white);
		 * button.setFont(new Font("���� ���", Font.BOLD, 30));
		 */

		panel1.add(button1);
		button1.setLabel("������");
		/*
		 * button1.setBackground(Color.DARK_GRAY); button1.setForeground(Color.white);
		 * button1.setFont(new Font("���� ���", Font.BOLD, 30));
		 */

		// �г��� �����ӿ� �߰�
		add(panel1);

		setVisible(true);

		/*
		 * int sign = 1; while(true) { try { Thread.sleep(1000); if(sign > 0) {
		 * button.setBackground(Color.MAGENTA); }else {
		 * button.setBackground(Color.LIGHT_GRAY); } sign= -sign; } catch
		 * (InterruptedException e) { e.printStackTrace(); } }
		 */

	}
}
