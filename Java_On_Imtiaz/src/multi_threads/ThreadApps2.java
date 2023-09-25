package multi_threads;

public class ThreadApps2 {

	public static void main(String[] args) {

		System.out.println("Thread 1");
		Task2 taskRunner = new Task2();
		taskRunner.start();

		System.out.println("hallo world");

		System.out.println("Thread 2");
		Task2 taskRunner2 = new Task2();
		taskRunner2.start();

	}
}

class Task2 extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {

			System.out.println("number of thread : " + i + " " + Thread.currentThread().getName());

		}
	}
}
