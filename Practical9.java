abstract class Calculation{
	abstract void Area();
}


class Rectangle extends Calculation{
	void Area(){
		System.out.println("Area Of Rectangle Is : (Length * Width)");
	}
}

class Triangle extends Calculation{
	void Area(){
		System.out.println("Area Of Triangle Is : 1/2(Base * Height Of Triangle)");
	}
}


class Practical9{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle();
		r1.Area();
		
		Triangle t1 = new Triangle();
		t1.Area();
	}
}