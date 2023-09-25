package producerConsumer;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> questionList = null;
	final int LIMIT = 5;

	private int qestionNumber;

	public Producer(List<Integer> questionList) {
		this.questionList = questionList;
	}

	public void readQuestion(int qestionNumber) throws InterruptedException {
		synchronized (questionList) {
			while (questionList.size() == LIMIT) {
				System.out.println("Qustion have piled up: ");
				questionList.wait();
			}
		}
		synchronized (questionList) {
			System.out.println("New Question: " + qestionNumber);
			questionList.add(qestionNumber);
			Thread.sleep(100);
			questionList.notify();
		}

	}

	@Override
	public void run() {

		while (true) {
			try {
				readQuestion(qestionNumber++);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
