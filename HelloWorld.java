import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) throws Exception{
		// Course:  CSE 201, Introduction to Software Engineering
		// Semester:  Summer, 2020; Miami University
		// Students submitting the project:  Matthew J. Huberty, Tae Jin Kim, Austin Stanley, Lane Rizkallah, Xinrui Xie
		
		//Display a welcome message to the user:
		System.out.println("Welcome to the Name Searcher Application!");
		
		//Declare some variables and instantiate some objects
		String input = "";
		int intInput = 0;
		//Create and instantiate a Scanner Object	
		BufferedReader scnInput = new BufferedReader(new InputStreamReader(System.in));
		//Create a new File instance
		java.io.File boyFile = new java.io.File("boys_names.txt");
		java.io.File girlFile = new java.io.File("girls_names.txt");
		//Create a new Scanner for the files
		Scanner input_Boy = new Scanner(boyFile);
		Scanner input_Girl = new Scanner(girlFile);
		
		
		//Enter into a loop and make a decision about what to do, based on user input.
		do {
			//Print out the program menu
			System.out.println("Menu:  ");
			System.out.println("    1.  Read Girl Name");
			System.out.println("    2.  Read Boy Name");
			System.out.println("    3.  Check if the name is among the most popular.");
			System.out.println("    4.  Check if the name is contained in (substring) any of the most popular names.");
			System.out.println("    5.  Exit.");
			System.out.println(" Option:  ");
			//Assign the input from the user
			try{
				//Grab input from the user
				input = scnInput.readLine();
				//Parse the input into an integer.  If it is not an integer, then throw an exception
				intInput = Integer.parseInt(input);
				switch(intInput) {
				case 1:  
					//Instantiate a new Name Object
					Name GirlsNames = new Name("girl");
					while (input_Girl.hasNext()) {
						//Add all of the girl's names to an array list
						GirlsNames.addNames(input_Girl.next());
					}
					System.out.println(GirlsNames);
					break;
				case 2:
					//Instantiate a new Name Object
					Name BoysNames = new Name("boy");
					while (input_Boy.hasNext()) {
						//String strFirstName = input_Boy.next();
						BoysNames.addNames(input_Boy.next());
					}
					System.out.println(BoysNames);
					break;
				case 3:  
					System.out.println("Call the Check Popular Names Method.");
					break;
				case 4:
					System.out.println("Call the Check substring Method.");
					break;
				case 5:
					//Do nothing and prepare to break out of the loop
					break;
				default:
					System.out.println("Invalid input.");
					break;
				}
			}
			catch(NumberFormatException e){
				//Display a message to the user, instructing them to enter valid input. 
				System.out.println("The input you entered is not valid.  Please enter an integer from 1 - 5.");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		
			
		}while (intInput != 5 );
		//Thank the user for using the application
		System.out.println("Thanks for using the application.");
		//Close the files
		input_Boy.close();
		input_Girl.close();
		
	}

}
