/*
 * Team Compilation
 * Cody Boullt, Richard Creech, Alexandre Hoppe
 * 03/26/2019
 */

public class AnswerArray {
	
	private static String[][] answers = new String[30][4];
	private static String[][][] wrongAnswers = new String[30][4][3];
	private static String corrAns;
	private static String wrgAnsOne, wrgAnsTwo, wrgAnsThree;
	
	// fill 2D array with correct answers
	public static void fillArray() {
		
		// Kindergarten math
		answers[0][0] = "7";
		answers[1][0] = "9";
		answers[2][0] = "8";
		answers[3][0] = "9";
		answers[4][0] = "9";
		
		// Kindergarten science
		answers[0][1] = "Bark";
		answers[1][1] = "Butterflies";
		answers[2][1] = "Green";
		answers[3][1] = "Chicken";
		answers[4][1] = "Beak";
		
		// Kindergarten history
		answers[0][2] = "Virginia";
		answers[1][2] = "Red, White, and Blue";
		answers[2][2] = "Bird";
		answers[3][2] = "7";
		answers[4][2] = "6";
		
		// Kindergarten English
		answers[0][3] = "Blue";
		answers[1][3] = "Cat";
		answers[2][3] = "i";
		answers[3][3] = "3";
		answers[4][3] = "Dinosaur";
		
		// 1st grade math
		answers[5][0] = "odd";
		answers[6][0] = "8";
		answers[7][0] = "24 and 27";
		answers[8][0] = "3";
		answers[9][0] = "3";
		
		// 1st grade science
		answers[5][1] = "Corn";
		answers[6][1] = "Cold";
		answers[7][1] = "20";
		answers[8][1] = "8";
		answers[9][1] = "Fish";
		
		// 1st grade history
		answers[5][2] = "50";
		answers[6][2] = "50";
		answers[7][2] = "Allegiance";
		answers[8][2] = "Runs the city.";
		answers[9][2] = "George Washington";
		
		// 1st grade English
		answers[5][3] = "A, I, E, O, and U";
		answers[6][3] = "6";
		answers[7][3] = "Apple";
		answers[8][3] = "House";
		answers[9][3] = "Who, What, When, Where, and Why";
		
		// 2nd grade math
		answers[10][0] = "44";
		answers[11][0] = "278";
		answers[12][0] = "15";
		answers[13][0] = "57 cents";
		answers[14][0] = "52";
		
		// 2nd grade science
		answers[10][1] = "Water";
		answers[11][1] = "8";
		answers[12][1] = "3";
		answers[13][1] = "Precipitation";
		answers[14][1] = "Mammal";
		
		// 2nd grade history
		answers[10][2] = "Martin Luther King Jr.";
		answers[11][2] = "North, South, East, and West";
		answers[12][2] = "Executive, Judicial, and Legislative";
		answers[13][2] = "Egypt";
		answers[14][2] = "New York";
		
		// 2nd grade English
		answers[10][3] = "?";
		answers[11][3] = "Giraffe";
		answers[12][3] = "\"Like\" or \"As\"";
		answers[13][3] = "after";
		answers[14][3] = "patiently";
		
		// 3rd grade math
		answers[15][0] = "6";
		answers[16][0] = "0";
		answers[17][0] = "40";
		answers[18][0] = "20";
		answers[19][0] = "487";
		
		// 3rd grade science
		answers[15][1] = "Earth";
		answers[16][1] = "Copper";
		answers[17][1] = "Saturn";
		answers[18][1] = "Octopus";
		answers[19][1] = "Turtle";
		
		// 3rd grade history
		answers[15][2] = "Abraham Lincoln";
		answers[16][2] = "Abraham Lincoln";
		answers[17][2] = "Richmond";
		answers[18][2] = "John Adams";
		answers[19][2] = "Alaska";
		
		// 3rd grade English
		answers[15][3] = "Cacti";
		answers[16][3] = "she";
		answers[17][3] = "their";
		answers[18][3] = "too";
		answers[19][3] = "They're";
		
		// 4th grade math
		answers[20][0] = "4/7";
		answers[21][0] = "3";
		answers[22][0] = "100";
		answers[23][0] = "11";
		answers[24][0] = "1/2";
		
		// 4th grade science
		answers[20][1] = "1";
		answers[21][1] = "Caterpillar";
		answers[22][1] = "Gravity";
		answers[23][1] = "Molten rock in Earth's crust";
		answers[24][1] = "Uranus";
		
		// 4th grade history
		answers[20][2] = "7";
		answers[21][2] = "Harriet Tubman";
		answers[22][2] = "United States and Soviet Union";
		answers[23][2] = "7";
		answers[24][2] = "1969";
		
		// 4th grade English
		answers[20][3] = "-ly";
		answers[21][3] = "Beauty";
		answers[22][3] = "Mom started cutting up carrots, celery, and peppers.";
		answers[23][3] = "An";
		answers[24][3] = "An";
		
		// 5th grade math
		answers[25][0] = "253";
		answers[26][0] = "170";
		answers[27][0] = "12,667";
		answers[28][0] = "2 1/5";
		answers[29][0] = "4 cups";
		
		// 5th grade science
		answers[25][1] = "Evaporation";
		answers[26][1] = "Age";
		answers[27][1] = "2";
		answers[28][1] = "Topsoil, Subsoil, Parent Material, and Bedrock";
		answers[29][1] = "Diamond";
		
		// 5th grade history
		answers[25][2] = "Delaware";
		answers[26][2] = "4 years";
		answers[27][2] = "The Great War";
		answers[28][2] = "British fired guns into a hostile crowd of colonists";
		answers[29][2] = "Rosa Park";
		
		// 5th grade English
		answers[25][3] = "I";
		answers[26][3] = "meow";
		answers[27][3] = "Before class";
		answers[28][3] = "Last winter, school got canceled twice.";
		answers[29][3] = "and & but";
	}
	
	// fill 3D array with wrong answers
	public static void fillFalseArray() {
		
		// Kindergarten math
		wrongAnswers[0][0][0] = "5";
		wrongAnswers[0][0][1] = "6";
		wrongAnswers[0][0][2] = "8";
		
		wrongAnswers[1][0][0] = "8";
		wrongAnswers[1][0][1] = "7";
		wrongAnswers[1][0][2] = "10";
		
		wrongAnswers[2][0][0] = "7";
		wrongAnswers[2][0][1] = "6";
		wrongAnswers[2][0][2] = "9";
		
		wrongAnswers[3][0][0] = "8";
		wrongAnswers[3][0][1] = "7";
		wrongAnswers[3][0][2] = "10";
		
		wrongAnswers[4][0][0] = "8";
		wrongAnswers[4][0][1] = "7";
		wrongAnswers[4][0][2] = "10";
		
		// Kindergarten science
		wrongAnswers[0][1][0] = "Meow";
		wrongAnswers[0][1][1] = "Chirp";
		wrongAnswers[0][1][2] = "Moo";
		
		wrongAnswers[1][1][0] = "Flies";
		wrongAnswers[1][1][1] = "Birds";
		wrongAnswers[1][1][2] = "Bees";
		
		wrongAnswers[2][1][0] = "Blue";
		wrongAnswers[2][1][1] = "Red";
		wrongAnswers[2][1][2] = "Yellow";
		
		wrongAnswers[3][1][0] = "Cow";
		wrongAnswers[3][1][1] = "Horse";
		wrongAnswers[3][1][2] = "Dog";
		
		wrongAnswers[4][1][0] = "Teeth";
		wrongAnswers[4][1][1] = "Fins";
		wrongAnswers[4][1][2] = "Fur";
		
		// Kindergarten history
		wrongAnswers[0][2][0] = "Ohio";
		wrongAnswers[0][2][1] = "Texas";
		wrongAnswers[0][2][2] = "Florida";
		
		wrongAnswers[1][2][0] = "Red, White, and Green";
		wrongAnswers[1][2][1] = "Red, Yellow, and Blue";
		wrongAnswers[1][2][2] = "Purple, White, and Blue";
		
		wrongAnswers[2][2][0] = "Mammal";
		wrongAnswers[2][2][1] = "Insect";
		wrongAnswers[2][2][2] = "Fish";
		
		wrongAnswers[3][2][0] = "8";
		wrongAnswers[3][2][1] = "9";
		wrongAnswers[3][2][2] = "5";
		
		wrongAnswers[4][2][0] = "5";
		wrongAnswers[4][2][1] = "4";
		wrongAnswers[4][2][2] = "7";
		
		// Kindergarten English
		wrongAnswers[0][3][0] = "Blu";
		wrongAnswers[0][3][1] = "Redd";
		wrongAnswers[0][3][2] = "Gren";
		
		wrongAnswers[1][3][0] = "Dag";
		wrongAnswers[1][3][1] = "Caat";
		wrongAnswers[1][3][2] = "Coww";
		
		wrongAnswers[2][3][0] = "u";
		wrongAnswers[2][3][1] = "o";
		wrongAnswers[2][3][2] = "e";
		
		wrongAnswers[3][3][0] = "2";
		wrongAnswers[3][3][1] = "4";
		wrongAnswers[3][3][2] = "6";
		
		wrongAnswers[4][3][0] = "Bird";
		wrongAnswers[4][3][1] = "Lizard";
		wrongAnswers[4][3][2] = "Mammal";
		
		
		// 1st grade math
		wrongAnswers[5][0][0] = "even";
		wrongAnswers[5][0][1] = "both";
		wrongAnswers[5][0][2] = "neither";
		
		wrongAnswers[6][0][0] = "2";
		wrongAnswers[6][0][1] = "They are equal";
		wrongAnswers[6][0][2] = "I don't know";
		
		wrongAnswers[7][0][0] = "24";
		wrongAnswers[7][0][1] = "27";
		wrongAnswers[7][0][2] = "20 and 28";
		
		wrongAnswers[8][0][0] = "2";
		wrongAnswers[8][0][1] = "4";
		wrongAnswers[8][0][2] = "5";
		
		wrongAnswers[9][0][0] = "6";
		wrongAnswers[9][0][1] = "9";
		wrongAnswers[9][0][2] = "0";
		
		
		// 1st grade science
		wrongAnswers[5][1][0] = "Apple";
		wrongAnswers[5][1][1] = "Banana";
		wrongAnswers[5][1][2] = "Strawberry";
		
		wrongAnswers[6][1][0] = "Hot";
		wrongAnswers[6][1][1] = "Both";
		wrongAnswers[6][1][2] = "Neither";
		
		wrongAnswers[7][1][0] = "10";
		wrongAnswers[7][1][1] = "5";
		wrongAnswers[7][1][2] = "15";
		
		wrongAnswers[8][1][0] = "6";
		wrongAnswers[8][1][1] = "4";
		wrongAnswers[8][1][2] = "2";
		
		wrongAnswers[9][1][0] = "Birds";
		wrongAnswers[9][1][1] = "Insects";
		wrongAnswers[9][1][2] = "Dinosaurs";
		
		
		// 1st grade history
		wrongAnswers[5][2][0] = "10";
		wrongAnswers[5][2][1] = "25";
		wrongAnswers[5][2][2] = "13";
		
		wrongAnswers[6][2][0] = "10";
		wrongAnswers[6][2][1] = "25";
		wrongAnswers[6][2][2] = "13";
		
		wrongAnswers[7][2][0] = "America";
		wrongAnswers[7][2][1] = "Loyalty";
		wrongAnswers[7][2][2] = "Dreams";
		
		wrongAnswers[8][2][0] = "Runs the state.";
		wrongAnswers[8][2][1] = "Runs the country.";
		wrongAnswers[8][2][2] = "Runs the world.";
		
		wrongAnswers[9][2][0] = "Abraham Lincoln";
		wrongAnswers[9][2][1] = "Thomas Jefferson";
		wrongAnswers[9][2][2] = "Benjamin Franklin";
		
		
		// 1st grade English
		wrongAnswers[5][3][0] = "X, Y, and Z";
		wrongAnswers[5][3][1] = "L, M, N, O, P";
		wrongAnswers[5][3][2] = "A, B, C, and D";
		
		wrongAnswers[6][3][0] = "5";
		wrongAnswers[6][3][1] = "7";
		wrongAnswers[6][3][2] = "8";
		
		wrongAnswers[7][3][0] = "Aple";
		wrongAnswers[7][3][1] = "Aplle";
		wrongAnswers[7][3][2] = "Appl";
		
		wrongAnswers[8][3][0] = "Hous";
		wrongAnswers[8][3][1] = "Howse";
		wrongAnswers[8][3][2] = "Houce";
		
		wrongAnswers[9][3][0] = "While, Which, and How";
		wrongAnswers[9][3][1] = "Why, Why, Why, Why, and Why";
		wrongAnswers[9][3][2] = "White, Winter, Wild, Warm, and Wizard";
		
		
		// 2nd grade math
		wrongAnswers[10][0][0] = "40";
		wrongAnswers[10][0][1] = "12";
		wrongAnswers[10][0][2] = "88";
		
		wrongAnswers[11][0][0] = "178";
		wrongAnswers[11][0][1] = "250";
		wrongAnswers[11][0][2] = "312";
		
		wrongAnswers[12][0][0] = "5";
		wrongAnswers[12][0][1] = "10";
		wrongAnswers[12][0][2] = "25";
		
		wrongAnswers[13][0][0] = "27 cents";
		wrongAnswers[13][0][1] = "74 cents";
		wrongAnswers[13][0][2] = "17 cents";
		
		wrongAnswers[14][0][0] = "22";
		wrongAnswers[14][0][1] = "104";
		wrongAnswers[14][0][2] = "75";
		
		
		// 2nd grade science
		wrongAnswers[10][1][0] = "Milk";
		wrongAnswers[10][1][1] = "Juice";
		wrongAnswers[10][1][2] = "Soda";
		
		wrongAnswers[11][1][0] = "9";
		wrongAnswers[11][1][1] = "7";
		wrongAnswers[11][1][2] = "10";
		
		wrongAnswers[12][1][0] = "2";
		wrongAnswers[12][1][1] = "4";
		wrongAnswers[12][1][2] = "1";
		
		wrongAnswers[13][1][0] = "Evaporation";
		wrongAnswers[13][1][1] = "Condensation";
		wrongAnswers[13][1][2] = "Acclimation";
		
		wrongAnswers[14][1][0] = "Bird";
		wrongAnswers[14][1][1] = "Lizard";
		wrongAnswers[14][1][2] = "Insect";
		
		
		// 2nd grade history
		wrongAnswers[10][2][0] = "Abraham Lincoln";
		wrongAnswers[10][2][1] = "George Washington";
		wrongAnswers[10][2][2] = "Neil Armstrong";
		
		wrongAnswers[11][2][0] = "Up, Down, Right, Left";
		wrongAnswers[11][2][1] = "Yes, No, Maybe";
		wrongAnswers[11][2][2] = "NW, NE, SW, SE";
		
		wrongAnswers[12][2][0] = "Presedential, Judges, and Juries";
		wrongAnswers[12][2][1] = "Government, Civilian, Citizen";
		wrongAnswers[12][2][2] = "Federal, State, City";
		
		wrongAnswers[13][2][0] = "France";
		wrongAnswers[13][2][1] = "England";
		wrongAnswers[13][2][2] = "Russia";
		
		wrongAnswers[14][2][0] = "New Jersey";
		wrongAnswers[14][2][1] = "Boston";
		wrongAnswers[14][2][2] = "Detroit";
		
		
		// 2nd grade English
		wrongAnswers[10][3][0] = ".";
		wrongAnswers[10][3][1] = "!";
		wrongAnswers[10][3][2] = ",";
		
		wrongAnswers[11][3][0] = "Girafe";
		wrongAnswers[11][3][1] = "Geraffe";
		wrongAnswers[11][3][2] = "Giraph";
		
		wrongAnswers[12][3][0] = "and & but";
		wrongAnswers[12][3][1] = "equals";
		wrongAnswers[12][3][2] = "is a";
		
		wrongAnswers[13][3][0] = "when";
		wrongAnswers[13][3][1] = "because";
		wrongAnswers[13][3][2] = "her";
		
		wrongAnswers[14][3][0] = "The";
		wrongAnswers[14][3][1] = "girl";
		wrongAnswers[14][3][2] = "waited";
		
		
		// 3rd grade math
		wrongAnswers[15][0][0] = "5";
		wrongAnswers[15][0][1] = "7";
		wrongAnswers[15][0][2] = "8";
		
		wrongAnswers[16][0][0] = "11";
		wrongAnswers[16][0][1] = "1";
		wrongAnswers[16][0][2] = "10";
		
		wrongAnswers[17][0][0] = "10";
		wrongAnswers[17][0][1] = "4";
		wrongAnswers[17][0][2] = "0";
		
		wrongAnswers[18][0][0] = "9";
		wrongAnswers[18][0][1] = "10";
		wrongAnswers[18][0][2] = "19";
		
		wrongAnswers[19][0][0] = "243";
		wrongAnswers[19][0][1] = "500";
		wrongAnswers[19][0][2] = "378";
		
		
		// 3rd grade science
		wrongAnswers[15][1][0] = "Mars";
		wrongAnswers[15][1][1] = "America";
		wrongAnswers[15][1][2] = "Virginia";
		
		wrongAnswers[16][1][0] = "Metal";
		wrongAnswers[16][1][1] = "Bronze";
		wrongAnswers[16][1][2] = "Pen";
		
		wrongAnswers[17][1][0] = "Jupiter";
		wrongAnswers[17][1][1] = "Mars";
		wrongAnswers[17][1][2] = "Venus";
		
		wrongAnswers[18][1][0] = "Blue Jay";
		wrongAnswers[18][1][1] = "Dog";
		wrongAnswers[18][1][2] = "Elephant";
		
		wrongAnswers[19][1][0] = "Bee";
		wrongAnswers[19][1][1] = "Butterfly";
		wrongAnswers[19][1][2] = "Ant";
		
		
		// 3rd grade history
		wrongAnswers[15][2][0] = "George Washington";
		wrongAnswers[15][2][1] = "Theodore Roosevelt";
		wrongAnswers[15][2][2] = "Jimmy Carter";
		
		wrongAnswers[16][2][0] = "George Washington";
		wrongAnswers[16][2][1] = "Thomas Jefferson";
		wrongAnswers[16][2][2] = "Benjamin Franklin";
		
		wrongAnswers[17][2][0] = "Virginia Beach";
		wrongAnswers[17][2][1] = "Hampton";
		wrongAnswers[17][2][2] = "D.C.";
		
		wrongAnswers[18][2][0] = "James Madison";
		wrongAnswers[18][2][1] = "Thomas Jefferson";
		wrongAnswers[18][2][2] = "Benjamin Franklin";
		
		wrongAnswers[19][2][0] = "Hawii";
		wrongAnswers[19][2][1] = "Washington";
		wrongAnswers[19][2][2] = "Main";
		
		// 3rd grade English
		wrongAnswers[15][3][0] = "Cactuses";
		wrongAnswers[15][3][1] = "Cactus";
		wrongAnswers[15][3][2] = "Cacties";
		
		wrongAnswers[16][3][0] = "her";
		wrongAnswers[16][3][1] = "me";
		wrongAnswers[16][3][2] = "us";
		
		wrongAnswers[17][3][0] = "us";
		wrongAnswers[17][3][1] = "he";
		wrongAnswers[17][3][2] = "she";
		
		wrongAnswers[18][3][0] = "to";
		wrongAnswers[18][3][1] = "two";
		wrongAnswers[18][3][2] = "2";
		
		wrongAnswers[19][3][0] = "Their";
		wrongAnswers[19][3][1] = "There";
		wrongAnswers[19][3][2] = "Thare";
		
		// 4th grade math
		wrongAnswers[20][0][0] = "3/7";
		wrongAnswers[20][0][1] = "1/7";
		wrongAnswers[20][0][2] = "7/7";
		
		wrongAnswers[21][0][0] = "1";
		wrongAnswers[21][0][1] = "2";
		wrongAnswers[21][0][2] = "4";
		
		wrongAnswers[22][0][0] = "75";
		wrongAnswers[22][0][1] = "150";
		wrongAnswers[22][0][2] = "110";
		
		wrongAnswers[23][0][0] = "1";
		wrongAnswers[23][0][1] = "10";
		wrongAnswers[23][0][2] = "22";
		
		wrongAnswers[24][0][0] = "1/4";
		wrongAnswers[24][0][1] = "1/3";
		wrongAnswers[24][0][2] = "1";
		
		// 4th grade science
		wrongAnswers[20][1][0] = "0";
		wrongAnswers[20][1][1] = "2";
		wrongAnswers[20][1][2] = "3";
		
		wrongAnswers[21][1][0] = "Dog";
		wrongAnswers[21][1][1] = "Seagull";
		wrongAnswers[21][1][2] = "Lion";
		
		wrongAnswers[22][1][0] = "Glue";
		wrongAnswers[22][1][1] = "Weight";
		wrongAnswers[22][1][2] = "Magic";
		
		wrongAnswers[23][1][0] = "A pokemon";
		wrongAnswers[23][1][1] = "A color";
		wrongAnswers[23][1][2] = "A form of gas";
		
		wrongAnswers[24][1][0] = "Neptune";
		wrongAnswers[24][1][1] = "Pluto";
		wrongAnswers[24][1][2] = "Planet X";
		
		// 4th grade history
		wrongAnswers[20][2][0] = "5";
		wrongAnswers[20][2][1] = "6";
		wrongAnswers[20][2][2] = "8";
		
		wrongAnswers[21][2][0] = "Rosa Park";
		wrongAnswers[21][2][1] = "Martin Luther King";
		wrongAnswers[21][2][2] = "Django";
		
		wrongAnswers[22][2][0] = "United States and England";
		wrongAnswers[22][2][1] = "England and Soviet Union";
		wrongAnswers[22][2][2] = "France and England";
		
		wrongAnswers[23][2][0] = "5";
		wrongAnswers[23][2][1] = "6";
		wrongAnswers[23][2][2] = "8";
		
		wrongAnswers[24][2][0] = "1968";
		wrongAnswers[24][2][1] = "1970";
		wrongAnswers[24][2][2] = "1971";
		
		// 4th grade English
		wrongAnswers[20][3][0] = "Rap";
		wrongAnswers[20][3][1] = "Rapid";
		wrongAnswers[20][3][2] = "idly";
		
		wrongAnswers[21][3][0] = "Beaut";
		wrongAnswers[21][3][1] = "tiful";
		wrongAnswers[21][3][2] = "ful";
		
		wrongAnswers[22][3][0] = "Mom started cutting up carrots celery and peppers.";
		wrongAnswers[22][3][1] = "Mom started cutting up carrots celery, and peppers.";
		wrongAnswers[22][3][2] = "Mom started cutting up carrots, celery and peppers.";
		
		wrongAnswers[23][3][0] = "A";
		wrongAnswers[23][3][1] = "Two";
		wrongAnswers[23][3][2] = "These";
		
		wrongAnswers[24][3][0] = "a";
		wrongAnswers[24][3][1] = "the";
		wrongAnswers[24][3][2] = "two";
		
		// 5th grade math
		wrongAnswers[25][0][0] = "352";
		wrongAnswers[25][0][1] = "235";
		wrongAnswers[25][0][2] = "523";
		
		wrongAnswers[26][0][0] = "270";
		wrongAnswers[26][0][1] = "175";
		wrongAnswers[26][0][2] = "140";
		
		wrongAnswers[27][0][0] = "1667";
		wrongAnswers[27][0][1] = "667";
		wrongAnswers[27][0][2] = "12,000";
		
		wrongAnswers[28][0][0] = "1 4/5";
		wrongAnswers[28][0][1] = "11/15";
		wrongAnswers[28][0][2] = "2 2/5";
		
		wrongAnswers[29][0][0] = "4 1/2 cups";
		wrongAnswers[29][0][1] = "3 4/4 cups";
		wrongAnswers[29][0][2] = "2 cups";
		
		// 5th grade science
		wrongAnswers[25][1][0] = "Condensation";
		wrongAnswers[25][1][1] = "Freezing";
		wrongAnswers[25][1][2] = "Melting";
		
		wrongAnswers[26][1][0] = "Gender";
		wrongAnswers[26][1][1] = "Health";
		wrongAnswers[26][1][2] = "Polution";
		
		wrongAnswers[27][1][0] = "0";
		wrongAnswers[27][1][1] = "1";
		wrongAnswers[27][1][2] = "3";
		
		wrongAnswers[28][1][0] = "Dirt, Mud, Gravel, and Rock";
		wrongAnswers[28][1][1] = "Soil, Clay, Limestone, and Stone";
		wrongAnswers[28][1][2] = "Soil, Mud, Plant Material, and Hardrock";
		
		wrongAnswers[29][1][0] = "Quartz";
		wrongAnswers[29][1][1] = "Glass";
		wrongAnswers[29][1][2] = "Lava Rock";
		
		// 5th grade history
		wrongAnswers[25][2][0] = "Virginia";
		wrongAnswers[25][2][1] = "Maryland";
		wrongAnswers[25][2][2] = "New York";
		
		wrongAnswers[26][2][0] = "2 years";
		wrongAnswers[26][2][1] = "3 years";
		wrongAnswers[26][2][2] = "5 years";
		
		wrongAnswers[27][2][0] = "The Big War";
		wrongAnswers[27][2][1] = "The Terrible War";
		wrongAnswers[27][2][2] = "The War of Worlds";
		
		wrongAnswers[28][2][0] = "Colonists dumped tea into the harbor";
		wrongAnswers[28][2][1] = "A very famous painting";
		wrongAnswers[28][2][2] = "British troops killed by colonists";
		
		wrongAnswers[29][2][0] = "Harriet Tubman";
		wrongAnswers[29][2][1] = "Martin Luther King";
		wrongAnswers[29][2][2] = "Martin Luther King Jr";
		
		// 5th grade English
		wrongAnswers[25][3][0] = "an";
		wrongAnswers[25][3][1] = "Crocodile";
		wrongAnswers[25][3][2] = "saw";
		
		wrongAnswers[26][3][0] = "The";
		wrongAnswers[26][3][1] = "cats";
		wrongAnswers[26][3][2] = ".";
		
		wrongAnswers[27][3][0] = "Before";
		wrongAnswers[27][3][1] = "Josh";
		wrongAnswers[27][3][2] = "pen";
		
		wrongAnswers[28][3][0] = "Last winter school got canceled, twice.";
		wrongAnswers[28][3][1] = "Last winter school, got canceled twice.";
		wrongAnswers[28][3][2] = "Last, winter school got canceled twice.";
		
		wrongAnswers[29][3][0] = "I";
		wrongAnswers[29][3][1] = "like & doing";
		wrongAnswers[29][3][2] = "and";
	}
	
	// set correct answer with same index as question
	public static void setAnsArray(int row, int col) {
			
			corrAns = answers[row][col];
			
		}
	
	// return correct answer
	public static String getAnsArray() {
		
		return corrAns;
		
	}
	
	// set wrong answer with same index as question
	public static void setWrgArray(int row, int col) {
			
			wrgAnsOne = wrongAnswers[row][col][0];
			wrgAnsTwo = wrongAnswers[row][col][1];
			wrgAnsThree = wrongAnswers[row][col][2];
			
		}
	
	// return wrong answer 1
	public static String getWrgAnsOne() {
		
		return wrgAnsOne;
		
	}
	
	// return wrong answer 2
	public static String getWrgAnsTwo() {
		
		return wrgAnsTwo;
		
	}
	
	// return wrong answer 3
	public static String getWrgAnsThree() {
		
		return wrgAnsThree;
		
	}

}
