class Arrayshort_01
{
    public static void main(String args[])
    {
         int[] Num = new int[args.length];

         for(int i=0;i<args.length;i++)
         {
            Num[i]=Integer.parseInt(args[i]);
         }
         System.out.println("before sorting");
         for(int Ans:Num)
         {
            System.out.println(Ans);
         }
        for(int i=0;i<Num.length-1;i++)
        {
            for(int j=i+1;j<Num.length;j++)
            {
                if(Num[j] < Num[i])
                {
                    int tmp=Num[j];
                    Num[j]=Num[i];
                    Num[i]=tmp;
                }
            }
        }
        System.out.println("after sorting");
        for(int Ans:Num)
        {
            System.out.println(Ans);
        }
    }
}