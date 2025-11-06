// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
	    int numOfRep = Integer.parseInt(args[0]);
		double sum = 1;
		double div = 3;
		for (int i = 0; i < numOfRep - 1; i++)
		{
		   if (i % 2 == 0)
		   {
			sum -= (1/div);
		   }
		   if (i % 2 == 1)
		   {
			sum += (1/div);
		   }
		   div += 2;
		}
		sum *= 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum);
	}
}
