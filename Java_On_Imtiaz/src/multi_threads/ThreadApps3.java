package multi_threads;

public class ThreadApps3 {
	public static void main(String[] args) {

		System.out.println("Thread 1");
		Task3 taskRunner = new Task3("Thread A");
		taskRunner.start();

		System.out.println("hallo world");

		System.out.println("Thread 2");
		Task3 taskRunner3 = new Task3("Thread B");
		taskRunner3.start();

	}
}

class Task3 extends Thread {

	String name;

	public Task3(String name) {
		this.name = name;
	}

	public void run() {
		Thread.currentThread().setName(this.name);
		for (int i = 0; i < 100; i++) {

			System.out.println("number of thread : " + i + " " + Thread.currentThread().getName());
		}
	}
}
