package exceptionHandling;

public class BusinessLogic {

	public int logicGate(int number) throws CustomExceptionHandle {

		if (number < 10) {
			throw new CustomExceptionHandle("The number is smaller then 10");
		}
		return number - 5;
	}
}
