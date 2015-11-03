
public class Car {
	private String color;
	private int horsePower;
	private int engineSize;
	private String make;
	
	public Car(){
		this.color = "";
		this.horsePower = 0;
		this.engineSize = 0;
		this.make = "";
	}
	public Car(String color){
		this.color = color;
		this.horsePower = 0;
		this.engineSize = 0;
		this.make = "";
	}
	public Car(String color, int horsePower){
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = 0;
		this.make = "";
	}
	public Car(String color, int horsePower, int engineSize){
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = "";
	}
	public Car(String color, int horsePower, int engineSize, String make){
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;
	
	}
	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public int getHorsePower(){
		return this.horsePower;
	}
	public void setHorsePower(int horsePower){
		this.horsePower = horsePower;
	}
	public int getEngineSize(){
		return this.engineSize;
	}
	public void setEngineSize(int engineSize){
		this.engineSize = engineSize;
	}
	public String getMake(){
		return this.make;
	}
	public void setMake(String make){
		this.make = make;
	}
	public String toString(){
		return "Car color is " + this.color + ", the horse power is " + this.horsePower +
				", the engine size is " + this.engineSize + ", and the make is " + this.make + ".";
	}
}
