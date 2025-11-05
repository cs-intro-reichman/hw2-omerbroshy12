// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) 
        {
	    String word = args[0];
            int num = Integer.parseInt(args[1]);
            char letter;
            for (int i = 0; i < word.length(); i++)
            {
                letter = word.charAt(i);
                if (letter == 'A' || letter == 'E' || letter == 'F' || letter == 'H' || letter == 'I' || letter == 'L' || letter == 'M' || letter == 'N' || letter == 'O' || letter == 'R' || letter == 'S' || letter == 'X')
                {
                   System.out.println("Give me an " + letter + ": " + letter + "!");
                }
                else
                {
                   System.out.println("Give me a  " + letter + ": " + letter + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int j = 0; j < num; j++)
            {
                System.out.println(word + "!!!");
            }
        }
}
