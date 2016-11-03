
public class arrayLoop
{
    public static void main (String [] args)
    {
        int [] value = new int [50];
        
        for(int i = 1; i < 51; i++) {
           if (i % 2 == 0)
            {
                System.out.print("-" + i + " " );
                
            }
            else
            {
                
                System.out.print(i + " ");

            }
        }
    }
}