package guiEx1;

import java.awt.*;

public class ColorThread extends Thread {

	private Button button;

	public ColorThread(Button button) {
		this.button = button;
	}

	public void run() {
		//������ ���߿��� ����ϰ� ���� ���� �Ʒ��� ���� �迭�� ���� �迭 ���̷� �������� ���� �������� ����ϸ� �˴ϴ�.
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
