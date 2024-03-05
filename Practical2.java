import java.util.*;

class Arrayreverse_02{
	public static void main(String args[]){
		
			float[] Num = new float[5];
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter The Array : ");
			for(int i = 0 ; i<5 ; i++){
				Num[i] = sc.nextFloat();
			}
			
			System.out.println("Array Is : ");
			for(float Ans:Num){
				System.out.println(Ans);
			}
			System.out.println("Reverse Array Is :");
			for(int i = 4 ; i >= 0 ; i--){
				System.out.println(Num[i]);
			}
	}
}
