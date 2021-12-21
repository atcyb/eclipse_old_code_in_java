package decisionMakingAndBranching;

public class IfTest 
{
	public static void main(String[] args) 
	{
         int i, count, count1, count2;
         float[] weight = {45.0f , 55.0f , 47.0f ,51.0f , 54.0f};
         float[] height = {176.5f , 172.2f , 168.0f , 170.7f , 169.0f};
         count  = 0;
         count1 = 0;
         count2 = 0;
         for ( i = 0 ; i<=4 ; i++)
         { if(weight[i] < 50.0 && height[i] > 170.0)
    	     {
    	       count1 = count1 + 1;
    	     }
               count = count +1;//Total Persons
         }
         count2 = count - count1;
         System.out.println("Number of person with...");
         System.out.println("weight<50 and height>170 = "+count1);
         System.out.println("others = "+count2);
	}
}
