package producerConsumer;

import java.util.List;

public class Comsumer implements Runnable {

	List<Integer> questionList = null;

	public Comsumer(List<Integer> questionList) {
		this.questionList = questionList;
	}

	public void answerQuestion() throws InterruptedException {
		synchronized (questionList) {
			while (questionList.isEmpty()) {
				System.out.println("No question to answer....wait for producer ");
				questionList.wait();
			}
		}
		synchronized (questionList) {
			Thread.sleep(500);
			System.out.println("Answerd questions....: " + questionList.remove(0));
			questionList.notify();
		}

	}

	@Override
	public void run() {

		while (true) {
			try {
				answerQuestion();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
