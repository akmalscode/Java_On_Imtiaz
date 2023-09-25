package multi_threads;

public class Sequence {

	private int value = 0;

	public int getNext() { // we can also used synchronized
		synchronized (this) {
			value++;
			return value;
		}

	}
}
