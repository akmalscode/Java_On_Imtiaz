package multi_threads;

public class ThreadApps5 {
	public static void main(String[] args) {

		Sequence sequence = new Sequence();

		Worker worker1 = new Worker(sequence);
		worker1.start();

		Worker worker2 = new Worker(sequence);
		worker2.start();

	}

}

class Worker extends Thread {
	Sequence sequence = null;

	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + "Get valued: " + sequence.getNext());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
