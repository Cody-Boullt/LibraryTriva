/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/26/2019
 */

public class Score {
	private static int score = 0;
	private static int strikes = 0;
	private static int highScore = 0;
	
	public void setScore(int newScore)
	{
		if (newScore == 0)
		{
			score = 0;
		}
		
		score += newScore;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void setStrikes(int newStrike)
	{
		if (newStrike == 0)
		{
			strikes = 0;
		}
		
		strikes += newStrike;
	}
	
	public int getStrikes()
	{
		return strikes;
	}
	
	public void setHighScore(int newHighScore)
	{
		if (newHighScore > highScore)
		{
			highScore = newHighScore;
		}
	}
	
	public int getHighScore()
	{
		return highScore;
	}
}
