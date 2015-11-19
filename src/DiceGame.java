import java.util.Scanner;
public class DiceGame 
{

	public static void main(String[] args) 
	{
		int value = 0;
		int value1 = 0;
		//Scanner input = new Scanner(System.in);
		Dice dice = new Dice(3);
		
		//System.out.println("How many dices do you want to roll? ");
		//dices = input.nextInt();
		
		//System.out.println("How many bounces do you want? ");
		//bounces = input.nextInt();
		
		value = dice.Throw(1);;
		
		System.out.printf("The roll is: %d. \n", value);
		
		value1 = dice.Throw(1,1);
		
		System.out.printf("The roll is: %d.", value1);

	}

}
