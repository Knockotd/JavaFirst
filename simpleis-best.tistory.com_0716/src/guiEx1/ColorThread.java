package guiEx1;

import java.awt.*;

public class ColorThread extends Thread {

	private Button button;

	public ColorThread(Button button) {
		this.button = button;
	}

	public void run() {
		//한정된 값중에서 출력하고 싶을 때는 아래와 같이 배열을 만들어서 배열 길이로 증가값을 나눈 나머지로 출력하면 됩니다.
		Color[] colors = { Color.red, Color.ORANGE, Color.green, Color.BLACK };

		int idx = 0;
		while (true) {

			try {
				idx = idx + 1;
				Thread.sleep(1000);

				button.setBackground(colors[idx % colors.length]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
