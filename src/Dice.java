
public class Dice 
{
	private int roll = 0;
	private int aRoll = 0;
	private int aRoll1 = 0;
	private int roll1 = 0;
	private int bounce = 0;
	
	public int dices = 0;
	public int bounces = 0;
	public int average = 0;
	
	public Dice(int bounce) {
		this.bounce = bounce;
	}
	
	public void setBounce(int bounce)
	{
		this.bounce = bounces;
	}
	
	public int getBounce()
	{
		return bounces;
	}

	public int Throw(int dices)
	{
		for (int i = 0; i < dices * bounce; i++)
		{
			int range = (6 - 1) + 1;     
			roll = (int)(Math.random() * range) + 1;
			aRoll = aRoll+roll;
		}
		
	 	return roll = aRoll/bounce;
	}
	
	public int Throw(int dices, int bounces)
	{
		for (int i = 0; i < dices * bounces; i++)
		{
			int range = (6 - 1) + 1;     
			roll1 = (int)(Math.random() * range) + 1;
			aRoll1 = aRoll1+roll1;
		}
		
		average = aRoll1/dices; 

		return average;
	}
	
}
