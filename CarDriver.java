
import java.util.Scanner;
public class CarDriver {
	

	public static void main(String[] args) {
	Car car1 = new Car();
	Car car2 = new Car("red", 500);
	Car car3 = new Car("orange", 800, 1000, "Toyota");
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter the color of car one.");
	String color = keyboard.next();
	car1.setColor(color);
	System.out.println("Please enter the horse power of car one.");
	int horsePower = keyboard.nextInt();
	car1.setHorsePower(horsePower);
	System.out.println("Please enter the engine size of car one.");
	int engineSize1 = keyboard.nextInt();
	car1.setEngineSize(engineSize1);
	System.out.println("Please enter the make of car one.");
	String make1 = keyboard.next();
	car1.setMake(make1);
	System.out.println("Here are the details of your first car: " + car1.toString());
	System.out.println("The second care is " + car2.getColor() + " and the horse power is " + car2.getHorsePower()
			+ ". Please enter the engine size of the second car.");
	int engineSize2 = keyboard.nextInt();
	car2.setEngineSize(engineSize2);
	System.out.println("Please enter the make of the second car.");
	String make2 = keyboard.next();
	car2.setMake(make2);
	System.out.println("Here are the details of your second car: " + car2.toString());
	System.out.println("Here are the details of the third car we have created: " + car3.toString());
	
	
	
	
	}

}
