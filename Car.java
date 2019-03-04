
public class Car {
	
	//create an object of 'Car'
	
	private static Car instance = new Car();
	
	//make the constructor private so the this class cannot 
	//be instantiated
	
	private Car() {
		
	}
	
	//'Get' the only object available
	
	public static Car getInstance() {
		return instance;
	
	}

	public void showMessage() {
		
		System.out.println("Nissan Micra");
	}

}
