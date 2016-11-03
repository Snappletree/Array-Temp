import java.util.Scanner;
import java.util.stream.*;
public class Temp
{
    public static void main (String [] args)
    {
        int x;
        int y;
        int avg;
        int sum;
        int above = 0;


        Scanner reader = new Scanner(System.in);
        System.out.println("How many days do you want to give the temperature for?");

        x = reader.nextInt();

        int [] temp = new int [x+1];

        for ( int i = 0; i < x; i++)
        {
            System.out.println("What is the temperature for day #" + i);

            y = reader.nextInt();
            temp[i] = y;

        } 
        sum = IntStream.of(temp).sum();

        avg = sum/x;
        System.out.println("The avarage temprature for " + x + " days is " + avg);

        for ( int l = 0; l<x; l++)
        {
            if (temp[l] > avg )
            {
                System.out.println("The temprature thats above the avarage is " + temp[l] );
                above++;
            }
             else
            {
                System.out.println(temp[l]+" is not above avg");
            }
        }
        
        System.out.println(above+" total temperatures were above avg");
    }
}
