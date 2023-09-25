package multi_threads;

public class ThreadApps4 {
	public static void main(String[] args) {

		// approch 1
		System.out.println("Thread 1");
		Task4 taskRunner4 = new Task4("Thread A");
		Thread t1 = new Thread(taskRunner4);
		t1.start();

		System.out.println("hallo world");

		// approch 2
		System.out.println("Thread 2");
		Thread t2 = new Thread(new Task4("Thread B"));
		t2.start();

		// approch 2=3
		System.out.println("Thread 3");
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 100; i++) {

					System.out.println("number of thread : " + i + " " + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		t3.start();

	}
}

class Task4 implements Runnable {

	String name;

	public Task4(String name) {
		this.name = name;
	}

	public void run() {
		Thread.currentThread().setName(this.name);
		for (int i = 0; i < 100; i++) {

			System.out.println("number of thread : " + i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
