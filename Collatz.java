// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) 
	{
	    int seed = Integer.parseInt(args[0]);
		int series = 0, count = 1;
		String mode = args[1];

		if (mode.equals("c"))
		{
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
		else if (mode.equals("v"))
		{
		for (int i = 1; i < seed + 1; i++)
		{
			System.out.print(i);
			count = 1;
			if (i % 2 == 0)
			{
				series = i / 2;
			}
			else
			{
				series = (i * 3) + 1; 
			}
			while (series != 1)
			{
				System.out.print(" " + series);
				count++;
				if (series % 2 == 0)
			    {
				   series /= 2;
			    }
			   else
			    {
				   series = (series * 3) + 1; 
			    }
		    }
			System.out.print(" " + series);
			count++;
			System.out.println(" (" + count + ")");
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
	}
}
