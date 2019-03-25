/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/26/2019
 */

import java.util.Random;

public class QuestionArray {
	
	private static String[][] questions = new String[30][4];
	
	// fill 2D array with questions
	public static void fillArray() {
		
		// Kindergarten math
		questions[0][0] = "9 - 2 =";
		questions[1][0] = "6 + 3 =";
		questions[2][0] = "4 + 4 =";
		questions[3][0] = "2 + 7 =";
		questions[4][0] = "5 + 4 =";
		
		// Kindergarten science
		questions[0][1] = "What sound does a dog make?";
		questions[1][1] = "What do caterpillars become?";
		questions[2][1] = "What color is the grass?";
		questions[3][1] = "What animal goes \"Bwak!\"?";
		questions[4][1] = "All birds have which body part?";
		
		// Kindergarten history
		questions[0][2] = "In what state do you live?";
		questions[1][2] = "What colors make up the American flag?";
		questions[2][2] = "What type of animal is the bald eagle?";
		questions[3][2] = "How many red stripes are on the American flag?";
		questions[4][2] = "How many white stripes are on the American flag?";
		
		// Kindergarten English
		questions[0][3] = "Which color is spelt right?";
		questions[1][3] = "Which animal is spelt right?";
		questions[2][3] = "Select the missing letter. B_rd";
		questions[3][3] = "Select the missing number. 1 2 _ 4 5";
		questions[4][3] = "A T-Rex is a:";
		
		// 1st grade math
		questions[5][0] = "Is 3 an odd or even number?";
		questions[6][0] = "Which number is larger, 8 or 2?";
		questions[7][0] = "Which numbers are missing? 21 22 23 _ 25 26 _";
		questions[8][0] = "2 + ? = 5";
		questions[9][0] = "9 - 6 = ";
		
		// 1st grade science
		questions[5][1] = "Which is a vegetable?";
		questions[6][1] = "If it is snowing, is it hot or cold outside?";
		questions[7][1] = "How many fingers and toes do you have in total?";
		questions[8][1] = "How many legs do spiders have?";
		questions[9][1] = "Which animal lives in the sea?";
		
		// 1st grade history
		questions[5][2] = "How many states are in America?";
		questions[6][2] = "How many stars are on the American flag?";
		questions[7][2] = "At school, you sing the Pledge of _____?";
		questions[8][2] = "What is a mayor?";
		questions[9][2] = "Who was the 1st American President?";
		
		// 1st grade English
		questions[5][3] = "What are vowels?";
		questions[6][3] = "How many consonats does the word \"sunflower\" have?";
		questions[7][3] = "What is the correct spelling?";
		questions[8][3] = "Which is spelt correctly?";
		questions[9][3] = "What are the 5 W's?";
		
		// 2nd grade math
		questions[10][0] = "98 - 54 =";
		questions[11][0] = "121 + 157 =";
		questions[12][0] = "The Zoo has 6 rhinos and 9 wolves. How many animals are there?";
		questions[13][0] = "Will has 2 quarters and 7 pennies. How much money does Will have?";
		questions[14][0] = "73 - 21 = ";
		
		// 2nd grade science
		questions[10][1] = "What do plants need to grow?";
		questions[11][1] = "How many planets are in our solar system?";
		questions[12][1] = "How many layers make up the Earth?";
		questions[13][1] = "What part of the water cycle is rain?";
		questions[14][1] = "A warm-blooded vertebrate with fur is a ___?";
		
		// 2nd grade history
		questions[10][2] = "Who delivered the \"I have a dream\" speech?";
		questions[11][2] = "What are the four cardinal directions?";
		questions[12][2] = "What are the three branches of government?";
		questions[13][2] = "In which country were the famous pyraminds built?";
		questions[14][2] = "In which city is the Statue of Liberty?";
		
		// 2nd grade English
		questions[10][3] = "What punctuation is needed for this sentence? \"Who am I\"";
		questions[11][3] = "Which is spelt correctly?";
		questions[12][3] = "Similes use ___.";
		questions[13][3] = "Complete the sentence: \"Ava felt sick ___ lunch.\"";
		questions[14][3] = "Choose the adverb: \"The girl waited patiently.\"";
		
		// 3rd grade math
		questions[15][0] = "How many sides does a hexagon have?";
		questions[16][0] = "11 x 0 =";
		questions[17][0] = "10 x 4 =";
		questions[18][0] = "A lion eats 5 steaks daily. How many steaks does it eat in 4 days?";
		questions[19][0] = "778 - 291 =";
		
		// 3rd grade science
		questions[15][1] = "On which planet do we live?";
		questions[16][1] = "What mineral can be found in pennies?";
		questions[17][1] = "Which planet is known for its large ring that circles it?";
		questions[18][1] = "Which animal does NOT have a vertebra? ";
		questions[19][1] = "Which is of the following is NOT an insect?";
		
		// 3rd grade history
		questions[15][2] = "Who was the President during the Civil War? ";
		questions[16][2] = "Who is on the $5 bill?";
		questions[17][2] = "What is the capitol of Virginia?";
		questions[18][2] = "Who is the second president of the United States of America?";
		questions[19][2] = "Which northern state is by itself and connected to Canada?";
		
		// 3rd grade English
		questions[15][3] = "What is the plural form of cactus?";
		questions[16][3] = "Apply the appropriate pronoun: Jennifer told me that ___ had to go.";
		questions[17][3] = "Apply the appropriate pronoun: The kids asked ___  parents to join.";
		questions[18][3] = "Homophones: The dog wanted to play outside ___.";
		questions[19][3] = "Homophones: ___ 3rd graders just like you!";
		
		// 4th grade math
		questions[20][0] = "3/7 + 1/7 =";
		questions[21][0] = "9/3 =";
		questions[22][0] = "10 x 10 =";
		questions[23][0] = "99/9 =";
		questions[24][0] = "Ned has 3 bananas and 3 apples. What fraction of the fruit is bananas?";
		
		// 4th grade science
		questions[20][1] = "How many moons does Earth have?";
		questions[21][1] = "Which organism is lowest on the food chain?";
		questions[22][1] = "What keeps us on the ground and keeps us from floating into the sky?";
		questions[23][1] = "What is Magma?";
		questions[24][1] = "Which planet is the 7th away from the sun?";
		
		// 4th grade history
		questions[20][2] = "How many seas are there";
		questions[21][2] = "Who led slaves to freedom via the Underground Railroad?";
		questions[22][2] = "Which two countries were part of the Space Race?";
		questions[23][2] = "How many continents are there?";
		questions[24][2] = "What year did man set foot on the moon for the first time in history?";
		
		// 4th grade English
		questions[20][3] = "What is the suffix of the word \"Rapidly\"?";
		questions[21][3] = "What is the root word of the word \"Beautiful\"?";
		questions[22][3] = "Place the comma: Mom started cutting up carrots, celery and peppers.";
		questions[23][3] = "Select the best word: ___ umbrella is useful for when it rains.";
		questions[24][3] = "Select the best word: Mom waited for more than ___ hour in traffic.";
		
		// 5th grade math
		questions[25][0] = "11 x 23 =";
		questions[26][0] = "10 x 17 =";
		questions[27][0] = "239 x 53 =";
		questions[28][0] = "Improper Fraction: 11/5";
		questions[29][0] = "Gary needs 1 1/3 cups of milk for 1 meal. How many cups for 3 meals?";
		
		// 5th grade science
		questions[25][1] = "What is the term for when a liquid changes into gas?";
		questions[26][1] = "What do rings in a tree’s trunk say about the tree?";
		questions[27][1] = "How many moons does Mars have?";
		questions[28][1] = "What are the 4 soil types?";
		questions[29][1] = "Which has the highest rating on the hardness scale?";
		
		// 5th grade history
		questions[25][2] = "What was the first US state?";
		questions[26][2] = "How long was the United States in World War 2?";
		questions[27][2] = "What was World War I originally called?";
		questions[28][2] = "What happened at the Boston Massacre?";
		questions[29][2] = "Which African American leader helped lead the boycott of city buses?";
		
		// 5th grade English
		questions[25][3] = "Select the subject of the following sentence: \"I saw an albino crocodile!\"";
		questions[26][3] = "Select the predicate of the following sentence: \"The cats meow.\"";
		questions[27][3] = "Select the prepositional phrase: \"Before class, Josh asked for a pen.\"";
		questions[28][3] = "Where does the comma belong? \"Last winter school got canceled twice.\"";
		questions[29][3] = "Select the conjunctions: \"I like cooking and eating, but not doing dishes.\"";
	}
	
	// return question based on grade and topic
	public static String getQuestArray(String grade, String topic) {
		Random rand = new Random();
		int row = 0;
		int col = 0;
		
		if ( grade == "K" && topic == "math")
		{
			row = rand.nextInt(5);
			col = 0;
		}
		else if ( grade == "K" && topic == "science")
		{
			row = rand.nextInt(5);
			col = 1;
		}
		else if ( grade == "K" && topic == "history")
		{
			row = rand.nextInt(5);
			col = 2;
		}
		else if ( grade == "K" && topic == "english")
		{
			row = rand.nextInt(5);
			col = 3;
		}
		else if ( grade == "1" && topic == "math")
		{
			row = rand.nextInt(5) + 5;
			col = 0;
		}
		else if ( grade == "1" && topic == "science")
		{
			row = rand.nextInt(5) + 5;
			col = 1;
		}
		else if ( grade == "1" && topic == "history")
		{
			row = rand.nextInt(5) + 5;
			col = 2;
		}
		else if ( grade == "1" && topic == "english")
		{
			row = rand.nextInt(5) + 5;
			col = 3;
		}
		else if ( grade == "2" && topic == "math")
		{
			row = rand.nextInt(5) + 10;
			col = 0;
		}
		else if ( grade == "2" && topic == "science")
		{
			row = rand.nextInt(5) + 10;
			col = 1;
		}
		else if ( grade == "2" && topic == "history")
		{
			row = rand.nextInt(5) + 10;
			col = 2;
		}
		else if ( grade == "2" && topic == "english")
		{
			row = rand.nextInt(5) + 10;
			col = 3;
		}
		else if ( grade == "3" && topic == "math")
		{
			row = rand.nextInt(5) + 15;
			col = 0;
		}
		else if ( grade == "3" && topic == "science")
		{
			row = rand.nextInt(5) + 15;
			col = 1;
		}
		else if ( grade == "3" && topic == "history")
		{
			row = rand.nextInt(5) + 15;
			col = 2;
		}
		else if ( grade == "3" && topic == "english")
		{
			row = rand.nextInt(5) + 15;
			col = 3;
		}
		else if ( grade == "4" && topic == "math")
		{
			row = rand.nextInt(5) + 20;
			col = 0;
		}
		else if ( grade == "4" && topic == "science")
		{
			row = rand.nextInt(5) + 20;
			col = 1;
		}
		else if ( grade == "4" && topic == "history")
		{
			row = rand.nextInt(5) + 20;
			col = 2;
		}
		else if ( grade == "4" && topic == "english")
		{
			row = rand.nextInt(5) + 20;
			col = 3;
		}
		else if ( grade == "5" && topic == "math")
		{
			row = rand.nextInt(5) + 25;
			col = 0;
		}
		else if ( grade == "5" && topic == "science")
		{
			row = rand.nextInt(5) + 25;
			col = 1;
		}
		else if ( grade == "5" && topic == "history")
		{
			row = rand.nextInt(5) + 25;
			col = 2;
		}
		else if ( grade == "5" && topic == "english")
		{
			row = rand.nextInt(5) + 25;
			col = 3;
		}
		
		AnswerArray.setAnsArray(row, col);
		AnswerArray.setWrgArray(row, col);
		
		String questPass = questions[row][col];
		
		return questPass;
		
	}

}
