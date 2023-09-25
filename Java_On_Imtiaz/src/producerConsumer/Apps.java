package producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Apps {
	public static void main(String[] args) {

		List<Integer> questionList = new ArrayList<Integer>();

		Thread t1 = new Thread(new Producer(questionList));
		Thread t2 = new Thread(new Comsumer(questionList));

		t1.start();
		t2.start();

	}
}
