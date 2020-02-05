/**
 * Program that gives the user Trivia questions and lets them know whether
 * their answer was correct or incorrect 
 * @author momin choudhry
 *
 */


// Import Scanner 
import java.util.Scanner;
// Class called TriviaDriver
// Holds the main method 
public class TriviaDriver {
	
   // Main method that calls the playGame method 
   public static void main(String[] args) {
	   Scanner console = new Scanner(System.in);
	   TriviaDriver trivia = new TriviaDriver();
	   trivia.playGame(console);
   
   }
   /**
    * Method that keeps count of the games played, the total score, 
    * and the average score 
    * @param console
    */
   public void playGame(Scanner console) {
	   // Initialize games to 0
	   int games = 0;
	   // Initialize totalSocre to 0
	   int totalScore = 0;
	   // Variable that holds the averageScore
	   double averageScore = 0;
	   // Create object of TriviaGame with populateQuestions as a parameter
	   TriviaGame gameObject = new TriviaGame(populateQuestions());
	   // While true
	   while(true) {
	   // Add one to games
	   games++;
	   		// While GameObject.askNextQuestion is true
	   		while(gameObject.askNextQuestion()){}
	   		// Add totalScore to GameObject.getScore()
	   		totalScore += gameObject.getScore();
	   		// Reset the score to 0
	   		// Reset the questions to 0 
	   		gameObject.restart();
	   		// Print Game Over And ask if user wants to play again 
	   		System.out.println("Game over! Would you like to play again?\n(Yes/No):");
	   		// Hold user input in choice variable 
	   		String choice = console.next();
	   		// If choice is equal to No or not yes, break
	  if(choice.equalsIgnoreCase("No") || !choice.equalsIgnoreCase("Yes")) {
	   				break;
	   		}
	   }
	   // Find average score by dividing totalScore by games
	   averageScore = (double) totalScore/games;
	   // Prints the amount of games and the average score 
	   System.out.println("You played " + games + " games and your average score was " + averageScore
		              + ". Thank you for playing, have a great day!");
  }
  
   /**
    * Method that creates 5 objects of TriviaQuestion 
    * with question, answer, and point value 
    * @return an array of all questions, answers, and point value  
    */
   public TriviaQuestion[] populateQuestions() {
  
	   TriviaQuestion question1 = new TriviaQuestion
			   ("How many tournaments has Tiger Woods won? ", "82", 1);
  
	   TriviaQuestion question2 = new TriviaQuestion
			   ("What's Obamas first name? ", "barack", 2);
  
	   TriviaQuestion question3 = new TriviaQuestion
			   ("How old is the Earth? (Just enter number) ", "4.6", 2);
  
	   TriviaQuestion question4 = new TriviaQuestion
			   ("How old is Donald Trump? ", "73", 3);
  
	   TriviaQuestion question5 = new TriviaQuestion
			   ("Who is the funniest person on TikTok? ", "thebeardedtwinz", 1);
  
	   return new TriviaQuestion[] {question1, question2, question3, question4, question5};
   }
}
