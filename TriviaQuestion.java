/*
 * Program that gives the user Trivia questions and lets them know whether
 * their answer was correct or incorrect 
 * @author momin choudhry
 *
 */


// Class called TriviaQuestion
public class TriviaQuestion {

	// Fields
	private String question;
	private String answer;
	private int points;
	  
	// Constructor
	TriviaQuestion(String question, String answer, int value) {
		this.question = question;
		this.answer = answer;
		this.points = value;
	}
	  
	// Method that returns question variable
	public String getQuestion() {
		return this.question;
	}
	// Method that returns answer variable  
	public String getAnswer() {
		return this.answer;
	}
	// Method that returns value variable 
	public int getValue() {
		return this.points;
	}
	
}
