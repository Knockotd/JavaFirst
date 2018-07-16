package guiEx1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;

public class GuiEx1 extends Frame {
	// 생성자

	public GuiEx1() {

		/*
		 * Dialog dialog = new Dialog(this, "대화상자"); // dialog.setTitle("대화상자");
		 * dialog.setSize(100, 100);
		 */

		this.setBackground(Color.ORANGE);
		setSize(500, 500);
		setLocation(100, 100);
		setTitle("나의 첫번째 윈도우 프로그램");

		Panel panel1 = new Panel();
		Button button = new Button("버튼");
		// 버튼의 배경색을 변경하는 스레드
		// ColorThread th1 = new ColorThread(button); - 클래스 지워도 되지만 공부를 위해서 남겨둠.
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
		Button button1 = new Button("버튼");
		// 버튼의 텍스트를 변경하는 스레드
		// TextThread th2 = new TextThread(button1);
		Thread th2 = new Thread() {
			public void run() {
				String[] text = { "버튼", "button", "단추", "클릭" };

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

		// add(button); 윈도우 크기로 너무 크게 만들어진다.

		// 버튼 추가
		panel1.add(button);
		button.setLabel("클릭");
		/*
		 * button.setBackground(Color.DARK_GRAY); button.setForeground(Color.white);
		 * button.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		 */

		panel1.add(button1);
		button1.setLabel("누르기");
		/*
		 * button1.setBackground(Color.DARK_GRAY); button1.setForeground(Color.white);
		 * button1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		 */

		// 패널을 프레임에 추가
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
