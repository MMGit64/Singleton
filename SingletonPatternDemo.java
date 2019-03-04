
public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//illegal construct
		//Compile time Error: The constructor 'Car()' is not visible
		//Car car = new Car();
		
		//'Get' the only object available
		
		Car car = Car.getInstance();
		
		//show message
		
		car.showMessage();

	}

}
