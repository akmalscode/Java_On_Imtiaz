package multi_threads;

public class ThreadApps {

	public static void main(String[] args) {
		Task taskRunner = new Task();
		taskRunner.start();

		System.out.println("hallo world");

	}
}

class Task extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Numbers :" + i);
		}
	}
}
