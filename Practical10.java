abstract class Vegetable{
	String Vegetable_Color;
	
	public Vegetable(String Vegetable_Color) {
        this.Vegetable_Color = Vegetable_Color;
    }
	
	abstract String Get_Name();
	
	public String toString() {
        return Get_Name() + " Color Is a : " + Vegetable_Color ;
    }
}

class Cabbage extends Vegetable{
	public Cabbage(String Vegetable_Color) {
        super(Vegetable_Color);
    }
	
	String Get_Name(){
		return "Cabbage";
	}
	
	
}

class Carrot extends Vegetable{
	public Carrot(String Vegetable_Color) {
        super(Vegetable_Color);
    }

	
	public String Get_Name(){
		return "Carrot";
	}
}

class Potato extends Vegetable{
	public Potato(String Vegetable_Color) {
        super(Vegetable_Color);
    }
	
	
	public String Get_Name(){
		return "Potato";
	}
}

class Practical10{
	public static void main(String args[]){
		Cabbage p1 = new Cabbage("Green");
		Carrot p2 = new Carrot("Red");
		Potato p3 = new Potato("Brown");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
}
