interface Number{
	int Num(int p,int q);
}

class Sum implements Number{
	
	public int Num(int x,int y){
		return x+y;
	}

}

class Average implements Number{
	
	public int Num(int x,int y){
		return (x+y)/2;
	}

}

class AverageTwo_05{
	public static void main(String args[]){
		Sum s1 = new Sum();
		int Ans1 = s1.Num(5,8);
		System.out.println("Sum Of Two Num Is : " +Ans1);
		Average a1 = new Average();
		int Ans2 = a1.Num(5,8);
		System.out.println("Average Of Two Num Is : " +Ans2);
	}
}
