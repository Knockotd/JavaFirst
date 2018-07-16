package guiEx1;

import java.awt.Button;

public class TextThread extends Thread {
	private Button button1;

	public TextThread(Button button1) {

		this.button1 = button1;

	}

	public void run() {
		String [] text = {"클릭", "누르기", "이동", "확인", "Apply"};
		
		int idx1 = 0;
		while(true) {
			idx1 = idx1+1;
			try {
				Thread.sleep(1000);
				button1.setLabel(text[idx1 % text.length]);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
