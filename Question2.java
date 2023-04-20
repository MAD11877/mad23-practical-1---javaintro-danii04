import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
   height = float(input("Enter your height in meters: "))
   weight = float(input("Enter your weight in kilograms: "))

# calculate BMI
bmi = weight / (height ** 2)

print("Your BMI is:", round(bmi, 2))
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
  }
}
