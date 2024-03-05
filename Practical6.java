import java.util.*;

class NumberData{
	
	Scanner sc = new Scanner(System.in);
	
	float[] Array1 = new float[5];
	
	void Get_Array(){
	System.out.print("\n\nEnter The Array : ");	
	for(int i=0 ; i < Array1.length ; i++){
		Array1[i] = sc.nextFloat();
	}
	}
	
}



class Numplay extends NumberData{
	
	void Display_Num(){
		System.out.println("\n\nYour Entered Array Is : ");
		for(int i=0 ; i < Array1.length ; i++){
			System.out.println(Array1[i]);
			}
	}			
	
	
	int Sum = 0;
	void Sum_Array(){
		
		for(int i=0 ; i < Array1.length ; i++){
			Sum += Array1[i];
		}
		System.out.println("\n\nSum Of All Num Is : "+Sum);
	}
	
	
	void Average(){
			int Average = Sum/Array1.length;
		System.out.println("\nAverageOf All Num Is : "+Average);
	}
	
	
	void Maximum(){
		float Max = 0;
		for(int i=0 ; i < Array1.length ; i++){
			if(Max < Array1[i]){
				Max = Array1[i];
			}
		}
		System.out.println("\nMaximum Of All Num Is : "+Max);
	}
	
	void Minimum(){
		float Min = Array1[0];
		for(int i=0 ; i < Array1.length ; i++){
			if(Min > Array1[i]){
				Min = Array1[i];
			}
		}
		System.out.println("\nMinimum Of All Num Is : "+Min);
	}



		
}		




class Mathematics_06{
	public static void main(String args[]){
		Numplay n1 = new Numplay();
		n1.Get_Array();
		
		
		int ch;
		do{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\n\n******************MENU****************");
			System.out.println("01.Display The All Num : ");
			System.out.println("02.Sum Of All Number : ");
			System.out.println("03.Average Of All The Number: ");
			System.out.println("04.Maximum Of All The Numbers : ");
			System.out.println("05.Minimum Of All The Numbers : ");
			System.out.println("06.Exit : ");
			System.out.println("**************************************");
			
			System.out.print("\n\nEnter The Choice : ");
			ch = sc.nextInt();
			
			if(ch==1)
			{
				n1.Display_Num();				
			}
			else if(ch==2)
			{
				n1.Sum_Array();
			}
			else if(ch==3)
			{
				n1.Average();
			}
			else if(ch==4)
			{
				n1.Maximum();
			}
			else if(ch==5)
			{
				n1.Minimum();
			}
			else if(ch==6)
			{
				return;
			}
			else
			{
				System.out.println("\n\nInvalid Choise");
			}
					
		}while(ch!=6);

	} 
}
