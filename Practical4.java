import java.util.*;

class Practical4{
    public static void main(String args[])
    {
        int lowest=0;
        Scanner sc=new Scanner(System.in);
        String nm[]=new String[5];
        Double price[]=new Double[5];

        for(int i=0;i<5;i++)
        {
            System.out.println("please enter company name");
            nm[i]=sc.next();
            System.out.println("please enter company price");
            price[i]=sc.nextDouble();
        }
        for(int i=0;i<5;i++)
        {
            if(price[i] < price[lowest])
            {
                lowest=i;
            }
        }
        System.out.println("the company who quated lowest amount :"+nm[lowest]);
    }
}
	
	 