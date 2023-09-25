package threadPools;

public class MessageProcessor implements Runnable {

	public int message;

	public MessageProcessor(int message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "Receive message " + message);
		responseToMessage();
		System.out.println(Thread.currentThread().getName() + "Done processing message" + message);
	}

	private void responseToMessage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Unable to process the message" + message);
		}

	}

}
