interface Exam{
	boolean Pass(int Mark);
}

interface Classify{
	String Division(int average);
}



class Result implements Exam,Classify{
	
	public boolean Pass(int Mark){
		return Mark>=35;
	}
	
	
	public String Division(int average){
		if(average>=60)
		{
			return "First";
		}
		else if(average>=50 && average<60)
		{
			return "Second";
		}
		else
		{
			return "No Division";
		}
	}
	
	
}

class Practical8{
	public static void main(String args[]){
		
		Result r1 = new Result();
		
		int marks = 40;
        boolean isPass = r1.Pass(marks);
        System.out.println("Is Passed: " + isPass);

        int average = 55;
        String divisionResult = r1.Division(average);
        System.out.println("Division: " + divisionResult);
	}
}


