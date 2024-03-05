import java.util.*;

class MulArrayaddition_03{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
				
		int[][] Array1 = new int[3][3];
		int[][] Array2 = new int[3][3];
		int[][] Arraysum = new int[3][3];
		
		System.out.println("\n\nEnter The First The Araay : ");
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				Array1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n\nEnter The Second The Araay : ");
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				Array2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\n\nAraay 1 Is : ");
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				System.out.print(Array1[i][j]); 
			}
			System.out.println();
		}
		
		System.out.println("\n\nAraay 2 Is : ");
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				System.out.print(Array2[i][j]); 
			}
			System.out.println();
		}
		
		
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				Arraysum[i][j] = Array1[i][j] + Array2[i][j] ;
			}
		}
		
		
		System.out.println("\n\nSum Of Araay 1 And Array 2 Is : ");
		for(int i=0 ; i<3 ; i++)
		{
			for(int j=0 ; j<3 ; j++)
			{
				System.out.print(Arraysum[i][j]+" "); 
			}
			System.out.println();
		}
		
		
		
	}
}


