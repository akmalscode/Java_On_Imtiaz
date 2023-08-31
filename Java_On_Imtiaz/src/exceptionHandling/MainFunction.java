package exceptionHandling;

public class MainFunction {

	public static void main(String[] args) {

		System.out.println("Custom Exception :");
		BusinessLogic businessLogic = new BusinessLogic();
		try {
			businessLogic.logicGate(9);
		} catch (CustomExceptionHandle e) {
			System.out.println("Error Found !");
			e.printStackTrace();
		}
	}
}
