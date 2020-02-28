/*+
 * Program that gives the user Trivia questions and lets them know whether
 * their answer was correct or incorrect 
 * @author momin choudhry
 *
 */


import java.util.*;
	// Class that determines whether answer is correct or incorrect 
	public class TriviaGame {
		
	// Fields 
	private TriviaQuestion questions[];
	private int score; 
	private int questionNumber;
	  
	// Constructor 
	public TriviaGame(TriviaQuestion questions[]) {
		this.questions = Arrays.copyOf(questions, questions.length);
		this.score = 0;
		this.questionNumber = 0;
	}
	
	/**
	 * Method that prints each of the question and tells whether the answer
	 * was correct or incorrect 
	 * @return True or false
	 */
	public boolean askNextQuestion() {
		// Add one to QuestionNumber
		this.questionNumber++;
		// If the question Number is greater than the length, return false 
		if(this.questionNumber > questions.length) {
			return false;
		}
		// Create scanner 
		Scanner console = new Scanner(System.in);
		// Hold the question in variable called question
		String question = questions[questionNumber-1].getQuestion();
		// Hold the answer in variable called answer
		String answer = questions[questionNumber-1].getAnswer();
		// Hold points in the variable called points 
		int points = questions[questionNumber-1].getValue();
		// Print out the Question number 
		System.out.printf("\nQuestion %d\n", questionNumber);
		// Let user know how many points this question is worth 
		System.out.print("For " + points + " point... ");
		// Print the question 
		System.out.println(question);
		// Hold users input in user
		String user = console.nextLine();
		// If user equals answer, print that is correct 
		if(user.equalsIgnoreCase(answer)) {
	  
			System.out.println("That is correct!");
			this.score += points;
		}
		// Otherwise, let user know his/her answer was incorrect and 
		// print the correct answer
		else
			System.out.println("Wrong. The correct answer is " + answer);
			// Print their current score
			showScore();
			// Return true
			return true;
	}
	// Prints the users score 
	public void showScore() {
		System.out.println("Your score is " + score);
	}
	// resets score and question number to 0 
	public void restart() {
	  	score = 0;
	  	questionNumber = 0;
	}
	// Method that returns the score   
	public int getScore() {
		return score;
	}
	
	
	
}
