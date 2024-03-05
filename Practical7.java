abstract class Vehicle{
	abstract int numWheels();
}


class Car extends Vehicle{
	int numWheels(){
		return 4;
	}
}


class Truck extends Vehicle{
	int numWheels(){
		return 6;
	}
}	


class Abstractmethod_07 {
	public static void main(String args[]){
		Car c1 = new Car();
		int Wheel1 = c1.numWheels();
		System.out.println("Total Wheel In Car Is : "+Wheel1);
		
		Truck t1 = new Truck();
		int Wheel2 = t1.numWheels();
		System.out.println("Total Wheel In Truck Is : "+Wheel2);
	}
}