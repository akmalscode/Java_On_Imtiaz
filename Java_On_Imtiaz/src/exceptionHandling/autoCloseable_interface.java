package exceptionHandling;

class MyClass implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing.....");

	}

}

public class autoCloseable_interface {

	public static void main(String[] args) {

		try (MyClass myClass = new MyClass();) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
