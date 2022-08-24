
public class Frequency {

	public static void main (String [] args)
	{
	  int N = 10;
	  int f [] = {1,2,3,4,5,6,7,8,9,10};



	  int Freqeven = 0;
	  int FreqOdd = 0;
	  int n = 0;


	   while (n < N)
	   {
		  if(n % 2 == 0)
		  {
			 Freqeven = Freqeven +1;
		  System.out.println("The number is even \n"+ Freqeven);
		  }else if (n % 2 != 0)
		  {
			  FreqOdd = FreqOdd + 1;
			  System.out.println("The number is odd \n" + FreqOdd);
		  }
		  n = n + 1;
	   }
	}
}
